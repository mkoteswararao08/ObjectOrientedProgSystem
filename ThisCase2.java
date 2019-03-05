package com.regnant;

public class ThisCase2
{
   int a,b;
   ThisCase2(int a,int b)
   {
	   this.a=a;
	   this.b=b;
	   this.a=this.a+10;
	   this.b=this.b+10;
	   a=a+5;
	   b=b+5;
	   System.out.println("local variable a value is:"+a);
	   System.out.println("local variable b value is:"+b);
	   
   }
   void display()
   {
	   System.out.println("value of a is:"+this.a);
	   System.out.println("value of b is:"+this.b );
   }
}
