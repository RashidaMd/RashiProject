package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Workingwithactions //mouse operator
{
   ChromeDriver driver;
   
   @BeforeTest
   public void open() throws InterruptedException
   {
   
   System.setProperty("Webdriver.chrome.driver","‪‪ C:\\Users\\Rashida\\eclipse-workspace\\SampleProject\\chromedriver.exe");
   driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
}
@Test
public void data()
{
   WebElement gmail=driver.findElement(By.linkText("Gmail"));
   Actions action=new Actions(driver);
   action.contextClick(gmail).build().perform();
}


}
