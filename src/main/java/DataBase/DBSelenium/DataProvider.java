 package DataBase.DBSelenium;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import com.db.Excel;

public class DataProvider extends Excel {

	static String filename ="D:\\Book1.xlsx" ;
	static String username ;
	static String password ;
	
	@Test
	public static ArrayList<Object[]> getdatafromexcel() throws Exception
	{
		ArrayList<Object[]>  obj =  new ArrayList<Object[]>();
		
		
			
			Excel.Exceldata(filename, 3);
			
			
		
	
		
			System.out.println("Filenot found exception");
			
		
		for(int i = 0 ; i<=rownum ; i++)
		{
		
			
				String username= Excel.getcelldata(i, 0);//(00)
				String password = Excel.getcelldata(i, 1); //(01)
				
				
			
			
		}
		
		
		System.out.println(username);
		System.out.println(password);
		
		return null;
		
		
		
		
		
		
		
		 
		
	}
}
