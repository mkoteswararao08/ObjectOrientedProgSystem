package com.regnant;

import java.util.Scanner;

public class ObjectsTransactionTest //In Interface passing Objects as a parameters Example
{
	static SBI1 doTransaction(ObjectsTransaction it)
	   {
		  
	        SBI1 sb=it.deposit(251412151,52200);
	       
	      
		    return sb; // we can return implemented class object and write return type as implemented class name
		   //return it;  but we can't return interface object and write return type as implemented class name 
	   }
	static ObjectsTransaction  doTransactionwithdraw(ObjectsTransaction it)
	   {
		 
	       
		    SBI1 sb= it.withdraw(21513165, 2500,"2008");
		    System.out.println("Account Number is:"+sb.accNo);
 	        System.out.println("amount is:"+sb.amount);
 	        System.out.println("Balance after deposit in SBI is:"+sb.balance);
		    
		    if(sb.x==true)
		    {
			 System.out.println("Withdraw Is Successfully");   
		    }
		    else
		    {
			   System.out.println("Withdraw Is UnSuccessfully");
		    }
		   return sb;  // we can return implemented class object and we can also write return type as interface name
		   
	   }   
	
	 public static void main(String []args)
     {
			Scanner s=new Scanner(System.in);
	    	ObjectsTransaction it=null;
	    	it= new SBI1(); 		
	 		System.out.println("Enter what type of Transaction you want");
	 	   	System.out.println("\tDEPOSIT -1");
	 	   	System.out.println("\tWithdraw -2");
	 	   	int y=s.nextInt();
	 	   	SBI1 s1=new SBI1();
	 	   	System.out.println("--------------------------");
	 	   	if(y==1)
	 	   	{
	            s1=doTransaction(it);
	            System.out.println("Account Number is:"+s1.accNo);
	 	        System.out.println("amount is:"+s1.amount);
	 	        System.out.println("Balance after deposit in SBI is:"+s1.balance);
	 	        
	 	        if(s1.x==true)
	 		    {
	 			 System.out.println("DEPOSIT Is Successfully");   
	 		    }
	 		    else
	 		    {
	 			   System.out.println("DEPOSIT Is UnSuccessfully");
	 		    }
	 	 	   	
	        	
	 	    }
	 	   	else if(y==2)
	 	   	{
	 		     it=doTransactionwithdraw(it);
	   		
	 	    }	   	

     }
   
}
