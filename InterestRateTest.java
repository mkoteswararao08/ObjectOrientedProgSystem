package com.regnant;

import java.util.Scanner;

public class InterestRateTest //polymorphism and Dynamic Binding
{
   public static void main(String [] args)
   {
	   Scanner s=new Scanner(System.in);
	   InterestRate in=null;
	   int x;
	   System.out.println("Choose the type of account :");
	   System.out.println("\t If Savings Account then enter 0");
	   System.out.println("\t If Current Account then enter 1");
	   x=s.nextInt();
	   if(x==0)
	   {
		   in= new SavingsAccount();
		   in.rate=4;
	   }
	   else
	   {
		   in = new CurrentAccount();
		   in.rate=6;
	   }
	   
	   
	   System.out.println("Enter the principle amount value:");
	   in.principle=s.nextDouble();
	   System.out.println("Enter the duration of amount kept:");
	   in.duration=s.nextDouble();
	   
	   
	   in.calculation();
	  // in.displayamount();  //using dynamic binding object creation the normal methods which are not overriding and present in  child class can't be called
	   in.display();
	   in.amount();  //we can call parent methods which are not overriding by child class
	   
	  /* System.out.println("\n-----------------------------------\n");
	   SavingsAccount sa=new SavingsAccount();
	   sa.principle=10000;
	   sa.duration=1;
	   sa.rate=4;
	   sa.calculation();
	   sa.displayAmount();
	   sa.display();
	   
	   System.out.println("\n----------------------------\n");
	   CurrentAccount ca= new CurrentAccount();
	   ca.principle=10000;
	   ca.duration=1;
	   ca.rate=6;
	   ca.calculation();
	   ca.display();
	   ca.amount();*/
   }
}
