package com.xyz.basicsofprogramming.day20;

import java.util.Scanner;

//WAP to store the marks of the student from each class
/* 
 * 	class 		student
 * 	0			  	2
 * 	1				3
 * 	2				4
 * 	3				2
 * */
public class Array2DJagged {
	static String[][] arr;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the class Count: ");
		int cls = sc.nextInt();
		
		createArray(cls);
		insertArrayData();
		displayArrayData();
	}
	private static void displayArrayData() {
		System.out.println("Displaying the array data");
		for(int i=0; i<arr.length; i++){
			System.out.println("Inside the class number - "+(i+1));
			for(int j=0; j<arr[i].length; j++){
				System.out.println("Inside the student number - "+(j+1)+ "is: " +arr[i][j]);
		}
		}
		
		
	}
	private static void insertArrayData() {
		System.out.println("Collecting the array data");
		for(int i=0; i<arr.length; i++){
			System.out.println("Inside the class number - "+(i+1));
			for(int j=0; j<arr[i].length; j++){
				System.out.println("Inside the student number - "+(j+1));
				arr[i][j]=sc.next();
		}
	}
		
		
	}
	private static void createArray(int cls) {
		arr = new String[cls][];
		//using the jagged concept we shall complete the array
		System.out.println("Collecting the student count: ");
		for(int i=0; i<cls; i++) {
			System.out.println("Enter the student count in the class: "+(i+1));
			arr[i] = new String[sc.nextInt()];
		}
		
	}

}
