package com.xyz.basicsofprogramming.day35;

class Dog{
	String name;
	String color;
	String breed;
	int cost;
	int age;
	//generic setter
	void setData(String name, String color, String breed, int cost, int age) {
		name = name;
		color = color;
		breed = breed;
		cost = cost;
		age = age;
	}
	//generic getter
	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(cost);
		System.out.println(age);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		breed = breed;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		cost = cost;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		age = age;
	}
}
public class ShadowingProblem {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.setData("Rocky", "White", "GR", 7000, 5);
		d1.getData();
		System.out.println("++++++++++++++++++++++++++++++++++++");
		Dog d2 = new Dog();
		d2.setName("Tommy");
		d2.setColor("black");
		d2.setBreed("Pug");
		d2.setCost(5000);
		d2.setAge(2);
		System.out.println(d2.getName());
		System.out.println(d2.getColor());
		System.out.println(d2.getBreed());
		System.out.println(d2.getAge());
		System.out.println(d2.getCost());
	}

}

