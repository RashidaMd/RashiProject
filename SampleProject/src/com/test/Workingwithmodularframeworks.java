package com.test;

import org.testng.annotations.Test;

public class Workingwithmodularframeworks 
{
@Test 
    
    public void TC() throws InterruptedException 
    {
	Reuseablemethods rm=new Reuseablemethods();
	
	rm.open();
	rm.login("Admin","admin123");
	Thread.sleep(4000);
	rm.logout();
	Thread.sleep(2000);
	rm.close();
	
    }
}
