package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actionstestcase2 
    {
	ChromeDriver driver;
	   
	   @BeforeTest
	   public void open() throws InterruptedException
	   {
	   
	   System.setProperty("Webdriver.chrome.driver","‪‪ C:\\Users\\Rashida\\eclipse-workspace\\SampleProject\\chromedriver.exe");
	   driver = new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test
	public void data() throws InterruptedException
	{
	   WebElement button=driver.findElement(By.linkText("Customer Login"));
	   Actions action=new Actions(driver);
	   action.moveToElement(button).build().perform();
	   
	   Thread.sleep(1000);
	   
	   driver.findElement(By.linkText("Register")).click();
	}


	}


