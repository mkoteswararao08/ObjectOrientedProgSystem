package com.regnant;

public class ObjectsReturningTest //Objects Returning Example 
{
  public static void main(String []args)
  {   
	 
	  int c;
	  ObjectsReturning x=new ObjectsReturning();
	  c=x.add(25, 85);
	  System.out.println("The Sum of Values is:"+c);
	  
	  System.out.println("\n-----------------------------\n");
	  ObjectsReturning y=new ObjectsReturning();
	  c=y.add(98, 63);
	  System.out.println("The Sum of Values is:"+c);
	  
	   System.out.println("\n-----------------------------\n");
	   ObjectsReturning w =new ObjectsReturning();
	   w=w.ObjectsAdd(x,w);
	   System.out.println("The Value of a is:"+w.a);
	   System.out.println("The Value of b is:"+w.b);
	   
	  
	   System.out.println("\n----------------------------\n");
	   ObjectsReturning z=new ObjectsReturning(); 
	   z= z.objectsAdd(x, y, z);
	   System.out.println("The Sum of a Values in Both objects is: "+z.a);
	   System.out.println("The Sum of b Values in Both objects is: "+z.b);
	   
	  /* when you do w = z you're copying object references - you're not making a copy of the object - 
	     and so the variables w and z will both point to the same object.
         And so when you do your increments, they're all incrementing the same count field  */
	   
	  /* w=z;  //Both w and z points to the same object now as this is just a reference to the original data,no copying occurs here.
	   w.a=10;
	   w.b=20;
	   System.out.println(z.a);
	   System.out.println(z.b); */
  }
}
