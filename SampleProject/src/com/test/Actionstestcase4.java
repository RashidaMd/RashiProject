package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actionstestcase4 
{
	ChromeDriver driver;
	   
	   @BeforeTest
	   public void open() throws InterruptedException
	   {
	   
	   System.setProperty("Webdriver.chrome.driver","‪‪ C:\\Users\\Rashida\\eclipse-workspace\\SampleProject\\chromedriver.exe");
	   driver = new ChromeDriver();
		driver.get("https://www.jqueryui.com/slider/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test
	public void data() throws InterruptedException
	{
	   driver.switchTo().frame(0);
	   
	   WebElement slider=driver.findElement(By.id("slider"));
	   
	   int location=slider.getLocation().y;
	   
	   Actions action=new Actions(driver);
	   action.dragAndDropBy(slider,location,60).build().perform();
	   
}
	 
}
