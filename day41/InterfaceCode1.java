package com.xyz.basicsofprogramming.day41;
interface Calculator{
	int x = 10; //public static final
	void add();
	void mul();
	static void sub() {
		System.out.println("Inside static sub method of the interface");
	}
	default void div() {
		System.out.println("Inside default div method of the interface");
	}
}

class TestCode1 implements Calculator{

	@Override
	public void add() {
		System.out.println("Inside add() of the TestCode1 class");
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("Inside mul() of the TestCode1 class");
	}
	
}
class TestCode2 implements Calculator{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Inside add() of the TestCode2 class");
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("Inside mul() of the TestCode2 class");
	}
	
}
class TestCode3 implements Calculator{
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Inside add() of the TestCode3 class");
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("Inside mul() of the TestCode3 class");
	}
}
public class InterfaceCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calculator c = new Calculator();//Cannot instantiate the type calculator
		Calculator c2;//We can craete the reference of interface directly
		//create interface object using anonymous inner type
		Calculator c1 = new Calculator() {
			
			@Override
			public void mul() {
				// TODO Auto-generated method stub
				System.out.println("Inside the anonymous inner type represention from mul");
			}
			
			@Override
			public void add() {
				// TODO Auto-generated method stub
				System.out.println("Inside the anonymous inner type represention from add");
			}
		};
		System.out.println(c1);
	}

}
