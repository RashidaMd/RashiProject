package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actinstestcase5 
{
	ChromeDriver driver;
	   
	   @BeforeTest
	   public void open() throws InterruptedException
	   {
	   
	   System.setProperty("Webdriver.chrome.driver","‪‪ C:\\Users\\Rashida\\eclipse-workspace\\SampleProject\\chromedriver.exe");
	   driver = new ChromeDriver();
		driver.get("https://www.jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test
	public void data() throws InterruptedException
	{
	   driver.switchTo().frame(0);
	   
	   WebElement source=driver.findElement(By.id("draggable"));
	   WebElement target=driver.findElement(By.id("droppable"));
	   
	   Actions action=new Actions(driver);
	   action.dragAndDrop(source,target).build().perform();
	   
}
}
