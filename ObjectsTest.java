package com.regnant;

public class ObjectsTest //Objects as a parameters Example 
{
	public static void main(String [] args)
	{
		Abc c=new Abc();
		Objects s=new Objects();
		
		c.getStudentDetails("koti","sathyabama university","mechanical",s);
		c.getNumber(225412,s);
		c.display(s);
	}
}
