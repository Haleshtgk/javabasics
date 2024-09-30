package com.xyz.basicsofprogramming.day18;

import java.util.Scanner;

//WAP to store the name of the students
//soln: Since we have the only one entity whose data has to be collected we make use of 1D array
public class ArrayCode1 {
	static String arr[];
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Size: ");
		int size = sc.nextInt();
		
		createArray(size);
		insertArrayData(size);
		displayArrayData(size);
	}
	private static void displayArrayData(int size) {
		System.out.println("Displaying the array data");
		for(int i=0; i<size; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	private static void insertArrayData(int size) {
		System.out.println("Collecting the array data");
		for(int i=0; i<size; i++){
			arr[i] = sc.next();
		}
		
		
	}
	private static void createArray(int size) {
		arr = new String[size];
		
	}

}
