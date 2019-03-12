package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Selenium {

	
	@Test
	public void TestDb() throws ClassNotFoundException, SQLException
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
	Connection con	=DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium1","root","selenium");
		System.out.println("connection loaded");
		
		Statement st = con.createStatement();
		
		ResultSet re = st.executeQuery("Select * from selenium1.vss   where ID = 2  ");  
		
		while (re.next())
		{
			
		
			String Id = re.getString(1);
			System.out.println("Id");
			
			
			
		}
		re.close();
		st.close();
		con.close();
		System.out.println("database closed");
		
		
		
		
		
		
		
	}
}
