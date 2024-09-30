package com.xyz.basicsofprogramming.day13;

import com.xyz.basicsofprogramming.beans.Farmer;

public class LunchFarmer {

	public static void main(String[] args) {
		Farmer f1 = new Farmer();
		Farmer f2 = new Farmer();
		Farmer f3 = new Farmer();
		Farmer f4 = new Farmer();
		
		System.out.println("Farmer - 1");
		f1.collectData();
		f1.calculate();
		f1.display();
		System.out.println("---------------------");

		System.out.println("Farmer - 2");
		f2.collectData();
		f2.calculate();
		f2.display();
		System.out.println("---------------------");

		System.out.println("Farmer - 3");
		f3.collectData();
		f3.calculate();
		f3.display();
		System.out.println("-----------------------");

		System.out.println("Farmer - 4");
		f4.collectData();
		f4.calculate();
		f4.display();
		System.out.println("------------------------");

	}

}
