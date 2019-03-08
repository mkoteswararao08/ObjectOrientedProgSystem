package com.regnant;

public class DynamicBindingTest // polymorphism and Dynamic Binding example-2 
{
   public static void main(String []args)
   {
	   DynamicBinding db;
	 
	   System.out.println("\n------------------------------------\n");
	   db= new Rectangle2();
	   db.area();
	   db.display();
	   System.out.println("\n------------------------------------\n");
	   db=new Circle2();
	   db.area();
	   db.display();
	   System.out.println("\n--------------------------------------\n");
	   db=new Triangle2();
	   db.area();
	   db.display();
	   System.out.println("\n------------------------------------------\n");
	  
	   Rectangle2 re=new Triangle2();
	   re.area();
	   re.display();
	   System.out.println("\n-----------------------------------------------\n"); 
	   
	   Circle2 ci=new Triangle2();
	   ci.area();
	   ci.display();
	   
	   System.out.println("\n------------------------------------------------\n");
	  //Triangle2 tr=new DynamicBinding(); //can't create object to child class with reference of parent class
	 
	 
	   
   }
}
