package com.regnant;

public class SuperKeyword1 //Super Keyword at variable level  
{
   int a,b,c;
   SuperKeyword1()
   {
	   
 	  System.out.println("base class");
   }
   SuperKeyword1(int a)
   {
	   this();
	   System.out.println("parameter constructor base class");
   }
    
}
class Man extends SuperKeyword1
{
	int a,b,c;
	Man(int a,int b)
	{
		super(3);
		System.out.println("derived class");
		this.a=a;
		this.b=b;
	}
	void add(int a,int b)
	{
		super.a=a;
		super.b=b;
		super.c=super.a+super.b;
		this.c=this.a+this.b;
		
	}
	void display()
	{
		System.out.println("The Value of a in derived class is:"+a);
		System.out.println("The Value of b in derived class is:"+b);
		System.out.println("The Value of c in derived class is:"+c);
		System.out.println("\n--------------------------------------\n");
		System.out.println("The Value of a in Base class is:"+super.a);
		System.out.println("The Value of b in Base class is:"+super.b);
		System.out.println("The Value of c in Base class is:"+super.c);
	}
}
