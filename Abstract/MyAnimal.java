package com.day6;

public class MyAnimal {

	public static void main(String[] args) {
		System.out.println("Description Of Cat");
		System.out.println("********************");
		Animal cat=new Cat();
		cat.eat();
		cat.sleep();
		cat.sound();
		cat.roam();
		
		System.out.println("\n");
		
		System.out.println("Description Of Dog");
		System.out.println("********************");
		Animal dog=new Dog();
		dog.eat();
		dog.sleep();
		dog.sound();
		dog.roam();
		
		System.out.println("\n");
		
		System.out.println("Description Of Lion");
		System.out.println("********************");
		Animal lion=new Lion();
		lion.eat();
		lion.sleep();
		lion.sound();
		lion.roam();
		
		System.out.println("\n");
		
		System.out.println("Description Of Hippo");
		System.out.println("********************");
		Animal hippo=new Hippo();
		hippo.eat();
		hippo.sleep();
		hippo.sound();
		hippo.roam();
	}

}
