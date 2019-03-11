package com.regnant;

public class AbstractTest //Abstract Example
{
   public static void main(String []args)
   {
	   Abstract ab=new AddClass();
	   ab.add(25,45);
	   ab.display();
	//   ab.xyz();
	   
	   AddClass a=new AddClass();
	   a.add(50, 81);
	   a.display();
   }
}
