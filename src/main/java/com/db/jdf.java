package com.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class jdf {
	static XSSFWorkbook w;
	static XSSFSheet s ;
	//static XSSFWorkbook w;
	public  static int rownum ;
	
	
	public static void Exceldata(String filename ,int index) throws IOException
	{
		
		FileInputStream fis = new FileInputStream(filename) ;   //"D:\\Book1.xlsx"
		System.out.println("File open and read successfully");
		
		w = new XSSFWorkbook(fis) ;
		s = w.getSheetAt(index);
		System.out.println(s.getSheetName());
	    rownum = s.getLastRowNum();
	     System.out.println(rownum);
	    
	
		
		System.out.println("ALL VALUE STARTING TO PR=INT") ;
	}
	
	public static String getcelldata(int row , int cell)
	{
		
		XSSFCell cel = s.getRow(row).getCell(cell);
		
		String celltext = " " ;
		if(cel.getCellType() == cel.CELL_TYPE_STRING)
		{
			celltext = cel.getStringCellValue() ;
		}
		else
			if(cel.CELL_TYPE_NUMERIC == cel.CELL_TYPE_NUMERIC)
			{
				celltext=  String.valueOf(cel.getNumericCellValue());
			}
		System.out.println(cel);
		return celltext;
		
		
	}
	
	public static void setCellData(String path ,int row , int cel, String rs) throws Exception
	{
		XSSFCell cell = s.getRow(row).getCell(cel);
		cell.setCellValue(rs);
		FileOutputStream fout = new FileOutputStream(path);
		w.write(fout);
		fout.close();
		
		
		
		
	}
}
