package com.regnant;

public class ThisCase3 
{
    int a,b;
    ThisCase3(int a ,int b)
    {
    	this.a=a;
    	this.b=b;
    }
    void display(ThisCase3 x)
    {
    	System.out.println("the value of a of current object:"+this.a);
    	System.out.println("the value of b of current object:"+this.b);
    	System.out.println("the value of a of destination object:"+x.a);
    	System.out.println("the value of b of destination object:"+x.b);
    }
}
