package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Workingwithapachepoitc6 //get data from multiple rows in excel
{

	public static void main(String[] args) throws IOException//get multiple data from excel
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Rashida\\Book123.xlsx");
		XSSFWorkbook wbo=new XSSFWorkbook(fis);
		XSSFSheet wso=wbo.getSheet("Sheet1");
		
		Row r;
		
		
			int rowc=wso.getLastRowNum();
			for(int i=0;i<=rowc;i++)
			{
			r=wso.getRow(i);	
			String data=r.getCell(0).getStringCellValue();
			System.out.println(data);
			
			}
		
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Rashida\\Book123.xlsx");
		wbo.write(fos);


	}

}
