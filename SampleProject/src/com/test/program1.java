package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program1 
 {

	public static void main(String[] args) throws InterruptedException
		  
	{
				System.setProperty("Webdriver.chrome.driver","‪‪ C:\\Users\\Rashida\\eclipse-workspace\\SampleProject\\chromedriver.exe");
				
				ChromeDriver driver=new ChromeDriver();
				
				driver.get("https://www.mercurytravels.co.in//");
				driver.navigate().to("https://www.mercurytravels.co.in/");
				
				driver.manage().window().maximize();
				Thread.sleep(5000);
				
				
				 List<WebElement>Element=driver.findElements(By.tagName("a"));
				 System.out.println("no of links are"  +Element.size());
				 
				 Element=driver.findElements(By.tagName("a"));
				 System.out.println("no of dropdowns are"  +Element.size());
				 
				 Element=driver.findElements(By.tagName("a"));
				 System.out.println("no of images are"  +Element.size());		
				 
				 Element=driver.findElements(By.xpath("//input[@type='radio']"));
				 System.out.println("no of radiobuttons are"  +Element.size());	
				 
				 Element=driver.findElements(By.xpath("//input[@type='checkbox']"));
				 System.out.println("no of checkboxes are"  +Element.size());	
				 
				 Element=driver.findElements(By.xpath("//input[@type='text']"));
				 System.out.println("no of textfields are"  +Element.size());
					}
				 }
 
 
