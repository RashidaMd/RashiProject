package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginandlogoutwithTestNGandwebdriver 
{
	ChromeDriver driver; //global variable
    @BeforeTest
    public void open() throws InterruptedException
    {
        System.setProperty("Webdriver.chrome.driver","‪‪ C:\\Users\\Rashida\\eclipse-workspace\\SampleProject\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensourcedemo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
    }
    @Test(priority=1)
    public void login() throws InterruptedException
    {
    	driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
    }
    @Test(priority=2)
    public void logout() throws InterruptedException
    {
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
    }
    @AfterTest
    public void close() 
    {
    	driver.close();
    }
   
}
