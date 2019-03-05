package com.regnant;

public class ThisCase1 //This keyword Example 
{
    int a,b,c;
    String name;
    ThisCase1(int a,int b,int c,String name)  //Parameterized  constructor 
    {
    	this.a=a;
    	this.b=b;
    	this.c=c;
    	this.name=name;
    }
   
    void display(int a,int b,int c)
    {
    	System.out.println("the local variable contained a value is:"+a);
    	System.out.println("class level variable contained a value is:"+this.a);
    	System.out.println("the local variable contained b value is:"+b);
    	System.out.println("class level variable contained b value is:"+this.b);
    	System.out.println("the local variable contained c value is:"+c);
    	System.out.println("class level variable contained c value is:"+this.c);
    }
    void data(String name)
    {
    	System.out.println("local variable contained name is :"+name);
    	System.out.println("class level variable contained name is :"+this.name);
    	
    }
}
