package com.regnant;

public abstract class Abstract //Abstract Example 
{
	int a,b;
	abstract void add(int a,int b);
	abstract void display();
    
}

class AddClass extends Abstract
{
	
	int c;
	void add(int a,int b) 
	{
		super.a=a;
		super.b=b;
		c=a+b;
		
		System.out.println("Addition");
	}

	void display()
	{
		System.out.println("The value of a is:"+a);
		System.out.println("The value of b is:"+b);
		System.out.println("The value of c is:"+c);
			xyz();			
	}
	void xyz()
	{
		System.out.println("display"); 
	}
	
}