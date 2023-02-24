package com.test;

import java.io.IOException;

import org.testng.annotations.Test;

public class Modularframework2 
{
@Test 
    
    public void TC() throws InterruptedException, IOException 
    {
	Reusablemethods2 rm=new Reusablemethods2();
	
	rm.open();
	rm.login();
	Thread.sleep(2000);
	
	rm.close();
	
    }
}
