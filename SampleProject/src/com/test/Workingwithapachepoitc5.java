package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Workingwithapachepoitc5 //get data from excel
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Rashida\\Book123.xlsx");
		XSSFWorkbook wbo=new XSSFWorkbook(fis);
		XSSFSheet wso=wbo.getSheet("Sheet1");
		
		Row r;
		
		
			r=wso.getRow(0);
			String data=r.getCell(0).getStringCellValue();
			System.out.println(data);
		
		
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Rashida\\Book123.xlsx");
		wbo.write(fos);

	}




	}


