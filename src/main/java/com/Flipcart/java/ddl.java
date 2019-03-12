package com.Flipcart.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.first.Homepage;
import com.mysql.jdbc.Driver;

public class ddl extends Homepage{

	@Test
	public void Loginap() throws Exception
	{
		
		Homepage.openbrowser();
		System.out.println("homepage opened");
	    driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	    WebElement el = driver.findElement(By.xpath("//*[text()='More']"));
	    Actions a =  new Actions(driver);
	    a.moveToElement(el).build().perform();
	    driver.findElement(By.xpath("//*[text()='Advertise']")).click();
	    System.out.println("mouse iver activity perform");
	}
}
