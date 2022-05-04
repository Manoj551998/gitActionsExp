package com.postApp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String indexPage() 
	{	
		return "index";
	}
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String loginPage() 
	{	
		return "login";
	}
	@RequestMapping(value="/signup",method = RequestMethod.GET)
	public String signupPage() 
	{	
		return "index";
	}
	@RequestMapping(value="/forgotPassword",method = RequestMethod.GET)
	public String forgotPasswordPage() 
	{	
		return "forgetPassword";
	}
	@RequestMapping(value="/comments",method = RequestMethod.GET)
	public String commentsPage() 
	{	
		return "comments";
	}
	
}
