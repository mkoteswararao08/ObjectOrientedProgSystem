package com.regnant;

public class SuperKeyword2 //Super Keyword at method level
{
   int x,y;
   void display(int x,int y)
   {
	   this.x=x;
	   this.y=y;
	   System.out.println("the value of x is:"+this.x);
	   System.out.println("the value of y is:"+this.y);
   }
}
class Shape1 extends SuperKeyword2
{
	int a,b;
	Shape1(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void display(int x,int y)  //overridden method  
	{
		System.out.println("the value of a is:"+a);
		System.out.println("the value of b is:"+b);
		super.display(x,y);   // calling overridden method using super keyword 
	}
	

}
