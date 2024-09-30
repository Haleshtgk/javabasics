package com.xyz.basicsofprogramming.day31;

import java.util.Arrays;
import java.util.Scanner;


public class Anagram1 {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the String 1:");
		String str1 = sc.next();
		System.out.println("Enter the String 2:");
		String str2 = sc.next();
		
		//AnagramCheck a = new AnagramCheck();
		 if (AnagramCheck(str1, str2)) {
	            System.out.println(str1 + " and " + str2 + " are anagrams.");
	        } else {
	            System.out.println(str1 + " and " + str2 + " are not anagrams.");
	        }

	}

	private static boolean AnagramCheck(String str1, String str2) {
		if (str1.length() != str2.length()) {
            System.out.println("False");
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
		return Arrays.equals(charArray1, charArray2);
	}

}
