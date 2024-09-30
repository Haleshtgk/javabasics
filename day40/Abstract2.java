package com.xyz.basicsofprogramming.day40;



abstract class Animal1{
	abstract void walk();
	abstract void eat();
	void run() {
		System.out.println("Animal is runging");
	}
}
class Forest{
	void hasAnimals1(Animal1 ref){
		ref.walk();
		ref.eat();
		ref.run();
	}
}
class Elephant1 extends Animal1{
	@Override
	void eat() {
		System.out.println("Elephant is eating");
	}

	@Override
	void walk() {
		// TODO Auto-generated method stub
		System.out.println("Elephant is walking");
	}
}
class Lion extends Animal1{
	@Override
	void eat() {
		System.out.println("Lion is eating");
	}

	@Override
	void walk() {
		// TODO Auto-generated method stub
		System.out.println("Lion is walking");
	}
}
class Monkey extends Animal1{
	@Override
	void eat() {
		System.out.println("Monkey is eating");
	}

	@Override
	void walk() {
		// TODO Auto-generated method stub
		System.out.println("Monkey is walk");
	}
}
public class Abstract2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elephant1 e = new Elephant1();
		Lion l = new Lion();
		Monkey m = new Monkey();
		Forest f = new Forest();
		System.out.println("Elephans");
		f.hasAnimals1(e);
		System.out.println("+++++++++++++++++++++++++++");
		
		System.out.println("Lion");
		f.hasAnimals1(l);
		System.out.println("+++++++++++++++++++++++++++");
		
		System.out.println("Monkey");
		f.hasAnimals1(m);
		System.out.println("+++++++++++++++++++++++++++");
	}

}