package com.regnant;

public class StaticExample 
{
     int stid;
     String name;
     final static String collegeName="sathyabama university";
     final static double totalMarks=600;
     double marks;
     double per;
     
     void calculation()
     {
    	 per=(marks/totalMarks);
    	 per=per*100;
    	 
     }
     static void total()
     {
        System.out.println("total marks are:"+totalMarks);	 
     }
     
      void display()
     {
    	 System.out.println("");
    	 System.out.println("student number is:"+stid);
    	 System.out.println("student name is: "+name);
    	 System.out.println("percentage is :"+per);
    	 System.out.println("marks obtained are:"+marks);
    	
     }
   
}
