package com.regnant;

public class ObjectsPassing //Objects passing Example
{
   int a,b,c;
   
   void add(int a,int b)
   {
	   this.a=a;
	   this.b=b;
	   c=this.a+this.b;
   }
   void display()
   {
	   System.out.println("The value of a is:"+a);
	   System.out.println("The value of b is:"+b);
	   System.out.println("The sum is :"+c);
   }
   void objectsAdd(ObjectsPassing d)
   {
	   a=d.a+d.b;
	   b=d.a+d.b;
	   System.out.println("The value of a is :"+a);
	   System.out.println("The value of b is :"+b);
	   
   }
   void objectsAdd(ObjectsPassing e,ObjectsPassing f)
   {
	   a=e.a+f.a;
	   b=e.b+f.b;
	   System.out.println("The Sum of a Values in Both objects is: "+a);
	   System.out.println("The Sum of b Values in Both objects is: "+b);
   }
}
