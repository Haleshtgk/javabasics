package com.xyz.basicsofprogramming.day36;
class DogFull{
	String name;
	String color;
	String country;
	String breed;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public DogFull() {
		// TODO Auto-generated constructor stub
	}
	public DogFull(String name) {
		super();
		this.name = name;
	}
	public DogFull(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	public DogFull(String name, String color, String country) {
		super();
		this.name = name;
		this.color = color;
		this.country = country;
	}
	public DogFull(String name, String color, String country, String breed) {
		super();
		this.name = name;
		this.color = color;
		this.country = country;
		this.breed = breed;
	}
	public DogFull(String name, String color, String country, String breed, int age) {
		super();
		this.name = name;
		this.color = color;
		this.country = country;
		this.breed = breed;
		this.age = age;
	}
	
}
public class ConstructorCode6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogFull df = new DogFull();
	}

}
