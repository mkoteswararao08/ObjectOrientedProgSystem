package com.regnant;

public class ObjectsPassingTest //Objects passing Example
{
   public static void main(String [] args)
   {
	   ObjectsPassing x=new ObjectsPassing();
	   x.add(24, 76);
	   x.display();
	   
	   System.out.println("\n-----------------------------------\n");
	   ObjectsPassing y=new ObjectsPassing();
	   y.add(43, 87);
	   y.display();
	   
	   System.out.println("\n------------------------------------\n");
	   ObjectsPassing z=new ObjectsPassing();
	   z.objectsAdd(x);  //passing one object as parameter
	   
	   System.out.println("\n------------------------------------\n");
	   ObjectsPassing w=new ObjectsPassing();
	   w.objectsAdd(x, y); // passing two objects as parameters
   }
}
