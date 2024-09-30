package com.xyz.basicsofprogramming.day40;

import java.util.Scanner;

abstract class Shapes{
	double area;
	abstract void collect();
	abstract void calculate();
	void display() {
		
	}
}
class Circle extends Shapes{
	private double radius;
	private final double pi = 3.14768f;
	@Override
	void collect() {
		// TODO Auto-generated method st
		System.out.println("Collecting the circle data:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of ciecle");
		radius = sc.nextDouble();
	}

	@Override
	void calculate() {
		// TODO Auto-generated method stub
		System.out.println("Cal the area of circle");
		area = 2*pi*radius*radius;
		System.out.println("The area of circle is:"+ area);
	}
	
}
class Square extends Shapes{
	private double side;
	@Override
	void collect() {
		// TODO Auto-generated method stub
		System.out.println("Collecting the squre data:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of squre");
		side = sc.nextDouble();
	}

	@Override
	void calculate() {
		// TODO Auto-generated method stub
		System.out.println("Cal the area of squre");
		double area1 = side * side;
		System.out.println("The area of squre is:"+ area1);
	}
	
}
class Rectangle extends Shapes{
	private double length;
	private double breadth;
	@Override
	void collect() {
		// TODO Auto-generated method stub
		System.out.println("Collecting the rect data:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of squre");
		length = sc.nextDouble();
		System.out.println("Enter the breadth of squre");
		breadth = sc.nextDouble();
	}

	@Override
	void calculate() {
		// TODO Auto-generated method stub
		System.out.println("Cal the area of rect");
		double area2 = length * breadth;
		System.out.println("The area of rectangle is:"+ area2);
	}
	
}
class Geometry{
	void useShapes(Shapes s) {
		s.collect();
		s.calculate();
		s.display();
	}
}
public class Alloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		Square s = new Square();
		Rectangle r = new Rectangle();
		Geometry g = new Geometry();
		System.out.println("Circle");
		g.useShapes(c);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		System.out.println("Squre");
		g.useShapes(s);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		System.out.println("Rectangle");
		g.useShapes(r);
		System.out.println("++++++++++++++++++++++++++++++++++++");
	}

}
