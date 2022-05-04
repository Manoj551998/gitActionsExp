package com.postApp.services;

import java.sql.SQLException;
import java.util.ArrayList;

import com.postApp.dao.postAppDAO;
import com.postApp.model.Users;

public class LoginVerification {

	public boolean validate(String email, String password) throws ClassNotFoundException, SQLException {
		postAppDAO daoResults=new postAppDAO();
		ArrayList<Users> al=daoResults.viewAllUsers();
		for(Users als:al)
		{
			if(als.getEmail().equals(email) && als.getPassword().equals(password))
			{
				return true;
			}
		}
		return false;
	}
	public String getPassword(String email,String secretCode) throws ClassNotFoundException, SQLException
	{
		postAppDAO daoResults=new postAppDAO();
		ArrayList<Users> al=daoResults.viewAllUsers();
		
		for(Users als:al)
		{
			if(als.getEmail().equals(email)&&als.getSecret().equals(secretCode))
			{
				return als.getPassword();
			}
		}
		return null;
	}
	

}
