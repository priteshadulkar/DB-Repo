package com.db;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class MMT {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver2.44\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.makemytrip.com/");
		System.out.println("MMT Home page Open");
		Reporter.log("MMT Home page Open");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		System.out.println("Sorce station tab is clicked");
		
		
//driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).c
System.out.println("mumbai selected");
		
		
		
		
	}
	
}
