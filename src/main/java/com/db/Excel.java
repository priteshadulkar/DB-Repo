 package com.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel {

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
	
	
	public void getrowcount()
	{
		int rownum = s.getLastRowNum();
		
	}
	
	public static String getcelldata(int row , int col)
	{
	    //System.out.println("file data ");
	  
	    		
	    	  XSSFCell cell  =  s.getRow(row).getCell(col);
	    	  String celltext = "" ;
	    		
	    		//get cell type value
	    	  
	    	  
	    	  if(cell.getCellType()==Cell.CELL_TYPE_STRING)
	    	  {
	    		  
	    		  
	    		  celltext = cell.getStringCellValue();
	    		  
	    	  }
	    	  if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC)
	    	  {
	    		  
	    		  celltext =String.valueOf(cell.getNumericCellValue()) ;
	    		  
	    	  }
	    	
	   System.out.println(cell);
		return celltext;
	    	
	    	
	   }
	public static void getrowdata(int row)
	{
		
		
		
	}
	
	
}
