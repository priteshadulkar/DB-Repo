package GoibeboPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Goibebo.OpenBrowser;

public class OptionPages extends OpenBrowser {

	static String moretab = "//div[contains(@class,'padB10 lh1-2 iconText fmtTooltip')]";
	static String tab   = "//*[text()='Offers & Promotions' and @class='fl padT3']";
	
	@Test
	public void options() throws Exception
	{
		OpenBrowser.openbrowser();
		
		
		/*WebElement el = driver.findElement(By.xpath(moretab));
		Actions a = new Actions(driver);
		a.moveToElement(el).build().perform();
		driver.findElement(By.xpath(tab)).click();
		System.out.println("Offeres Tab opened");*/
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("scroll(0,500)");
		 
		/* driver.findElement(By.xpath("//div[contains(@class,'offerBlkWdgtNew')]")).click();
		 System.out.println("asdnand");*/
		 
		List<WebElement> elem = driver.findElements(By.xpath("//div[contains(@class,'offerBlkWdgtNew')]"));
		System.out.println(elem.size());
		for(int i = 0  ; i<=elem.size()-1 ; i++)
		{
			
			              WebElement value =elem.get(i);
			              String name = value.getText();
			              System.out.println(name);
			
		}
		
		
		
	}
	
}
