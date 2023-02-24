package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.web.Values;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Workingwithwebdriverapachepoitc2 
{
	ChromeDriver driver; //global variable

	@BeforeTest
	public void open() throws InterruptedException
	{
		 System.setProperty("Webdriver.chrome.driver","‪‪ C:\\Users\\Rashida\\eclipse-workspace\\SampleProject\\chromedriver.exe");
		 driver=new ChromeDriver();
	     driver.get("https://www.mercurytravels.co.in/");
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
			
			WebElement dropdown=driver.findElement(By.id("themes"));
			List<WebElement>values=dropdown.findElements(By.tagName("option"));
			for(int i=0;i<values.size();i++)
			{
			
			r=wso.createRow(i);
		    r.createCell(0).setCellValue(values.get(i).getText());
			}
			
			FileOutputStream fos=new FileOutputStream("C:\\Users\\Rashida\\Book123.xlsx");
			wbo.write(fos);
		}
}
