package com.xyz.basicsofprogramming.day22;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the size:");
		int n = sc.nextInt();
		int[][] m1 = new int[n][n];
		int[][] m2 = new int[n][n];
		int[][] res = new int[n][n];
		
		System.out.println("Collecting 1st matrix");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				m1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Collecting 2st matrix");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				m2[i][j]=sc.nextInt();
			}
		}
		System.out.println("Calculating the result:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0; k<n; k++) {
				res[i][j] = res[i][j] + (m1[i][k] * m2[k][j]);
				}
		}
		}
		System.out.println("Dispalying the result:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(res[j][j]+" ");
	}
			System.out.println();
}
		
	}
}