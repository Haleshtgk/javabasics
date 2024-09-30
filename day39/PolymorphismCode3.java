package com.xyz.basicsofprogramming.day39;


class Animal1{
	void walk() {
		System.out.println("Animal is walking");
	}
	void eat() {
		System.out.println("Animal is eating");
	}
	void run() {
		System.out.println("Animal is runging");
	}
}
class Elephant1 extends Animal1{
	@Override
	void eat() {
		System.out.println("Elephant is eating");
	}
}
class Lion extends Animal1{
	@Override
	void eat() {
		System.out.println("Lion is eating");
	}
}
class Monkey extends Animal1{
	@Override
	void eat() {
		System.out.println("Monkey is eating");
	}
}
public class PolymorphismCode3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elephant1 e = new Elephant1();
		Lion l = new Lion();
		Monkey m = new Monkey();
		
		System.out.println("Elephans");
		e.walk();
		e.eat();
		e.run();
		System.out.println("+++++++++++++++++++++++++++");
		
		System.out.println("Lion");
		l.walk();
		l.eat();
		l.run();
		System.out.println("+++++++++++++++++++++++++++");
		
		System.out.println("Monkey");
		m.walk();
		m.eat();
		m.run();
		System.out.println("+++++++++++++++++++++++++++");
	}
}
