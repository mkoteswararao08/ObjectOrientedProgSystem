package com.regnant;

public class MethodOverloading 
{   
	double a,b,c;
    void add()
    {
      a=4;
      b=10;
      c=a+b;
    }
    void add(int x,int y)
    {
    	a=x;
    	b=y;
    	c=a+b;
    }
    void add(float x,float y)
    {
    	a=x;
    	b=y;
    	c=a+b;
    }
    String add(String x,String y)
    {
    	String z;
    	z=x+y;
    	return z;
    }
    void disp()
    {
    	System.out.println("value of a is:"+a);
    	System.out.println("value of b is: "+b);
    	System.out.println("The sum of given two numbers is:"+c);
    }
}
