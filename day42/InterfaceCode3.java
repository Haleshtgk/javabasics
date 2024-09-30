package com.xyz.basicsofprogramming.day42;
interface Calcy1{
	void add();
	void sub();
}
//interface Calcy2 implements Calcy1{
//	void div();
//	void mul();
//} bez interface is only the incomplete one there be we can't do this

interface Calcy3{
	void add();
	void sub();
}
interface Calcy4 extends Calcy3{
	void div();
	void mul();
}

public class InterfaceCode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
