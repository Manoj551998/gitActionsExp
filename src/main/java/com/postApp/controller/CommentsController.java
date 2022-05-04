package com.postApp.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.postApp.apiResponse.ApiResponse;
import com.postApp.dao.CommentsDAO;
import com.postApp.dao.postAppDAO;
import com.postApp.model.Comment;
@Controller
public class CommentsController {
	@RequestMapping(value="/Comment",method = RequestMethod.POST,produces = "application/json")
	public ResponseEntity<ApiResponse> loginUser(@RequestBody Comment comment,@CookieValue("email") String emailFromCookie) throws ClassNotFoundException, SQLException
	{
		comment.setEmail(emailFromCookie);
		ApiResponse apiresponse=new ApiResponse();
		CommentsDAO dao=new CommentsDAO();
		apiresponse.setStatus(200);
		apiresponse.setMessage("comment added");
		dao.createPost(comment);
		return new ResponseEntity<ApiResponse>(apiresponse,HttpStatus.OK);
	}
	
	@RequestMapping(value="/Comments",method = RequestMethod.GET,produces = "application/json")
	public ResponseEntity<ApiResponse> getComments() throws ClassNotFoundException, SQLException
	{
		CommentsDAO dao=new CommentsDAO();
		ArrayList<String> comments=new ArrayList<>();
		comments.addAll(dao.getCommentList());
		ApiResponse apiresponse=new ApiResponse();
		apiresponse.setData(comments);
		apiresponse.setStatus(200);
		apiresponse.setMessage("get success");
		return new ResponseEntity<ApiResponse>(apiresponse,HttpStatus.OK);
	}
	
	
}
