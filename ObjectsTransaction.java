package com.regnant;

public interface ObjectsTransaction //In Interface passing Objects as a parameters Example
{
   
    SBI1 deposit(int accNo, int amount);
    SBI1 withdraw(int accNo, int amount, String password); 
  
}

class SBI1 implements ObjectsTransaction
{

	int balance=10000;
	int accNo;
	int amount;
	boolean x;
	public SBI1 deposit(int accNo, int amount) 
	{
		System.out.println("Balance before Transaction in SBI is:"+balance);
		SBI1 sb=new SBI1();
		sb.balance=balance+amount;
		sb.accNo=accNo;
		sb.amount=amount;
		sb.x=true;
		return sb;
	}
	public SBI1 withdraw(int accNo, int amount, String password) 
	{
		System.out.println("Balance before Transaction is:"+balance);
		SBI1 sb=new SBI1();
		sb.balance =balance-amount;
		sb.accNo=accNo;
		sb.amount=amount;
		sb.x=true; 
	    return sb;    
	}
	
}
