package com.db;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datap {

	
	
	
	@BeforeClass
	public  void M1()
	{
		
		System.out.println("before class called");
		
		
	}
	@BeforeTest
	public  void M21()
	{
		System.out.println("before testmathod1");
		
		
	}
	@BeforeMethod
	public  void M2()
	{
		System.out.println("before mathod");
		
		
	}
	@Test
	public  void M3()
	{
		System.out.println("test mathod called");
		
		
	}
	
	@AfterClass
	public  void M4()
	{
		System.out.println("afterclass");
		
		
	}
	@AfterMethod
	public  void M5()
	{
		System.out.println("aftermathod");
		
		
	}
	
	
}
