package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Workingwithwebdriverapachepoitc1 
{
	ChromeDriver driver; //global variable

	@BeforeTest
	public void open() throws InterruptedException
	{
		 System.setProperty("Webdriver.chrome.driver","‪‪ C:\\Users\\Rashida\\eclipse-workspace\\SampleProject\\chromedriver.exe");
		 driver=new ChromeDriver();
	     driver.get("https://www.google.com");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
	 }
		@Test
		public void data() throws IOException 
		{
			FileInputStream fis=new FileInputStream("C:\\Users\\Rashida\\Book123.xlsx");
			XSSFWorkbook wbo=new XSSFWorkbook(fis);
			XSSFSheet wso=wbo.getSheet("Sheet1");
			
			Row r;
			
			String data=driver.findElement(By.linkText("Gmail")).getText();
			r=wso.createRow(0);
		    r.createCell(0).setCellValue(data);
			
			FileOutputStream fos=new FileOutputStream("C:\\Users\\Rashida\\Book123.xlsx");
			wbo.write(fos);
		}
 }

		

		


