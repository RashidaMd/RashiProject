package com.test;

import java.awt.Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRMLogout 
{
	public Menu menu=null;
	public HRMLogout(WebDriver driver)//page name
	{
		menu=PageFactory.initElements(driver,Menu.class);
	}
	
	//creating POM for logout button
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")
	WebElement dropdown;
	
	@FindBy(linkText="Logout")
	WebElement logoutbutton;

	public void logout() throws InterruptedException
	{
		dropdown.click();
		Thread.sleep(2000);
		logoutbutton.click();
		
		
		
		
	}
}
