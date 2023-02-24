package com.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Hashsettestcase1 {

	public static void main(String[] args) 
	{
		Set value=new HashSet<>();
		
		value.add("Selenium");
		value.add("Testing");
		value.add(100);
		value.add('&');
		value.add(300);
		value.add(500); 
		
		System.out.println(value.size());
		
		Iterator i=value.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
