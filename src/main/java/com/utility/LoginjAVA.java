package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DataBase.DBSelenium.LoginS;
import DataBase.DBSelenium.simple;

public class LoginjAVA {

	public static WebDriver driver ;
	
	@Test
	public static void  logina() throws Exception {
		
		
		simple sp = PageFactory.initElements(driver, simple.class);
		LoginS login= PageFactory.initElements(driver, LoginS.class);
		sp.Startup();
		login.Login();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
