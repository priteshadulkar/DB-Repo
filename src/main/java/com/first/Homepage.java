package com.first;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Homepage {

	
	public static WebDriver driver ;
	
	@Test
	public static void openbrowser()
	{

	     System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver2.44\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println("Flipcart page is opened");
		Reporter.log("Flipcart page is opened");
		System.out.println(driver.getTitle());
		
	 }
	
	
	
}
