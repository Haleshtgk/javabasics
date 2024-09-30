package com.xyz.basicsofprogramming.day39;
abstract class Parent{
	abstract void eatFood();
	void sleep() {
		System.out.println("Sleep min of 8hrs");
	}
	void work() {
		System.out.println("Work min of 8hrs");
	}
	abstract void exercise();
}
class child1 extends Parent{

	@Override
	void eatFood() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void exercise() {
		// TODO Auto-generated method stub
		
	}
	
}
abstract class child2 extends Parent{
	
}
public class Abstract {
	public static void main(String[] args) {
		
	}
}
