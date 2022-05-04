package com.postApp.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.jni.User;
import com.mysql.cj.protocol.Resultset;
import com.postApp.model.Comment;
import com.postApp.model.Users;

public class postAppDAO extends SQLConnection{
	Users user;
	//to register a user
	public void createUser(Users usr) throws ClassNotFoundException, SQLException
	{		
		String query="INSERT INTO userDetails(email,password,secretCode)"+"VALUES(?,?,?)";
		PreparedStatement st =getConnection().prepareStatement(query);
		st.setString(1,usr.getEmail());
		st.setString(2,usr.getPassword());
		st.setString(3,usr.getSecret());
		st.executeUpdate();
	}
	//get details of all users
	public ArrayList<Users> viewAllUsers() throws ClassNotFoundException, SQLException
	{
		String query="SELECT * FROM userDetails";
		Statement  st=getConnection().createStatement();
		Resultset rs=(Resultset) st.executeQuery(query);
		ArrayList<Users>results=new ArrayList<>();
		while(((ResultSet) rs).next())
		{
			String email=((ResultSet) rs).getString("email");
			String password=((ResultSet) rs).getString("password");
			String secretCode=((ResultSet) rs).getString("secretCode");
			user=new Users(email,password,secretCode);
			results.add(user);
		}
		return results;
	}
	//to check whether email exist already or not
	public boolean emailExist(String email) throws ClassNotFoundException, SQLException
	{
		String query="SELECT email FROM userDetails";
		Statement  st=getConnection().createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
			if(rs.getString(1).equals(email))
			{
				return true;
			}
		}
		return false;
	}
}
