package com.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingwithPOM 
{
	ChromeDriver driver;
	
	@BeforeTest
	public void open() throws InterruptedException
	{
	System.setProperty("Webdriver.chrome.driver","‪‪ C:\\Users\\Rashida\\eclipse-workspace\\SampleProject\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	Thread.sleep(3000);
	driver.manage().window().maximize();
	}
	
	@Test
	public void example() throws InterruptedException
	{	
	
    //To call login POM class File
	
	HRMLogin page1=PageFactory.initElements(driver,HRMLogin.class);// create an object
	Thread.sleep(4000);
	HRMLogout page2=PageFactory.initElements(driver,HRMLogout.class);
	
	page1.login("Admin","admin123");
	page2.logout();
	}
}

