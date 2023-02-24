package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Reusablemethods2 
{
    ChromeDriver driver;//instance variable
    FileInputStream fis;
    XSSFWorkbook wbo;
    XSSFSheet wso;
    FileOutputStream fos;
    
    @BeforeTest
    public void open() throws InterruptedException
    {
    	 System.setProperty("Webdriver.chrome.driver","‪‪ C:\\Users\\Rashida\\eclipse-workspace\\SampleProject\\chromedriver.exe");
    	 driver=new ChromeDriver();
    		  
    	 driver.get("https://opensource-demo.orangehrmlive.com/");
    	 Thread.sleep(4000);
    	 driver.manage().window().maximize();
    		
    	  }
    	  @Test
    	  public void login() throws IOException
    	  {
    		    fis=new FileInputStream("C:\\Users\\Rashida\\Book123.xlsx");
    			wbo=new XSSFWorkbook(fis);
    			wso=wbo.getSheet("Sheet1");
    			
    			Row r;
    			
    			
    			int rowc=wso.getLastRowNum();
    			for(int i=1;i<=rowc;i++)
    			{
    			r=wso.getRow(i);
    			
    			driver.findElement(By.id("txtUsername")).clear();
    			driver.findElement(By.id("txtUsername")).sendKeys(r.getCell(0).getStringCellValue());
    			
    			driver.findElement(By.id("txtPassword")).clear();
    			driver.findElement(By.id("txtPassword")).sendKeys(r.getCell(1).getStringCellValue());
    			
    			String Actual=driver.getCurrentUrl();
    			r.createCell(3).setCellValue(Actual);
    			
    			String Expected=r.createCell(2).getStringCellValue();
    			if(Expected.equals(Actual))
    			{
    				r.createCell(4).setCellValue("pass");
    			}	
    			else
    			{
    				r.createCell(4).setCellValue("Fail");
    			}
                 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
    			}
    			fos=new FileOutputStream("C:\\\\Users\\\\Rashida\\\\Book123.xlsx");
    			wbo.write(fos);
    			
    			}
    	  @AfterTest
    	  public void close()
    	  {
    		  driver.close();
    		  System.out.println("closed the browser");
    	  }
    	  }
    	

