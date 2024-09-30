package com.xyz.basicsofprogramming.day30;

import java.util.Scanner;

public class PalindromeString {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String: ");
			String str1 = sc.next();
			String str2 = "";
			//formating of reversed string
			for(int i=str1.length()-1; i>=0; i--) {
				str2 = str2 + str1.charAt(i);
			}
			
			if(str1.equalsIgnoreCase(str2)==true) {
				System.out.println("The string is palindrome");
			}
			else {
				System.out.println("The string is not a palindrome");
			}
			System.out.println("---------------------------------------------");
			
			//without using the built in methods
			int flag = 0;
			//check the str are of equal length
			if(str1.length() == str2.length()) {
				for(int i=0; i<str1.length(); i++) {
					//logic to compare the str
					if(str1.charAt(i) != str2.charAt(i)) {
						flag = -1;
					}
				}
			}
			if(flag == 0) {
				System.out.println("The string is palindrome");
			}
			else {
				System.out.println("The string is not a palindrome");
			}
			
			
		}
}
