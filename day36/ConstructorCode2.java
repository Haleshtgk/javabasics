package com.xyz.basicsofprogramming.day36;
class Tiger1{
	String name;
	String color;
	int age;
	String country;
	
	//zero para cont
	public Tiger1(){
		System.out.println("Hi from zero para const");
		
	}
	public Tiger1(String name) {
		this.name = name;
		System.out.println("Hi single para const");
	}
	public Tiger1(String name, String color) {
		this.name = name;
		this.color = color;
		System.out.println("Hi second para const");
	}
	public Tiger1(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
		System.out.println("Hi Three para const");
	}
	public Tiger1(String name, String color, int age, String country) {
		this.name = name;
		this.color = color;
		this.age = age;
		this.country = country;
		System.out.println("Hi four para const");
	}
	
	
}
public class ConstructorCode2 {

	public static void main(String[] args) {
		Tiger1 t1 = new Tiger1();
		Tiger1 t2 = new Tiger1("ABC");
		Tiger1 t3 = new Tiger1("EFG", "black");
		Tiger1 t4 = new Tiger1("HIJ", "White", 20);
		Tiger1 t5 = new Tiger1("KLM", "Yellow", 30, "India");
		

	}

}
