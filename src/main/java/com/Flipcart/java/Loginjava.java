package com.Flipcart.java;

import java.util.TreeSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Flipcart.pages.Login;
import com.utility.Base;

public class Loginjava  {

	static WebDriver driver ;
	@Test
	public static void LoginPage() throws Exception
	{
		Base.Startup("https://www.flipkart.com");
		System.out.println("snnjas");
		
		System.out.println("enter the username and password");
		
		Login login = PageFactory.initElements(driver, Login.class);
		login.Loginactivity();
		System.out.println("Login successfully");
		
		
		
	}
	
	
	
	
}
