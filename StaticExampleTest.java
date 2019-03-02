package com.regnant;

public class StaticExampleTest 
{
    public static void main(String []args)
    {
    	StaticExample koti=new StaticExample();
    	koti.stid=3315204;
    	koti.name="koteswararao";
    	koti.marks=507;
    	
    	
    	StaticExample murali=new StaticExample();
    	murali.stid=3315249;
    	murali.name="murali";
    	murali.marks=500;
    
    	
    	StaticExample sainath=new StaticExample();
    	sainath.stid=3315245;
    	sainath.name="sainath";
    	sainath.marks=520;
    	
    	koti.calculation();
    	koti.display();
    	StaticExample.total();
    	System.out.println("college name is:"+StaticExample.collegeName);
    	
    	murali.calculation();
    	murali.display();
    	StaticExample.total();
    	System.out.println("college name is:"+StaticExample.collegeName);

    	sainath.calculation();
    	sainath.display();
    	StaticExample.total();
    	System.out.println("college name is:"+StaticExample.collegeName);

    	
    			
    }
}
