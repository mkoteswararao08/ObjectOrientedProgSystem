package com.regnant;

public class ObjectsReturning //Objects Returning Example 
{
   int a,b,c;
   
   int add(int a,int b)
   {
	   this.a=a;
	   this.b=b;
	   c=a+b;
	   return c;
   }
   
   ObjectsReturning ObjectsAdd(ObjectsReturning g,ObjectsReturning w)
   {
	   a=20+g.a;
	   b=40+g.b;
	   
	   
	   return w;
   }
   
   ObjectsReturning objectsAdd(ObjectsReturning d,ObjectsReturning e,ObjectsReturning z)
   {
	   a=d.a+e.a;
	   b=d.b+e.b;
	  
	   return z;
   }
  
}
