package com.regnant;

public class AnimalTest //Association in JAVA
{
   public static void main(String []args)
   {
	   Human koti =new Human();
	   koti.name="koteswara rao";
	   koti.humanAge=23;
	   koti.location="chennai";
	   koti.a.animalName="Dog";
	   koti.a.noOfLegs=4;
	   koti.a.age=5;
	   koti.a.weight=22;
	   koti.a.animalColor="black";
	   koti.a.isVegetarian="Non-Vegetarian";
	   koti.display();
	   koti.animalDisplay();
	   koti.a.weight();
	   
	   System.out.println();
	   System.out.println("---------------------------------");
       System.out.println();
       
       Human uma =new Human();
       uma.name="uma";
       uma.humanAge=23;
       uma.location="nellore";
       uma.a.animalName="elephant";
       uma.a.age=40;
       uma.a.noOfLegs=4;
       uma.a.weight=5400;
       uma.a.animalColor="white and black";
       uma.a.isVegetarian=" Veg";
       uma.display();
       uma.animalDisplay();
       uma.a.weight();
       
   }
}
