package com.regnant;

public class ObjectsUniversity //In inheritance passing Objects Example
{
	
	String uname;
	String ulocation;
	void add(Student1 f,int x)
	{
	
		uname=f.uname;
		ulocation=f.ulocation;
		System.out.println("Base class"); 
	}
	void univDisplay()
	{
		 System.out.println("University name:"+uname);
	     System.out.println("University Location:"+ulocation);
		   
	}
}
class College1 extends ObjectsUniversity
{
	
	int ccode;
	String cname;
	String clocation;
	void add(Student1 s,float rollNumber)
	{
		add(s,98);
		ccode=s.ccode;
		cname=s.cname;
		clocation=s.clocation;
		System.out.println("Intermediate class"); 
	}
	void collegeDisplay()
	{
		
		System.out.println("College code:"+ccode);
		System.out.println("College name:"+cname);
		System.out.println("College location:"+clocation);
		
	}
}
class Student1 extends College1
{
	int rollNumber;
	String studentName;
	String course;
	float y=0;
	College1 add(Student1 x)
	{
		Student1 s1=new Student1();
		add(x, y);
		course=x.course;
		System.out.println("derived class");
		
		/*when there is only one child class object is returning then,
		we can directly write return type as child class name no need to write parent class name.
		if there is any condition to create only one object of given two class and return only one object
		then we can write  return type as parent class name  */
		
		return s1; //here no use of returning child class object and writing parent class name as return type
	}
	void studentDisplay()
	{
		System.out.println("RollNumber of Student is:"+rollNumber);
		System.out.println("Student name is:"+studentName);
	    System.out.println("Course of the Student is:"+course);
	    
	}
}
