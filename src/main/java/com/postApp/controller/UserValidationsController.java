package com.postApp.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.postApp.apiResponse.ApiResponse;
import com.postApp.dao.postAppDAO;
import com.postApp.model.Users;
import com.postApp.services.LoginVerification;

@Controller
public class UserValidationsController {
	@RequestMapping(value="/login",method = RequestMethod.POST,produces = "application/json")
	public ResponseEntity<ApiResponse> loginUser(@RequestBody Users user, HttpServletResponse response) throws ClassNotFoundException, SQLException
	{
	LoginVerification validation=new LoginVerification();
	ApiResponse apiresponse=new ApiResponse();
	if(validation.validate(user.getEmail(),user.getPassword()))
	{
		 Cookie cookie = new Cookie("email",user.getEmail());
		 cookie.setMaxAge(2 * 24 * 60 * 60);
		 cookie.setSecure(true);
		 cookie.setHttpOnly(true);
		 response.addCookie(cookie);
		 apiresponse.setStatus(200);
		 apiresponse.setMessage("login success");
		 return new ResponseEntity<ApiResponse>(apiresponse,HttpStatus.OK);
	}
	else
	{			
		apiresponse.setStatus(204);
		apiresponse.setMessage("Invalid username password");
		return new ResponseEntity<ApiResponse>(apiresponse,HttpStatus.NOT_FOUND);
	}
	}
	
	@RequestMapping(value="/logout",method = RequestMethod.GET,produces = "application/json")
	public ResponseEntity<ApiResponse> loginUser(HttpServletResponse response) throws ClassNotFoundException, SQLException
	{
		Cookie ck=new Cookie("email","");  
		ck.setMaxAge(0);  
		response.addCookie(ck);  
		ApiResponse apiresponse=new ApiResponse();
		apiresponse.setStatus(200);
		apiresponse.setMessage("logout success");
		return new ResponseEntity<ApiResponse>(HttpStatus.OK);
	}
	@RequestMapping(value="/forgotPassword",method = RequestMethod.POST,produces = "application/json")
	public ResponseEntity<ApiResponse> loginUser(@RequestBody Users user) throws ClassNotFoundException, SQLException
	{
	LoginVerification validation=new LoginVerification();
	ApiResponse apiresponse=new ApiResponse();
	String password=validation.getPassword(user.getEmail(), user.getSecret());
	ArrayList<String> al=new ArrayList<>();
	if(password!=null) {
		al.add(password);
		apiresponse.setData(al);
		apiresponse.setStatus(200);
		apiresponse.setMessage("get success");
		return new ResponseEntity<ApiResponse>(apiresponse,HttpStatus.ACCEPTED);
		}
	else 
	{
		al.add(password);
		apiresponse.setData(al);
		apiresponse.setStatus(404);
		apiresponse.setMessage("get notsuccess");
		return new ResponseEntity<ApiResponse>(apiresponse,HttpStatus.NOT_FOUND);
	}
	}
}
