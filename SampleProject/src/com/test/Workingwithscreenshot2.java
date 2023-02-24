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

public class Workingwithscreenshot2 {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
        System.setProperty("Webdriver.chrome.driver","‪‪ C:\\Users\\Rashida\\eclipse-workspace\\SampleProject\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://moneycontrol.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement>links=driver.findElements(By.linkText("BKFS"));

        if(links.size()==0)
        {
        File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(srcfile,new File("‪‪‪C:\\Users\\Rashida\\Desktop\\capture456.PNG"));
        }
        else
        {
        	links.get(0).click();
        }
				}

	}


