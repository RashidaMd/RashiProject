package com.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Javascriptexecutortestcase
{
	ChromeDriver driver;

	@BeforeTest
	public void open() throws InterruptedException
	{
		 System.setProperty("Webdriver.chrome.driver","‪‪ C:\\Users\\Rashida\\eclipse-workspace\\SampleProject\\chromedriver.exe");
		 driver=new ChromeDriver();
	     driver.get("https://www.facebook.com/login/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
	 }
		@Test
		public void login() 
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("document.getElementById('email').value='123456789'");
			js.executeScript("document.getElementById('pass').value='123456'");
			
			js.executeScript("document.getElementById('loginbutton').click()");
		}

}