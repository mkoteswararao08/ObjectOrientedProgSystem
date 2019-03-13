package com.regnant;

public class Objects //Objects as a parameters Example  
{
   int id;
   String name;
   String college;
   String course;
}

class Abc
{
	void getStudentDetails(String name,String college, String course,Objects s)
	{
		s.name=name;
		s.college=college;
		s.course=course;
	}
	void getNumber(int id,Objects s)
	{
		s.id=id;			
	}
	void display(Objects s)
	{
		System.out.println("The id value of student is:"+s.id);
		System.out.println("The Name of student is :"+s.name);
		System.out.println("The Name of College is :"+s.college);
		System.out.println("The course of Student is:"+s.course);
	}
}
