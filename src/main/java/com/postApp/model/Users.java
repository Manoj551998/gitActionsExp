package com.postApp.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Users {
	@Pattern(regexp="^(.+)@(.+)$",message="Invalid Email format")
	private String email;
	@Size(min=4,message="Password length should be more than 3 chars")
	private String password;
	@Size(min=2,message="Secret length should be more than 3 chars")
	private String secret;
	
	public Users()
	{
		
	}
	public Users(String email,String password,String secret) {
		this.email = email;
		this.password = password;
		this.secret = secret;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
}
