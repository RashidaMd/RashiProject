package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Workingwithpropertyfile 
{
	private static Logger log=Logger.getLogger(Workingwithpropertyfile.class);
	
	ChromeDriver driver;
	FileInputStream fis;
	Properties pr123;
	   
	   @BeforeTest
	   public void open() throws InterruptedException
	   {
		   DOMConfigurator.configure("log4j.xml");
	   
	       System.setProperty("Webdriver.chrome.driver","‪‪ C:\\Users\\Rashida\\eclipse-workspace\\SampleProject\\chromedriver.exe");
	       driver = new ChromeDriver();
	       log.info("chrome browser is opened");
	       
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
		   log.info("OrangeHRM application is opened");
		   
	}
	@Test(priority=1)
	public void login() throws InterruptedException, IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Rashida\\eclipse-workspace\\SampleProject\\HRMLogin.properties");
		pr123=new Properties();
		pr123.load(fis);
		log.info("property file is loaded successfully");
		
		driver.findElement(By.name(pr123.getProperty("x"))).sendKeys("Admin");
		log.info("entered username successfully");
		driver.findElement(By.name(pr123.getProperty("y"))).sendKeys("admin123");
		log.info("entered password successfully");
		driver.findElement(By.xpath(pr123.getProperty("loginbutton"))).click();
		log.info("logged into application successfully");
		Thread.sleep(3000);
	}

	
	@Test(priority=2)
	public void logout() throws IOException, InterruptedException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Rashida\\eclipse-workspace\\SampleProject\\HRMLogin.properties");
		pr123 = new Properties();
		pr123.load(fis);
		
		driver.findElement(By.xpath(pr123.getProperty("drop-down"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr123.getProperty("logout"))).click();
		log.info("Successfully loggedout from the application");
	}
}
