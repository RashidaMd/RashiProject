package com.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Javascriptexecutortestcase6 
{
	ChromeDriver driver;

	@BeforeTest
	public void open() throws InterruptedException
	{
		 System.setProperty("Webdriver.chrome.driver","‪‪ C:\\Users\\Rashida\\eclipse-workspace\\SampleProject\\chromedriver.exe");
		 driver=new ChromeDriver();
	     driver.get("https://facebook.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
	 }
		@Test
		public void login() throws InterruptedException 
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			driver.navigate().to("https://google.com/");
			
			Thread.sleep(3000);
			js.executeScript("window.history.back()");
			
            Thread.sleep(3000);
			js.executeScript("window.history.forward()");
			
		}
}
