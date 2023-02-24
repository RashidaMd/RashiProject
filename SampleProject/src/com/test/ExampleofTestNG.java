package com.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExampleofTestNG {
   
	@BeforeTest
    public void open() 
    {
    	System.out.println("open any browser");
    }
    @Test(priority=1)
    public void navigate() 
    {
    	System.out.println("navigate to any page");
    }
    @Test(priority=2)
    public void Register() 
    {
    	System.out.println("Register for new account ");
    }
    @Test(priority=3)
    public void login()
    {
    	System.out.println("Login into application");
    }
    @Test(priority=4,enabled=true)
    public void sendreports()
    {
    	System.out.println("prepare daily reports and send it to lead");
    }
    @Test(priority=5)
    public void logout()
    {
    	System.out.println("Logout from the application");
    }
    @AfterTest
    public void close()
    {
    	System.out.println("close the browser");
    }
}