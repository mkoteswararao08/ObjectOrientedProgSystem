package com.regnant;

public class Food //using This() keyword calling of one constructor from another constructor
{
   String name;
   int price;
   int quantity;
   int total;
   Food()
   {
	   this(2);
	   System.out.println("contructor with out parameters ");
   }
   Food(String name,int price)
   {
	   this();
	   this.name=name;
	   this.price=price;
	   System.out.println("name  is:"+this.name);
	   System.out.println("price is:"+this.price);
	   
   }
   Food(int quantity)     
   {
	   this.quantity=quantity; 
	   System.out.println("constructor with single parameter");
   }
   void calculation(int price)
   {
	   System.out.println(name+" market price upto yesterday is: "+this.price);
	   System.out.println(name+" Todays market price is: "+price);
	   
	   if(this.price==price) 
	   {
		   total=price*quantity;     	   
	   }
	   else
	   {  
		   this.price=price;
		   total=this.price*quantity;
	   }
   }
   
   void display()
   {
	   System.out.println("\n-------------------------------\n");
	   System.out.println("Food name is:"+name);
	   System.out.println("price of food item  per kg is:"+price);
	   System.out.println("Quantity of food item you taken is: "+quantity+" kg");
       System.out.println("Total price of the "+name+" is:"+total);
   }
   
   
}
