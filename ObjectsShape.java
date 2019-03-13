package com.regnant;

public class ObjectsShape //In inheritance returning Objects Example
{
	int length;
	int breadth;
	float area;
	float radius;
	float pi=3.14f;
    void draw()
    {
    	System.out.println("draw");
    }
    void area()
    {
    	System.out.println("Area");
    }
	
}
class Line1 extends ObjectsShape
{
	public void draw() 
	{
		System.out.println("Line draw");
		
	}
	void area()
	{
		length=29;
		System.out.println("Length of line is:"+length);
	}
}
class Circle4 extends ObjectsShape
{
	public void draw() 
	{
	
       System.out.println("Circle draw");
       
	}
	void area()
	{
		radius=6;
		area=pi*radius*radius;
		System.out.println("Radius of circle is:"+radius);
		System.out.println("Area of Circle is:"+area);
	}
}
class Rectangle3 extends ObjectsShape
{
	public void draw()
	{
		System.out.println("Rectangle draw");
		
	}
	void area()
	{
		length=56;
		breadth=30;
		area=length*breadth;
		System.out.println("Length of Rectangle is :"+length);
		System.out.println("Breadth of Rectangle is :"+breadth);
		System.out.println("Area of Rectangle is:"+area);
	}
}
