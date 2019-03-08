package com.regnant;

public class SuperKeyword3 //using Super() keyword calling of base class constructor from Derived class constructor
{
	int length;
	int breadth;
	
	float radius;
	final float pi=3.14f;
	int height;
    int base;
	SuperKeyword3()
	{
		System.out.println("Base Class");	
	}
	
}

class Square1 extends SuperKeyword3
{
	float area;
	Square1()  
	{
		
		System.out.println("Intermediate base class-1");
		length=9;
		breadth=10;
	}
	void calculation()
	{
		area=length*breadth;
	}
	void display()
	{
		
	    System.out.println("The length of square is:"+length);
		System.out.println("The breadth of square is:"+breadth);
		System.out.println("The Area of Square is:"+area);
		System.out.println("\n----------------------------------\n");
	}
	
}
class Circle1 extends Square1
{
	float area;
    Circle1(int radius)
    {
    
       	System.out.println("Intermediate base class-2");
    	super.radius=radius;
    }
	void calculation()
	{
		super.calculation();
		area=pi*radius*radius;
		
	}
	void display()
	{
		super.display();
		System.out.println("The Radius of circle is:"+radius);
		System.out.println("The Area of Circle is:"+area);
		System.out.println("\n-------------------------------\n");
	}	
}
class Triangle1 extends Circle1
{
	float area;
	Triangle1(int base,int height)
	{
		super(78);
		System.out.println("Derived class");
		super.base=base;
		
		super.height=height;
	}
	void calculation()
	{
		super.calculation();
		area=(base*height)/2;
	}
	void display()
	{
		super.display();
		System.out.println("The base of triangle is:"+base);
		System.out.println("The height of triangle is:"+height);
		System.out.println("The Area of Triangle is:"+area);
	}
}
