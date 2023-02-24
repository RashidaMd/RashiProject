package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class webtable2 {
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
		String part1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String part2="]/td[1]/a";
		
		for(int i=1;i<=36;i++)
		{
			String text=driver.findElement(By.xpath(part1+i+part2)).getText();
			System.out.println(text);
	}
	}
		
	@AfterTest
	public void close()
	{
		driver.close();
	}
	
	}
	
    

    
