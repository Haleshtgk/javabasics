package com.xyz.basicsofprogramming.day37;
class Animal{
	String name;
	String color;
	int age;
	String country;
	public Animal() {
		// TODO Auto-generated constructor stub
		this.name = "Tuffy";
		this.color = "white";
		this.age = 8;
		this.country = "India";
		System.out.println(getName());
		System.out.println(getColor());
		System.out.println(getAge());
		System.out.println(country);
		System.out.println("++++++++++++++++++++++++++++");
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getAge() {
		return age;
	}
	public String getCountry() {
		return country;
	}
}
class Elephant extends Animal{
	public Elephant() {
		// TODO Auto-generated constructor stub
		this.name = "Arjuna";
		this.color = "black";
		this.age = 18;
		this.country = "India";
	}
}
public class Inheritance6 {
	public static void main(String[] args) {
		Elephant e = new Elephant();
		System.out.println(e.getName());
		System.out.println(e.getColor());
		System.out.println(e.getAge());
		System.out.println(e.country);
		
	}
}
