package com.regnant;

public class ShapeTest //Single Inheritance
{
   public static void main(String []args)
   {
	   Rectangle R =new Rectangle();
	   System.out.println("Rectangle area for 1st set");
	   R.length=25;
	   R.breadth=15;
	   R.calculation();
	   R.display();
	   System.out.println();
	   
	   
	   System.out.println("Rectangle area for 2nd set");
	   Rectangle R1=new Rectangle();
	   R1.length=50;
	   R1.breadth=30;
	   R1.calculation();
	   R1.display();
	   
	   Shape s=new Shape();
	   s.length=10;
	   s.breadth=4;
	 //  s.calculation();  with help of base class object we can't access derived class methods and variables
	   
	   
			   

   }
}
