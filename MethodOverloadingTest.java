package com.regnant;

public class MethodOverloadingTest 
{
    public static void main(String []args )
    {
    	MethodOverloading a= new MethodOverloading();
    	a.add();
    	a.disp();
    	a.add(234,543);
    	a.disp();
    	a.add(13.4f,56.6f);
    	a.disp();
    	String s1;
    	s1=a.add("molabanti","koteswararao");
    	System.out.println("string value after concatenation is: "+s1);
    }
}
