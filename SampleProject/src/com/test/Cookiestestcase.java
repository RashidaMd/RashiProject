package com.test;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Cookiestestcase 
{
ChromeDriver driver;

@BeforeTest
public void open() throws InterruptedException
{
	 System.setProperty("Webdriver.chrome.driver","‪‪ C:\\Users\\Rashida\\eclipse-workspace\\SampleProject\\chromedriver.exe");
	 driver=new ChromeDriver();
     driver.get("https://www.mirror.co.uk/");
	 driver.manage().window().maximize();
	 Thread.sleep(3000);
 }
	@Test
	public void data()
	{
		Set<Cookie>mycookies=driver.manage().getCookies();
		System.out.println(mycookies.size());
		
		driver.manage().deleteAllCookies();
		
		mycookies=driver.manage().getCookies();
		System.out.println(mycookies.size());
	}	
}
