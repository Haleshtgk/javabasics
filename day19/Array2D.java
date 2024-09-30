package com.xyz.basicsofprogramming.day19;

import java.util.Scanner;

//WAP to store the name of the students
//soln: Since we have the only one entity whose data has to be collected we make use of 1D array
public class Array2D {
	static String[][] arr;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the class Count: ");
		int cls = sc.nextInt();
		System.out.println("Enter the Student Count: ");
		int stu = sc.nextInt();
		
		createArray(cls, stu);
		insertArrayData(cls, stu);
		displayArrayData(cls, stu);
	}
	private static void displayArrayData(int cls, int stu) {
		System.out.println("Displaying the array data");
		for(int i=0; i<cls; i++){
			System.out.println("Inside the class number - "+(i+1));
			for(int j=0; j<cls; j++){
				System.out.println("Inside the student number - "+(j+1)+ "is: " +arr[i][j]);
		}
	}
		
		
}
	private static void insertArrayData(int cls, int stu) {
		System.out.println("Collecting the array data");
		for(int i=0; i<cls; i++){
			System.out.println("Inside the class number - "+(i+1));
			for(int j=0; j<cls; j++){
				System.out.println("Inside the student number - "+(j+1));
				arr[i][j]=sc.next();
		}
		}
		
		
	}
	private static void createArray(int cls, int stu) {
		arr = new String[cls][stu];
		
	}

}

