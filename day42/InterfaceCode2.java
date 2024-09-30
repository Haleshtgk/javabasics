package com.xyz.basicsofprogramming.day42;
class A{
}
class B{
}
//class C extends A, B{
//	//multiple inheritance is not supported by is-a relationship
//}

// soln is by interface

interface A1{
	//tagged interface bez there is any method present there
}
interface B1{
	//tagged interface bez there is any method present there
}
class C1 implements A1,B1{
	//multiple inheritance is supported by is-a relationship
}

interface A2{
	void add();
}
interface B2{
	void sub();
}
class C2 implements A2,B2{

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("Hi from sub() of C2 Class");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Hi from add() of C2 Class");
	}
	//multiple inheritance is supported by is-a relationship
}

public class InterfaceCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
