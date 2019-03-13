package com.regnant;

public interface IShape //In Interface returning Objects Example
{
   void draw();
}
class Line implements IShape
{
	public void draw() 
	{
		System.out.println("Line draw");		
	}
	
}
class Circle3 implements IShape
{
	public void draw() 
	{
	
       System.out.println("Circle draw");		
	}
	
}