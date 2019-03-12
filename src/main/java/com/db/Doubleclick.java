package com.db;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Doubleclick {

	 public WebDriver driver  ;
	 @Test
	 public void Double() throws Exception
	 {
		 System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver2.44\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.navigate().to("http://demo.guru99.com");
         System.out.println("http://demo.guru99.com/test/simple_context_menu.html");
         driver.manage().window().maximize();
         Thread.sleep(2000);
         
         // right click
         
         WebElement el = driver.findElement(By.xpath("//*[text()='Double-Click Me To See Alert']"));
         Actions a = new Actions(driver);
         a.doubleClick(el).perform();
         Thread.sleep(2000);
         System.out.println("Double Clicked has clicked");
         
         
         
		 
		 
		 
	 }
}
