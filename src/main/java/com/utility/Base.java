package com.utility;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Flipcart.pages.Login;

public class Base {

	static WebDriver driver ;
	
	static String url = "https://www.flipkart.com" ;
	@FindBy(how= How.XPATH , using = "//input[ @class= '_2zrpKA']")
	public static WebElement search;
	 public static String us ="//input[ @class= '_2zrpKA']" ;
	
	public static void Startup(String url) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver2.44\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.navigate().to(url);
		Thread.sleep(4000);
		driver.manage().window().maximize();
		System.out.println("Flipcart Pages opened");
		Reporter.log("Flipcart Pages opened");

		
  
		
		
		
	driver.findElement(By.xpath("//input[ @class= '_2zrpKA']")).sendKeys("9028462080");
	
	driver.findElement(By.xpath("//input[ @class= '_2zrpKA _3v41xv']")).sendKeys("pritesh30");
	driver.findElement(By.xpath("//button[ @class= '_2AkmmA _1LctnI _7UHT_c']")).click();
	System.out.println("login");
	
	
	 
	}

	
}
