package com.regnant;

public class ObjectsUniversityTest //In inheritance passing Objects Example
{
   public static void main(String []args)
   {
		Student1 koti = new Student1();
		koti.uname="SATHYABAMA UNIVERSITY";
    	koti.ulocation="chennai";
    	koti.ccode=12345;
    	koti.cname=" Sathyabama Institute Of Science And Technology";
    	koti.clocation="chennai";
    	koti.rollNumber=3315204;
    	koti.studentName="molabanti koteswara rao";
    	koti.course="mechanical engineering";
		koti.studentDisplay();
		koti.collegeDisplay();
		koti.univDisplay();
		
		System.out.println("\n------------------------------\n");
		
		Student1 sainath = new Student1();
		sainath.rollNumber=3315244;
		sainath.studentName="sainath";
		ObjectsUniversity  murali= sainath.add(koti);  
		sainath.studentDisplay();
		sainath.collegeDisplay();
		sainath.univDisplay();
		
		
		

   }
}
