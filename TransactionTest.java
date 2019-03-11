package com.regnant;

import java.util.Scanner;

public class TransactionTest // Interface Example
{
   static void doTransaction(String bank)
   {
	   Transaction it=null;
	   if(bank.equals("SBI"))
	   {
		   it=new SBI();
	   }
	   else if(bank.equals("ICICI"))
	   {
		   it=new ICICI();
	   }
   
       boolean x= it.deposit(251412151,52200);
	   if(x==true)
	   {
		 System.out.println("DEPOSIT Is Successfully");   
	   }
	   else
	   {
		   System.out.println("DEPOSIT Is UnSuccessfully");
	   }
	   
   }
   
   static void  doTransactionwithdraw(String bank)
   {
	   Transaction it=null;
	   if(bank.equals("SBI"))
	   {
		   it=new SBI();
	   }
	   else if(bank.equals("ICICI"))
	   {
		   it=new ICICI();
	   }
       
	   boolean y= it.withdraw(21513165, 2500,"2008");
	   if(y==true)
	   {
		 System.out.println("Withdraw Is Successfully");   
	   }
	   else
	   {
		   System.out.println("Withdraw Is UnSuccessfully");
	   }   
   }   
    public static void main(String []args)
    {
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter what type of Transaction you want");
    	System.out.println("\tDEPOSIT -1");
    	System.out.println("\tWithdraw -2");
    	int x=s.nextInt();
    	if(x==1)
    	{
         	doTransaction("SBI");
         	//doTransaction("ICICI");
    	}
    	else if(x==2)
    	{
    		doTransactionwithdraw("SBI");
    		//doTransactionwithdraw("ICICI");
    	}
    }
}