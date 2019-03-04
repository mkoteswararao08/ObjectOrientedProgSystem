package com.regnant;

public class Area //Hierarchical inheritance
{
   int length;
   int breadth;
   float area;
   float radius;
   int height;
   int base;
}//Base class

class Square extends Area
{
   void calculation()
   {
	   area=length*breadth;
	   
   }
   void display()
   {
	   System.out.println("The length of square is:"+length);
	   System.out.println("the breadth of square is:"+breadth);
	   System.out.println("The Area of Square is:"+area);
   }
}//Derived class
class Circle extends Area
{
	final float pi=3.14f;
	void calculation()
	{
		area=pi*radius*radius;
		
	}
	void display()
	{
		System.out.println("The Radius of circle is:"+radius);
		System.out.println("The Area of Circle is:"+area);
	}
}//Derived class

class Triangle extends Area
{
	void calculation()
	{
		area=(base*height)/2;
	}
	void display()
	{
		System.out.println("The base of triangle is:"+base);
		System.out.println("The height of triangle is:"+height);
		System.out.println("The Area of Triangle is:"+area);
		
	}
}//Derived class