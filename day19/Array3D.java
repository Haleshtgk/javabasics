package com.xyz.basicsofprogramming.day19;

import java.util.Scanner;

//WAP to store the marks of the students from each school
//soln: Since we have the 3 entity whose data has to be collected we make use of 3D array
public class Array3D {
	static String[][][] arr;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the school Count: ");
		int sch = sc.nextInt();
		System.out.println("Enter the class Count: ");
		int cls = sc.nextInt();
		System.out.println("Enter the Student Count: ");
		int stu = sc.nextInt();
		
		createArray(sch, cls, stu);
		insertArrayData(sch, cls, stu);
		displayArrayData(sch, cls, stu);
	}
	private static void displayArrayData(int sch, int cls, int stu) {
		System.out.println("Displaying the array data");
		for(int i=0; i<sch; i++){
			System.out.println("Inside the school number - "+(i));
			for(int j=0; j<cls; j++){
				System.out.println("Inside the class number - "+(j));
				for(int k=0; k<stu; k++) {
					System.out.println("Inside the student number - "+(k+1)+"is -" +arr[i][j][k]);
		}
		}
		}
		
		
	}
	private static void insertArrayData(int sch, int cls, int stu) {
		System.out.println("Collecting the array data");
		for(int i=0; i<sch; i++){
			System.out.println("Inside the school number - "+(i));
			for(int j=0; j<cls; j++){
				System.out.println("Inside the class number - "+(j));
				//arr[i][j]=sc.next();
				for(int k=0; k<stu; k++) {
					System.out.println("Inside the student number - "+(k+1));
				arr[i][j][k]=sc.next();
		}
		}
		}
	}
		
		
	private static void createArray(int sch,int cls, int stu) {
		arr = new String[sch][cls][stu];
		
	}

}
