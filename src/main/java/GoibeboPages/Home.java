package GoibeboPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

import Goibebo.OpenBrowser;

public class Home extends OpenBrowser{ 

	static String source ="//input[@id='gosuggest_inputSrc']" ;
	static String distanation ="//input[@placeholder='Destination'] "  ;
	static String date= "//input[@placeholder='Departure'] " ;
	static String next =  "//span[@role='button']";
	static String alldates= "//div[contains(@class, 'DayPicker-Day')]//following::div[@class='calDate']" ;
	static String value = "31";
	static String  Traveller  = "//div[contains(@id,'pax_link_common')]";
	static String  childvalue = "//*[text()='Children']//following::input[@id='childPaxBox']//following::button[@id='childPaxPlus']";
	static int ch   = 4 ;
	static String travelclass = "//*[@id='gi_class']//following::option";
	static String serach    ="//*[@id='gi_search_btn']";
	static String dropdown ="//*[@id='gi_class']";
	@Test
	public static void Homepage() throws Exception
	{ 
		OpenBrowser.openbrowser();
		//to source station
		driver.findElement(By.xpath(source)).sendKeys("B");
		List<WebElement> lis = driver.findElements(By.xpath(source));
		Thread.sleep(2000);
		
		System.out.println(lis.size());
		driver.findElement(By.xpath(source)).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(source)).sendKeys(Keys.ARROW_DOWN);

		driver.findElement(By.xpath(source)).sendKeys(Keys.ENTER);
		System.out.println("source has selected");
		//to distance 
		
		driver.findElement(By.xpath(distanation)).sendKeys("MUMBAI");
		List<WebElement> lis1 = driver.findElements(By.xpath("//ul[@role='listbox']"));
		Thread.sleep(2000);
		
		System.out.println(lis.size());
		driver.findElement(By.xpath(distanation)).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(distanation)).sendKeys(Keys.ARROW_DOWN);

		driver.findElement(By.xpath(distanation)).sendKeys(Keys.ENTER);
		System.out.println("distanation has selected");
		
		// Date ..//
		driver.findElement(By.xpath(date)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(next)).click();
		System.out.println("March month has selected");
		Reporter.log("user on March month ");
		//Selecting a date
		
      List<WebElement> el =  driver.findElements(By.xpath(alldates));
      System.out.println(el.size());
      for(int i =0 ; i<=el.size()-1 ; i++)
      {
    	       WebElement elb    = el.get(i);
    	        String  a = elb.getText();
    	        System.out.println(a);
    	        if(a.equals(value))
    	        {
    	        	elb.click();
    	        	System.out.println("date has clicked");
    	         }
      }
      //Selecting a passenger
      driver.findElement(By.xpath( Traveller)).click();
      driver.findElement(By.xpath(childvalue)).click();
      driver.findElement(By.xpath(childvalue)).click();
      driver.findElement(By.xpath(childvalue)).click();
      System.out.println("user have to select a number of treavller");
     
       for(int i =1 ; i<=9 ; i++)
      {
    	       if(i==4)
    	       {
    	    	   driver.findElement(By.xpath(childvalue)).click();
    	    	   System.out.println("four child has select");
    	       }
      }
       
       //Selecting a class form Boostrap
       
       Select sl = new Select(driver.findElement(By.xpath(dropdown)));
      sl.selectByIndex(3);
      System.out.println("2nd value selected");
      driver.findElement(By.xpath(serach)).click();
      System.out.println("Booking open");
      Thread.sleep(4000);
      System.out.println("The current page tittle is ="+driver.getTitle());
	}
	
}
