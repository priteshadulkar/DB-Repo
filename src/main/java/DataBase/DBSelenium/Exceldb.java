package DataBase.DBSelenium;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.db.Excel;

public class Exceldb extends Excel {

	static String filename ="D:\\Book1.xlsx" ;
	
	
	@Test
	public static void Readdata() throws IOException
	{
		Excel.Exceldata(filename, 2);
		System.out.println("sheet open ");
		Reporter.log("sheet1 opened");
		
		
		for(int i = 0 ; i<=rownum ; i++)
		{
			
			for(int j =0 ; j<=1 ; j++)
			{
				
				Excel.getcelldata(i, j);
				
			}
		}
		
		System.out.println("sheet data reading successfully ");
		Reporter.log("sheet data read sussfully");
		
	}
}
