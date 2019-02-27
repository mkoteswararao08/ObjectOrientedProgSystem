package com.regnant;

public class Constructor1Test 
{
   public static void main(String []args)
   {
	   System.out.println("constructor without parameters:___________");
	   Constructor1 d=new Constructor1();
	   d.add();
	   d.disp();
	   System.out.println("constructor with two int parameters:_________");
	   Constructor1 e=new Constructor1(23,45);
	   e.add();
	   e.disp();
	   System.out.println("constructor with two int parameters:__________");
	   Constructor1 i=new Constructor1(65,78);
	   i.add();
	   i.disp();
	   System.out.println("constructor with two string parameters: ___________");
	   Constructor1 f=new Constructor1("koti","molabanti");
	   f.dispstring();
	   System.out.println("constructor with two string parameters:___________ ");
	   Constructor1 g=new Constructor1("molabanti","koti");
	   g.dispstring();
	   System.out.println("constructor with two objects as parameters:____________");
	   Constructor1 h=new Constructor1(e,i);
	   h.add();
	   h.disp();
   }
}
