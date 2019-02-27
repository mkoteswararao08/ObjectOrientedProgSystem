package com.regnant;

public class Constructor1 
{
    int a,b,c;
    String s1,s2;
   
    Constructor1()
    {
	   a=1;
	   b=2;
    }
    Constructor1(int x,int y)
    {
	   a=x;
	   b=y;
    }
    Constructor1(String a,String b)
    {
	   s1=a;
	   s2=b;
    }
    Constructor1(Constructor1 x,Constructor1 y)
    {
    	a=x.a+y.a;
    	b=x.b+y.b;
    }
  
    void add()
    {
	   c=a+b;
	   
    }
    void disp()
    {
	   System.out.println("the value of a is:"+a);
	   System.out.println("the value of b is:"+b);
	   System.out.println("the addition of given values is:"+c);
    }
    void dispstring()
    {
	   System.out.println("the values of strings are:"+s1+" "+s2);
    }
}
