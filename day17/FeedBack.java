package com.xyz.basicsofprogramming.day17;

import java.util.Scanner;

public class FeedBack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==j && i<=(n/2)) || (i+j==(n-1))) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if((j==0 && i!=0 && i!=(n-1)) || 
				   (j==(n-1) && i!=0 && i!=(n-1)) || 
				   (i==0 && j!=0 && j!=(n-1)) || 
				   (i==n-1 && j!=0 && j!=(n-1)) ) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if((j==0 && i!=(n-1)) || 
					(j==n-1 && i!=(n-1)) || 
					(i==(n-1) && j!=0 && j!=(n-1))) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if((j==0) || 
				   (j==(n-1) && i<(n/2) && i!=0) || 
				   (i==0 && j!=(n-1)) || 
				   (i==n/2 && j!=(n-1)) ||
				   (i-j==(n/2))) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if((i==0) || (i==n/2) || (i==(n-1)) || (j==0)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if((i==j) || (i+j==(n-1))) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if((j==0) || 
				   (j==(n-1) && i<(n/2) && i!=0) || 
				   (i==0 && j!=(n-1)) || 
				   (i==n/2 && j!=(n-1)) ) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if((j==0) || i==(n-1)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if((i==0 && j!=0 && j!=(n-1))|| 
						i==(n/2) || 
						(j==0 && i!=0)|| 
						(j==(n-1) && i!=0)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if((j==0) || j==(n-1) || (i==j) ) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if((i==0 && j!=0 && j!=(n-1))|| 
						i==(n/2) || 
						(j==0 && i!=0)|| 
						(j==(n-1) && i!=0)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if((i==0) || (j==n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if((i==0) || (j==n/2) || (i==(n-1))) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if((j==0 && i!=0 && i!=(n-1)) || 
				   (j==(n-1) && i!=0 && i!=(n-1)) || 
				   (i==0 && j!=0 && j!=(n-1)) || 
				   (i==n-1 && j!=0 && j!=(n-1)) ) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if((j==0) || j==(n-1) || (i==j) ) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if((j==0) || j==(n-1) || (i==j && i<=n/2) || (i+j==(n-1) && j>=n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if((i==0 && j!=0 && j!=(n-1))|| 
						i==(n/2) || 
						(j==0 && i!=0)|| 
						(j==(n-1) && i!=0)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if((i==0 && j!=(n-1)) || 
						(i==(n-1) && j!=(n-1)) ||
						(j==0) || 
						(j==(n-1) && i!=0 && i!=(n-1))) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if((i==0) || (i==n/2) || (i==(n-1)) || (j==0)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			System.out.print("	");
			//T
			for(int j=0;j<n;j++) {
				if((i==0) || (j==n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if((j==0) || (i==n/2) || (j==(n-1))) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if((i==0) || (i==n/2) || (i==(n-1)) || (j==0)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			System.out.print("	");
			//C
			for(int j=0;j<n;j++) {
				if((i==0 && j!=0) ||
						(i==n-1  && j!=0) || 
						(j==0 && i!=0 && i!=(n-1))) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");

			//O
			for(int j=0;j<n;j++) {
				if((j==0 && i!=0 && i!=(n-1)) || 
				   (j==(n-1) && i!=0 && i!=(n-1)) || 
				   (i==0 && j!=0 && j!=(n-1)) || 
				   (i==n-1 && j!=0 && j!=(n-1)) ) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");

			//N
			for(int j=0;j<n;j++) {
				if((j==0) || j==(n-1) || (i==j) ) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			//C
			for(int j=0;j<n;j++) {
				if((i==0 && j!=0) ||
						(i==n-1  && j!=0) || 
						(j==0 && i!=0 && i!=(n-1))) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			//E
			for(int j=0;j<n;j++) {
				if((i==0) || (i==n/2) || (i==(n-1)) || (j==0)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");

			//P
			for(int j=0;j<n;j++) {
				if((j==0) || 
				   (j==(n-1) && i<(n/2) && i!=0) || 
				   (i==0 && j!=(n-1)) || 
				   (i==n/2 && j!=(n-1)) ) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			//T
			for(int j=0;j<n;j++) {
				if((i==0) || (j==n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			System.out.print("	");
			//E
			for(int j=0;j<n;j++) {
				if((i==0) || (i==n/2) || (i==(n-1)) || (j==0)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if((i==0 && j!=0 && j!=(n-1))|| 
						i==(n/2) || 
						(j==0 && i!=0)|| 
						(j==(n-1) && i!=0)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");

			//S
			for(int j=0;j<n;j++) {
				if((i==0 && j!=0) || 
				   (i==n/2 && j!=0 && j!=(n-1)) || 
				   (i==(n-1) && j!=(n-1)) ||
				   (j==0 && i!=0 && i<(n/2)) || 
				   (j==(n-1) && i>(n/2) && i!=(n-1))) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");

			//Y
			for(int j=0;j<n;j++) {
				if((i==j && i<=(n/2)) || (i+j==(n-1))) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			System.out.print("	");
			//T
			for(int j=0;j<n;j++) {
				if((i==0) || (j==n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");

			//O
			for(int j=0;j<n;j++) {
				if((j==0 && i!=0 && i!=(n-1)) || 
				   (j==(n-1) && i!=0 && i!=(n-1)) || 
				   (i==0 && j!=0 && j!=(n-1)) || 
				   (i==n-1 && j!=0 && j!=(n-1)) ) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			System.out.print("	");
			//U
			for(int j=0;j<n;j++) {
				if((j==0 && i!=(n-1)) || 
					(j==n-1 && i!=(n-1)) || 
					(i==(n-1) && j!=0 && j!=(n-1))) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");

			//N
			for(int j=0;j<n;j++) {
				if((j==0) || j==(n-1) || (i==j) ) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			//D
			for(int j=0;j<n;j++) {
				if((i==0 && j!=(n-1)) || 
						(i==(n-1) && j!=(n-1)) ||
						(j==0) || 
						(j==(n-1) && i!=0 && i!=(n-1))) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			//E
			for(int j=0;j<n;j++) {
				if((i==0) || (i==n/2) || (i==(n-1)) || (j==0)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");

			//R
			for(int j=0;j<n;j++) {
				if((j==0) || 
				   (j==(n-1) && i<(n/2) && i!=0) || 
				   (i==0 && j!=(n-1)) || 
				   (i==n/2 && j!=(n-1)) ||
				   (i-j==(n/2))) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");

			//S
			for(int j=0;j<n;j++) {
				if((i==0 && j!=0) || 
				   (i==n/2 && j!=0 && j!=(n-1)) || 
				   (i==(n-1) && j!=(n-1)) ||
				   (j==0 && i!=0 && i<(n/2)) || 
				   (j==(n-1) && i>(n/2) && i!=(n-1))) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			//T
			for(int j=0;j<n;j++) {
				if((i==0) || (j==n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if((i==0 && j!=0 && j!=(n-1))|| 
						i==(n/2) || 
						(j==0 && i!=0)|| 
						(j==(n-1) && i!=0)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");

			//N
			for(int j=0;j<n;j++) {
				if((j==0) || j==(n-1) || (i==j) ) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			//D
			for(int j=0;j<n;j++) {
				if((i==0 && j!=(n-1)) || 
						(i==(n-1) && j!=(n-1)) ||
						(j==0) || 
						(j==(n-1) && i!=0 && i!=(n-1))) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
	}
}
