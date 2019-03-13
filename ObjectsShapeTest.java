package com.regnant;

import java.util.Scanner;

public class ObjectsShapeTest //In inheritance returning Objects Example
{
   public static void main(String []args)
   {
	   Scanner s=new Scanner(System.in);
   	   String name;
   	   System.out.println("Enter the type of shape:");
   	   System.out.println("line");
   	   System.out.println("circle");
   	   System.out.println("Rectangle");
   	   name=s.nextLine();
	   ObjectsShape o=getShapeObj(name);
	   o.draw();
	   o.area();
   }
   static ObjectsShape getShapeObj(String name)
   {
	   if(name.equalsIgnoreCase("line"))
	   {
		   Line1 l=new Line1(); 
		   return l;
	   }
	   else if(name.equalsIgnoreCase("Circle"))
	   {
		   return new Circle4();
	   }
	   else if(name.equalsIgnoreCase("rectangle"))
	   {
		   return new Rectangle3();
	   }
	   return new ObjectsShape();
   }
}
