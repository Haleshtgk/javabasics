package com.xyz.basicsofprogramming.day36;
class Animal{
	Animal() {
		// TODO Auto-generated constructor stub
		System.out.println("Hi from zero para Animal");
	}
	Animal(String name) {
		System.out.println("Hi from 1st para Animal");
	}
}
class Lion extends Animal{
	public Lion() {
		super();
		System.out.println("Hi from zero para Lion");
	}
	public Lion(String name) {
		super(name);
		System.out.println("Hi from one para Lion");
	}
//	public Lion(String name, String Country) {
//		super(name, country);
//	} bez of there is no 2 para cont is not present at the parent class
}
public class ConstructorCode5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal a1 = new Animal();
//		Animal a2 = new Animal("Hii");
		Lion l1 = new Lion();
		Lion l2 = new Lion("shre");

	}

}
