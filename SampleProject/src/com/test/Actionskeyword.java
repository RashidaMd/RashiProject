package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actionskeyword 
{
ChromeDriver driver; //instance variable

	
	public void launchbrowser() throws InterruptedException
	{
		 System.setProperty("Webdriver.chrome.driver","‪‪ C:\\Users\\Rashida\\eclipse-workspace\\SampleProject\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	public void navigate() throws InterruptedException	 
	{
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 Thread.sleep(4000);
	}
	public void enterusername() 
	{
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("Admin");
		
	}
	public void enterpassword() 
	{
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("admin123");
		
	
	}
	public void clickonlogin() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/form/div[3]/button")).click();
		Thread.sleep(3000);
	}
	public void logout() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
	}
	public void close()
	{
		driver.close();
	}
}


