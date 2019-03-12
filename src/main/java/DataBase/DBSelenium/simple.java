package DataBase.DBSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class simple {

	
	public static WebDriver driver ;
	
	public simple(WebDriver driver)
	{
		
		this.driver = driver ;
	}
	
	public static void Startup() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver2.44\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		System.out.println("Flipcart Pages opened");
		Reporter.log("Flipcart Pages opened");
		
		/*PageFactory.initElements(driver, simple.class);
		id.sendKeys("9028462080");*/
		
	}

	
}
