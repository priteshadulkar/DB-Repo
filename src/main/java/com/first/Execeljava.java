package com.first;

import java.io.IOException;

import org.testng.annotations.Test;

import com.db.Excel;

public class Execeljava extends Excel {
   
	
	
	 @Test
	 public  static void DisplayData() throws IOException
	 {
		 
		Excel.Exceldata("D:\\Book1.xlsx", 3);
		 
		 
		 
	 }
}
