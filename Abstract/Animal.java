package com.day6;

public abstract class Animal { 

	public abstract void eat();
	public abstract void sleep();
	public abstract void sound();
	public abstract void roam();
	
}
 class Cat extends Animal{
	 public void eat() {
		 System.out.println("Cat Eating fish and milk");
	}
	 public void sleep() {
		 System.out.println("the cat sleep on the bed");
	}
	 public void sound() {
		 System.out.println("the Cat Sound mew mew mew");
	 }
	 public void roam() {
		 System.out.println("Cat is Self Hunting");
	 }
 }
class Dog extends Animal{
	public void eat() {
		System.out.println("The Dog Eating Bone");
    }
	public void sleep() {
		System.out.println("Dog Sleep in the house");
	}
	public void sound() {
		System.out.println("Dog sound is wow wow wow");
	}
	public void roam() {
		System.out.println("Dog is Group Hunting");
	}

}
class Lion extends Animal{
	public void eat() {
		System.out.println("The Lion eat meet");
	}
	public void sleep() {
		System.out.println("Lion Sleep in the Jungle");
	}
	public void sound() {
		System.out.println("Lion Sound is Roaring");
	}
	public void roam()
	{
		System.out.println("Lion is Self Hunting");
	}

}
class Hippo extends Animal{
   public void eat(){
	   System.out.println("Hippo Eating Fish");
	 }
	 public void sleep() {
		System.out.println("Hippo Sleep in the Jungle");
	 }
	 public void sound() {
		System.out.println("Hippo Sound is Grunt");
	 }
	 public void roam() {
	    System.out.println("Hippo is Self Hunting");
	 }
}