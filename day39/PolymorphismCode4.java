package com.xyz.basicsofprogramming.day39;
class Forest{
	void hasAnimal1(Animal1 ref) {
		ref.walk();
		ref.eat();
		ref.run();
	}
}
public class PolymorphismCode4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elephant1 e = new Elephant1();
		Lion l = new Lion();
		Monkey m = new Monkey();
		Forest f = new Forest();
		
		System.out.println("Elephans");
		f.hasAnimal1(e);
		System.out.println("+++++++++++++++++++++++++++");
		
		System.out.println("Lion");
		f.hasAnimal1(l);
		System.out.println("+++++++++++++++++++++++++++");
		
		System.out.println("Monkey");
		f.hasAnimal1(m);
		System.out.println("+++++++++++++++++++++++++++");
	}
}
