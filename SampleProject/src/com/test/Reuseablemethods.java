package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Reuseablemethods 
{
  ChromeDriver driver;//instance variable
  
  @BeforeTest
  public void open() throws InterruptedException
  {
	  System.setProperty("Webdriver.chrome.driver","‪‪ C:\\Users\\Rashida\\eclipse-workspace\\SampleProject\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
  }
  @Test(priority=1)
  public void login(String username, String password)
  {
	  driver.findElement(By.name("username")).clear();
	  driver.findElement(By.name("username")).sendKeys(username);
	  
	  driver.findElement(By.name("password")).clear();
	  driver.findElement(By.name("password")).sendKeys(password);
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  
  }
  @Test(priority=2)
  public void logout() throws InterruptedException
  {
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.linkText("Logout")).click();
  }
  @AfterTest
  public void close()
  {
	  driver.close();
	  System.out.println("closed the browser");
  }
  
}
