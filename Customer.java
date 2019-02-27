package com.regnant;

public class Customer
{
     int accno;
     int salary;
     int limit;
     int balance;
     String name="molabanti koteswararao";
     void withdraw()
     {
    	 System.out.println("withdraw limit is :"+limit);
    	 System.out.println("remaining balance is:"+balance);
     }
     void deposit()
     {
    	 System.out.println("enter the money to be deposited:"+10000);
    	 System.out.println("money is deposited. ");
     }
     
}
