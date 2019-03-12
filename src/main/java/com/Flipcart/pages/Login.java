package com.Flipcart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.utility.Base;

public class Login {

	  static WebDriver driver ;
	
	@FindBy(how= How.XPATH , using = "//input[@class= '_2zrpKA']")
	public static WebElement search;
	
	@FindBy(how= How.XPATH , using = "//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	public static WebElement cont ;

	
	@FindBy(how= How.XPATH , using = "//input[ @class= '_2zrpKA _3v41xv']")
	public static WebElement password ;
	
	@FindBy(how= How.XPATH , using = "//button[ @class= '_2AkmmA _1LctnI _7UHT_c']")
	public static WebElement Loginbtn ;
	
	
	public Login(WebDriver driver)
	{
		
		this.driver = driver ;
		
	}
	
	
	public static void Loginactivity() throws Exception
	{
		System.out.println("asndjksdSADN");
		
		Login login = PageFactory.initElements(driver, Login.class);
		//login.search.sendKeys("9028462080");
		//login.cont.clear(); 
		login.password.sendKeys("pritesh30");
		login.Loginbtn.click();
		Thread.sleep(2000);
		
		System.out.println("Login successfully");
		Reporter.log("Login Successfully");
		
	}
}












//   
