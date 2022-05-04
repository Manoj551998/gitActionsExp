package com.postApp.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.postApp.model.Comment;

public class CommentsDAO  extends SQLConnection{
	
	//to create new post
	public void createPost(Comment cmt) throws ClassNotFoundException, SQLException
	{
		String query="INSERT INTO comments(email,comments)"+"VALUES(?,?)";
		PreparedStatement st =getConnection().prepareStatement(query);
		st.setString(1,cmt.getEmail());
		st.setString(2,cmt.getComments());
		st.executeUpdate();
	}
	//to get all posts
	public List<String> getCommentList() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String query="SELECT * FROM comments";
		Statement  st=getConnection().createStatement();
		ResultSet rs=st.executeQuery(query);
		ArrayList<String>results=new ArrayList<>();		
		while(rs.next())
		{
			  String str= rs.getString(2)+"-"+rs.getString(1);       
			  results.add(str);       
		 }
		return results;
	}
}
