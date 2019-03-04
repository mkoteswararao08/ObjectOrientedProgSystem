package com.regnant;

public class Animal //Association in JAVA
{
	String animalName;
	int noOfLegs;
    String isVegetarian;
    String animalColor;
    int age;
    int weight;
    void weight()
    {
    	System.out.println("Animal weight is:"+weight+" kg");
    }
    
}
class Human
{
	Animal a=new Animal();
	String name;
	int humanAge;
	String location;
	void display()
	{
		System.out.println("Human name is :"+name);
		System.out.println("Human Age is :"+humanAge);
		System.out.println("Human living location is:"+location);
	}
	void animalDisplay()
	{
		System.out.println("the Animal name is :"+a.animalName);
		System.out.println("The animal having legs are:"+a.noOfLegs);
		System.out.println("The animal Age is :"+a.age);
		System.out.println("The animal color is:"+a.animalColor);
		System.out.println("The animal is vegetarian or not:"+a.isVegetarian);
		
	}
	
}
