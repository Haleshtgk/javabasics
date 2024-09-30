package com.xyz.basicsofprogramming.day22;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the size:");
		int n = sc.nextInt();
		int[][] m1 = new int[n][n];
		System.out.println("Collecting 1st matrix");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				m1[i][j]=sc.nextInt();
			}
		}
		
	}
}
			



