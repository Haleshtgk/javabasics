package com.xyz.basicsofprogramming.day15;

import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size if n:");
		int n = sc.nextInt();
		for(int i=1; i<n; i++) {
			for(int j=1; j<=n; j++) {
				if(j %2 == 0) {
					System.out.print("#");
				}else {
					System.out.print("%");
				}
			}
			System.out.println();
		}
	}
}
