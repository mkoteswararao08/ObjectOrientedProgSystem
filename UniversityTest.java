package com.regnant;

public class UniversityTest //Multilevel inheritance
{
    public static void main(String []args)
    {
    	Student koti =new Student();
    	koti.uname="SATHYABAMA UNIVERSITY";
    	koti.ulocation="chennai";
    	koti.ccode=12345;
    	koti.cname=" Sathyabama Institute Of Science And Technology";
    	koti.clocation="chennai";
    	koti.rollNumber=3315204;
    	koti.studentName="molabanti koteswara rao";
    	koti.course="mechanical engineering";
    	koti.studentDisplay();
    	//koti.collegeDisplay();
       //koti.univDisplay();
    	
    	
    	
    	System.out.println();
    	System.out.println("-------------------------------------------------------");
    	System.out.println();
    	
    	
    	Student uma =new Student();
    	uma.uname="JNTUA";
    	uma.ulocation="Anantapur";
    	uma.ccode=56234;
    	uma.cname="n.b.k.r.i.s.t";
    	uma.clocation="nellore";
    	uma.rollNumber=435432;
    	uma.studentName="uma";
    	uma.course="civil engineering";
    	uma.studentDisplay();
    	//uma.collegeDisplay();
    	//uma.univDisplay();
    	
    	
    }
}
