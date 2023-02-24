package com.test;

import java.util.ArrayList;
import java.util.List;

public class Program2 
{

	public static void main(String[] args)
	{
		
		List<String>i=new ArrayList<>();
		i.add("Selenium");
		i.add("Automation");
		i.add("Manual");
		i.add("Testing");
		i.add("Hello");
		
		System.out.println(i.size());
		for(int j=0;j<i.size();j++)
		{
        System.out.println(i.get(j));
		}
	}
}