package com.regnant;

import java.util.Scanner;

public class IShapeTest //In Interface returning Objects Example
{
    public static void main(String []args)
    {
    	Scanner s=new Scanner(System.in);
    	String name;
    	System.out.println("Enter the type of shape:");
    	name=s.nextLine();
    	IShape is=getShapeObj(name);
    	is.draw();
    }
  public static IShape getShapeObj(String name)
    {
    	if(name.equalsIgnoreCase("Line"))
    	{
    	   	return new Line();
   		}
    	else if (name.equalsIgnoreCase("Circle"))
    	{
    		
    		return new Circle3();
    	}
    	return null;
    }
}
