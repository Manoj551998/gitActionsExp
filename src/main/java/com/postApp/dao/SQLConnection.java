package com.postApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {

	//connection establishing
	 protected static Connection getConnection()throws SQLException, ClassNotFoundException
	    {
	        // Initialize all the information regarding
	        // Database Connection
	        String dbDriver = "com.mysql.cj.jdbc.Driver";
	        String dbURL = "jdbc:mysql://localhost:3306/postApp?autoReconnect=true&useSSL=false";
	        // Database name to access
	        String dbUsername = "root";
	        String dbPassword = "";
	        //System.out.println("connecting");
	        Class.forName(dbDriver);
	        Connection con =DriverManager.getConnection(dbURL,dbUsername,dbPassword);
	        //System.out.println("Connection created");
	        return con;
	    }
}
