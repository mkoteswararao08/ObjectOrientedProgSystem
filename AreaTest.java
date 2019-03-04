package com.regnant;

public class AreaTest //Hierarchical inheritance
{
   public static void main(String []args)
   {
	   Square s=new Square();
	   s.length=54;
	   s.breadth=23;
	   s.calculation();
	   s.display();
	   
	   System.out.println("------------------------------------------");
	   
	   Circle c=new Circle();
	   c.radius=5;
	   c.calculation();
	   c.display();
	   
	   System.out.println("------------------------------------------");
	   
	   Triangle t=new Triangle();
	   t.base=20;
	   t.height=14;
	   t.calculation();
	   t.display();
   }
}
