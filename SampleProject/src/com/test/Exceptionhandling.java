package com.test;

public class Exceptionhandling {

	public static void main(String[] args) {
		try 
		{
			int a=5,b=5,c;
			c=a/b;
			System.out.println(c);
		}
         catch(Exception x)
		{
        	 System.out.println(x);
		}
		 System.out.println("Automation Testing");
	}

}
