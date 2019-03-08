package com.regnant;

public class DynamicBinding // polymorphism and Dynamic Binding example-2
{
	int length;
	int breadth;
	float area;
	float radius;
	int height;
	int base;
	DynamicBinding() 
	{
		System.out.println("Base Class");
	}
	void area() 
	{
		System.out.println("Base Class");
	}
	void display() 
	{
		System.out.println("Base Class");
	}
}

class Rectangle2 extends DynamicBinding 
{
	int length;
	int breadth;
	
	Rectangle2() 
	{
		System.out.println("Intermediate base class-1");
		length = 200;
		breadth = 150;
	}

	void area() 
	{
		area = length * breadth;
	}

	void display() 
	{
		System.out.println("Area of Rectangle is:" + area);
		System.out.println("length:"+length);
		System.out.println("breadth:"+breadth);
		System.out.println("length:"+super.length);
		System.out.println("breadth:"+super.breadth);
		
	}
}

class Circle2 extends Rectangle2 
{
	float pi = 3.14f;

	Circle2() 
	{
		System.out.println("Intermediate base class-2");
		radius = 20;
	}

	void area() 
	{
		area = pi * radius * radius;
	}

	void display() 
	{
		System.out.println("Area of circle is: " + area);
	}
}

class Triangle2 extends Circle2 
{
	Triangle2() 
	{
		System.out.println("Derived Class");
		base = 50;
		height = 25;
	}

	void area() 
	{
		area = (base * height) / 2;
	}

	void display() 
	{
		System.out.println("Area of Triangle is :" + area);
	}

}