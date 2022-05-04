package com.postApp.controller;

import java.sql.SQLException;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.postApp.apiResponse.ApiResponse;
import com.postApp.dao.postAppDAO;
import com.postApp.model.Users;
//This is for checking branch protection.
@Controller
public class RegisterController {
	@RequestMapping(value="/register",method = RequestMethod.POST,produces = "application/json")
	public ResponseEntity<ApiResponse> registerUser(@Valid @RequestBody Users user) throws ClassNotFoundException, SQLException
	{
		postAppDAO dao=new postAppDAO();
		ApiResponse apiresponse=new ApiResponse();
		if(dao.emailExist(user.getEmail()))
		{
			 apiresponse.setStatus(409);
			 apiresponse.setMessage("Email already exist");
			 return new ResponseEntity<ApiResponse>(apiresponse,HttpStatus.CONFLICT);
		}
		else
		{
			dao.createUser(user);
			apiresponse.setStatus(201);
			apiresponse.setMessage("registered successfully");
			return new ResponseEntity<ApiResponse>(HttpStatus.OK);
		}
	}
}
