package com.xyz.basicsofprogramming.day43;
class Heart{
	int weight;
	int pulse;
	public Heart(int weight, int pulse) {
		super();
		this.weight = weight;
		this.pulse = pulse;
	}
	public int getWeight() {
		return weight;
	}
	public int getPulse() {
		return pulse;
	}
	
}
class Brain{
	int weight;
	int iq_level;
	public Brain(int weight, int iq_level) {
		super();
		this.weight = weight;
		this.iq_level = iq_level;
	}
	public int getWeight() {
		return weight;
	}
	public int getIq_level() {
		return iq_level;
	}
	
}
class Bike{
	String name;
	int cost;
	public Bike(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public int getCost() {
		return cost;
	}
	
}
class Watch{
	String brand;
	int cost;
	public Watch(String brand, int cost) {
		super();
		this.brand = brand;
		this.cost = cost;
	}
	public String getBrand() {
		return brand;
	}
	public int getCost() {
		return cost;
	}
	
}
class Human{
	Heart h = new Heart(5, 100);
	Brain b = new Brain(5, 100);
}
class Student extends Human{
	void hasBike(Bike b) {
		System.out.println(b.name);
		System.out.println(b.cost);
	}
	void hasWatch(Watch w) {
		System.out.println(w.brand);
		System.out.println(w.cost);
	}
}
public class Launch3 {

	public static void main(String[] args) {
		Student s = new Student();
		Human hu = new Human();
		Bike b = new Bike("DUK", 300000);
		Watch w = new Watch("Boat", 3000);
		System.out.println("Representation using enclosing object");
		System.out.println(hu.h.getWeight());
		System.out.println(hu.h.getPulse());
		System.out.println(hu.b.getWeight());
		System.out.println(hu.b.getIq_level());
		s.hasBike(b);
		s.hasWatch(w);
		System.out.println("+++++++++++++++++++++++++++++++++");
		s= null;
		hu = null;
		System.out.println("Representation without using enclosing object");
		System.out.println(b.getName());
		System.out.println(b.getCost());
		System.out.println(w.getBrand());
		System.out.println(w.getCost());
		System.out.println("+++++++++++==================++++++++++++");
		System.out.println(hu.h.getWeight());
		System.out.println(hu.h.getPulse());
		System.out.println(hu.b.getWeight());
		System.out.println(hu.b.getIq_level());
		s.hasBike(b);
		s.hasWatch(w);
	}

}
