package com.regnant;

public class InterestRate // polymorphism and Dynamic Binding
{
   double interest;
   double principle;
   double duration;
   double rate;
   void calculation()
   {
	  System.out.println("parent class"); 
   }
   void display()
   {
	   System.out.println("parent class");
   }
   void amount()  //here amount method is overridden w.r.to CurrentAccount class but not overridden w.r.to SavingsAccount class 
   {
	   System.out.println("amount method from parent class");
   }
   
}
class SavingsAccount extends InterestRate
{
	void calculation()
	{
		interest=(principle*duration*rate)/100;
		super.calculation();
		
	}
	void display()
	{
		System.out.println("Interest of amount in Savings Account is :"+interest);
	}
	void displayAmount()
	{
		System.out.println("The principle amount is:"+principle);
		System.out.println("The Duration of amount is:"+duration);
		System.out.println("The Rate of interest is:"+rate);
	}
}
class CurrentAccount extends InterestRate
{
	void calculation()
	{
		interest=(principle*duration*rate)/100;
	}
	void display()
	{
		System.out.println("Interest of amount in Current Account is :"+interest);
	}
	void amount()
    {
		System.out.println("amount method from child class");
    }
	
	
}