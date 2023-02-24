package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Workingwithwebtable 
{
	ChromeDriver driver;
	@BeforeTest
    public void open() throws InterruptedException
    {
        System.setProperty("Webdriver.chrome.driver","‪‪ C:\\Users\\Rashida\\eclipse-workspace\\SampleProject\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
    }
	@Test
	public void data()
	{
		WebElement table=driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table"));
		
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		System.out.println("no.of rows are:" +rows.size());
		
		List<WebElement>columns=table.findElements(By.tagName("td"));
		System.out.println("no.of columns are:" +columns.size());
		
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}
}
