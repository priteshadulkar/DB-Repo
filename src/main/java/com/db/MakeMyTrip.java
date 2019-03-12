package com.db;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\neelam\\selenium\\chromedriver.exe");

		// System.setProperty("webdriver.gecko.driver","C:/neelam/selenium/geckodriver.exe");

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver2.44\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Make my trip Home page open");

		driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']")).clear();
		driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']")).click();
		System.out.println("Select City");
		
		
	      Thread.sleep(4000);
	      System.out.println("page is scroll");
	      
	      // Source 
		//To select all data from List Box ...........//
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ui-id-1']/child::li"));
		System.out.println("size of list " + list.size());		
		 for (WebElement ir : list) 
		{
			 String value = ir.getText();			
			System.out.println("-> " + value);
			if (value.contains("Bangalore, India")) {
				ir.click();
				break ;
					
		}
		 
		 //Destination
		Thread.sleep(4000);		
		 driver.findElement(By.xpath("//input[@id='hp-widget__sTo']")).clear();
		 WebElement des = driver.findElement(By.xpath("//input[@id='hp-widget__sTo']"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", des);
		 
		 List<WebElement> el= driver.findElements(By.xpath("//ul[@id='ui-id-2']/child::li"));
		   for(WebElement jk:el)
		     {
		        String value2   =jk.getText();
		        System.out.println(value2);
		        Thread.sleep(2000);
		        	if(value2.contains("Mumbai, India")){
		        			jk.click();		        			
		        			break ;
		                }
		     }
	}
	}
}



