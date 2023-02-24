package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Workingwithframes 
{
ChromeDriver driver;
    
    @BeforeTest
    public void open() throws InterruptedException
    {
    	 System.setProperty("Webdriver.chrome.driver","‪‪ C:\\Users\\Rashida\\eclipse-workspace\\SampleProject\\chromedriver.exe");
 		
 		driver = new ChromeDriver();
 		
 		driver.get("https://www.angelfire.com/super/badwebs/");
 		driver.manage().window().maximize();
 		Thread.sleep(3000);
    }
    @Test
    public void data()
    {
    	driver.switchTo().frame(1);
    	
    	driver.findElement(By.xpath("/html/body/p[5]/b/a/font")).click();
    }
    @AfterTest
	public void close()
	{
		driver.close();
	}
}
