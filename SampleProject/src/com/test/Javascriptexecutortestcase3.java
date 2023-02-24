package com.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Javascriptexecutortestcase3 
{
	ChromeDriver driver;

	@BeforeTest
	public void open() throws InterruptedException
	{
		 System.setProperty("Webdriver.chrome.driver","‪‪ C:\\Users\\Rashida\\eclipse-workspace\\SampleProject\\chromedriver.exe");
		 driver=new ChromeDriver();
	     driver.get("https://in.search.yahoo.com/?fr2=inr/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
	 }
		@Test
		public void login() 
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,400)");
			
			
		}
}
