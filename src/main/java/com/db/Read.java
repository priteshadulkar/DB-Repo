package com.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class Read {

	static XSSFWorkbook w ;
	static XSSFSheet s ;
	static FileInputStream fis ;
	XSSFCell cell ;
	
	@Test
	public void Readdata() throws IOException
	{
		fis = new FileInputStream("D:\\Book1.xlsx") ;
		w = new XSSFWorkbook(fis) ;
		s = w.getSheetAt(0);
		int rowcount = s.getLastRowNum();
	System.out.println(rowcount);
		
		for(int i = 0 ; i<=rowcount-1; i++) {
			
			
		cell = s.getRow(i).getCell(0);
		String celltext = " " ;
	if(cell.getCellType()== Cell.CELL_TYPE_STRING) 
		{	 
			
			celltext = cell.getStringCellValue();
			System.out.println(celltext);
			
		}
	else
		if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC)
		{
			celltext = String.valueOf(cell.getStringCellValue());
			System.out.println(celltext);
		}
		else
			if(cell.getCellType()==Cell.CELL_TYPE_BLANK)
			{
				
			}
		//	else
				//if(cell.getCellType()==Cell.)
	}
	
}
}
