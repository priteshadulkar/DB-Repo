package Goibebo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class OpenBrowser {

	 public  static WebDriver driver ;
	
	 
	public static void openbrowser()throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver2.44\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.goibibo.com");
		System.out.println("GOIBBO Home page Open");
		Reporter.log("GOIBBO Home page Open");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		// tab to source station
		
		/*driver.findElement(By.xpath("//input[@id='gosuggest_inputSrc']")).sendKeys("B");
		List<WebElement> lis = driver.findElements(By.xpath("//ul[@role='listbox']"));
		Thread.sleep(2000);
		
		System.out.println(lis.size());
		driver.findElement(By.xpath("//input[@id='gosuggest_inputSrc']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='gosuggest_inputSrc']")).sendKeys(Keys.ARROW_DOWN);

		driver.findElement(By.xpath("//input[@id='gosuggest_inputSrc']")).sendKeys(Keys.ENTER);*/
		
		
		
		
}
}
