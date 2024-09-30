package com.xyz.basicsofprogramming.day32;

import java.util.Scanner;
class SumProd{
	long sum(String s) {
		long sum = 0;
		System.out.println("calculating the sum.....");
		for(int i=0; i<s.length();i++) {
			sum += s.charAt(i);
		}
		return sum;
		
	}
	long product(String s) {
		long product = 1;
		System.out.println("calculating the product.....");
		for(int i=0; i<s.length();i++) {
			product *= s.charAt(i);
		}
		return product;
		
	}
	
}
public class SumProdString {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str1 = sc.nextLine();
		SumProd sp = new SumProd();
		System.out.println("Sum of the string: "+sp.sum(str1));
		
		System.out.println("product of the string: "+sp.product(str1));
		

	}

}
