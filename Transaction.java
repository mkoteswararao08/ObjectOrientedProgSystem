package com.regnant;

public interface Transaction // Interface Example 
{
  public static int  ba=1000;
  boolean deposit(int accNo, int amount);
  boolean withdraw(int accNo, int amount, String password);
}

class SBI implements Transaction
{
    int balance=10000;
	
	public boolean deposit(int accNo, int amount) 
	{
		System.out.println("Balance before Transaction in SBI is:"+balance);
		balance=amount+balance;
		System.out.println("Balance after deposit in SBI is:"+balance);
			return true;
	}

	public boolean withdraw(int accNo, int amount, String password) 
	{
		System.out.println("Balance before Transaction is:"+balance);
		balance =balance-amount;
		System.out.println("Balance after withdraw is:"+balance);
		return true;
	}
	
}

class ICICI implements Transaction
{
    int balance=28333;

	public boolean deposit(int accNo, int amount) 
	{
		System.out.println("Balance before Transaction in ICICI is:"+balance);
     	balance=amount+balance;
	    System.out.println("Balance after deposit in ICICI is:"+balance);
		return true;

	}	

	
	public boolean withdraw(int accNo, int amount, String password) 
	{
		System.out.println("Balance before Transaction is:"+balance);
		balance =balance-amount;
		System.out.println("Balance after withdraw is:"+balance);
		return true;
		
	}
	
}