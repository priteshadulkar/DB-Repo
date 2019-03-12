package com.Flipcart.java;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.first.Homepage;

public class actions extends Homepage{

	@Test
	public static void ddl()
	{
		
		Homepage.openbrowser();
		 driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Select sl = new Select(driver.findElement(By.xpath("//select[@class='fPjUPw']//preceding::select")));
		sl.selectByIndex(2);
		System.out.println("2 value");
		
		
		
	}
	
	
}
