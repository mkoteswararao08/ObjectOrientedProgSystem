package com.regnant;

public class University //Multilevel inheritance
{
   String uname;
   String ulocation;
   void univDisplay()
   {
	   System.out.println("University name:"+uname);
	   System.out.println("University Location:"+ulocation);
	   
   }
}//Base class
class College extends University
{
	
	int ccode;
	String cname;
	String clocation;
	void collegeDisplay()
	{
		
		System.out.println("College code:"+ccode);
		System.out.println("College name:"+cname);
		System.out.println("College location:"+clocation);
		univDisplay();
	}
}//Intermediate class
class Student extends College
{
	int rollNumber;
	String studentName;
	String course;
	
	void studentDisplay()
	{
		System.out.println("RollNumber of Student is:"+rollNumber);
		System.out.println("Student name is:"+studentName);
	    System.out.println("Course of the Student is:"+course);
	    collegeDisplay();
	}
}//Derived class