package com.xyz.basicsofprogramming.day22;

public class Program1 {
	public static void main(String[] args) {
		int[][] m1 = {
				{34, 56},
				{78, 88}
		};
		int[][] m2 = {
				{22, 67},
				{91, 154}
		};
		int[][] result = new int[2][2];
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				result[i][j] = m1[i][j]+m2[i][j];
				//System.out.println("Sum of two matrix is :" +(result[i][j]));
				System.out.print(result[i][j]+ " ");
			}
			System.out.println();
		}
		//for(int i=0; i<2; i++) {
			//for(int j=0; j<2; j++) {
				//System.out.print(result[i][j]+ " ");
			//}
			//System.out.println();
		//}
	}
}

