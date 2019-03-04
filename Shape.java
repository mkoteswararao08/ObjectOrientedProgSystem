package com.regnant;

public class Shape   //Single Inheritance
{
    int length;
    int breadth;
  
}//base class

class Rectangle extends Shape
{
	int area;
	void calculation()
	{
		area=length*breadth;
	
	}
	void display()
	{
		System.out.println("The length of Rectangle is:"+length);
		System.out.println("The breadth of Rectangle is:"+breadth);
	    System.out.println("The Area of Rectangle is:"+area);
	}
}//derived class
