package com.Flipcart.java;

import java.io.IOException;

import org.testng.annotations.Test;

import com.db.Excel;
import com.db.jdf;
import com.first.Homepage;
import com.first.LoginPagesTest;

public class Login extends Homepage{

	@Test
	public void Loginap() throws Exception
	{
		
		Homepage.openbrowser();
		System.out.println("homepage opened");
		//Excel.Exceldata("D:\\Book1.xlsx", 4);
		jdf.Exceldata("D:\\Book1.xlsx", 4);
		System.out.println("excel Book opened");
		int a = jdf.rownum;
		
		for(int i = 1 ; i<=a ; i++)
		{
			
		  String un =jdf.getcelldata(i, 0);
		  String pw = jdf.getcelldata(i, 1);
			
			LoginPagesTest.Login(un, pw);
			
			
			
		}
		
		
		
		
	}
	
	
}
