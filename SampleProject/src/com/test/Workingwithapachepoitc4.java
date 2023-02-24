package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Workingwithapachepoitc4 // insert data in multiple rows
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Rashida\\Book123.xlsx");
		XSSFWorkbook wbo=new XSSFWorkbook(fis);
		XSSFSheet wso=wbo.getSheet("Sheet1");
		
		Row r;
		
		for(int i=0;i<10;i++)
			
		{
			r=wso.createRow(i);
			r.createCell(0).setCellValue("Selenium");
		}
		
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Rashida\\Book123.xlsx");
		wbo.write(fos);

	}

}
