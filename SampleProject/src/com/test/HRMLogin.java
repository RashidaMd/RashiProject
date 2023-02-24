package com.test;

import java.awt.Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRMLogin 
{
public Menu menu=null;
public HRMLogin(WebDriver driver)//page name
{
	menu=PageFactory.initElements(driver,Menu.class);
}
//creating POM for username
@FindBy(name="username")
WebElement user;

//creating POM for password
@FindBy(name="password")
WebElement pwd;

//creating POM for login button
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
WebElement button;

public void login(String user1 , String pwd1)
{
	user.clear();
	user.sendKeys(user1);
	pwd.clear();
	pwd.sendKeys(pwd1);
	button.click();
	
	
	
	
}

 
	
}

