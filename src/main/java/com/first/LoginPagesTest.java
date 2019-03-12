package com.first;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPagesTest extends Homepage {

	
	static String username = "//input[@class='_2zrpKA']" ;
	static String Password =  "//input[ @class= '_2zrpKA _3v41xv']" ;
	static String    btn   =  "//*[ @class='_2AkmmA _1LctnI _7UHT_c'] ";
	
	
	public static void Login(String un ,String pw)
	{
		
        driver.findElement(By.xpath(username)).sendKeys(un);
        driver.findElement(By.xpath(Password)).sendKeys(pw);
        driver.findElement(By.xpath(btn)).click();
        System.out.println("Login successfully");
		
	}
	
	
}
