package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class alertstestcase2
{
ChromeDriver driver;
    
    @BeforeTest
    public void open() throws InterruptedException
    {
    	 System.setProperty("Webdriver.chrome.driver","‪‪ C:\\Users\\Rashida\\eclipse-workspace\\SampleProject\\chromedriver.exe");
 		
 		driver = new ChromeDriver();
 		
 		driver.get("https://www.tsrtconline.in/oprs-web/");
 		driver.manage().window().maximize();
 		Thread.sleep(3000);
    }
    @Test
    public void data() throws InterruptedException
    {
    	
    	driver.findElement(By.id("searchBtn")).click();
    	Thread.sleep(3000);
    	
    	String value=driver.switchTo().alert().getText();
    	System.out.println(value);
    	
    	driver.switchTo().alert().accept();    	
}
	
	}
