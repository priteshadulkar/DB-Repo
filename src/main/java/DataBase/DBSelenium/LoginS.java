package DataBase.DBSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginS extends simple{

	public LoginS(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}



	public static WebDriver driver ;
	
	
	@FindBy(how =  How.XPATH , using= "//input[@type='text' and @class = '_2zrpKA']")
    public static WebElement id;
	
	
	
	public static void Login() throws Exception
	{
		id.click(); 
	    id.sendKeys("9028462080");
			
	}
	
	
	
	
}
