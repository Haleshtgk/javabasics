package com.xyz.basicsofprogramming.day37;
class Parent{
	static int accno;
	static int password;

	void setCredentials(int accno,int password ) {
		this.accno = accno;
		this.password = password;
	}
	void display() {
		System.out.println("Parent Accno. = "+accno);
		System.out.println("Parent password = "+ password);
	}
}
class child1 extends Parent{
	void alterParentData(int accno, int password) {
		this.accno = accno;
		this.password = password;
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child1 c1 = new child1();
		Parent p = new Parent();
		p.setCredentials(1111, 2222);
		c1.alterParentData(1111, 4444);
		p.display();
	}

}
