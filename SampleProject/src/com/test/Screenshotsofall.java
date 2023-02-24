package com.test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotsofall {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
System.setProperty("Webdriver.chrome.driver","‪‪ C:\\Users\\Rashida\\eclipse-workspace\\SampleProject\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		List<WebElement>links=driver.findElements(By.tagName("a"));

        for(int i=0;i<links.size();i++)
        {
          if(links.get(i).isDisplayed())
          {
        
           String name=links.get(i).getText();
           links.get(i).click();
        
           File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           FileUtils.copyFile(srcfile,new File("‪C:\\Users\\Rashida\\Desktop\\sc\\"+name+".PNG"));
		
		   driver.navigate().back();
		   links=driver.findElements(By.tagName("a"));
     
	}
	}
	}



	




	}


