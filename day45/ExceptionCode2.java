package com.xyz.basicsofprogramming.day45;

import java.util.Scanner;

public class ExceptionCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Division operation started");
			System.out.println("Enter the num1");
			int num1 = sc.nextInt();
			System.out.println("Enter the num2");
			int num2 = sc.nextInt();
			int res = num1/num2;
			System.out.println("The result is :" +res);
			System.out.println("Division is completed");
			
			System.out.println("Array operation");
			System.out.println("Enter the size ");
			int size = sc.nextInt();
			int arr[] = new int[size];
			
			System.out.println("Enter the position ");
			int pos = sc.nextInt();
			System.out.println("Enter the new val");
			int val = sc.nextInt();
			arr[pos] = val;
			
			System.out.println("Data added");
			System.out.println("Array opertation is successfull");
		}
		catch(Exception e){
			System.out.println("Exception handled in catch block");
		}
	}

}
