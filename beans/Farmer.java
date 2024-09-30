package com.xyz.basicsofprogramming.beans;

import java.util.Scanner;

public class Farmer {
	double principle;
	static double rate;
	double time;
	double simple_interest;
	
	static {
		rate = 8.976;
	}
	
	public void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle: ");
		principle = sc.nextDouble();
		System.out.println("Enter the time req: ");
		time = sc.nextDouble();
	}
	public void calculate() {
		simple_interest = (principle*rate*time)/100;
	}
	public void display() {
		System.out.println("The simple interest is :" + simple_interest);
	}

}
