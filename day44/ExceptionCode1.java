package com.xyz.basicsofprogramming.day44;

import java.util.Scanner;

public class ExceptionCode1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Division operation started");
		System.out.println("Enter the num1");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2");
		int num2 = sc.nextInt();
		int res = num1/num2;
		System.out.println("The result is :" +res);
	}
}
