package com.xyz.basicsofprogramming.day31;

import java.util.Scanner;

class Counting{
	int count;
	int spcount(String s) {
		System.out.println("Counting the space is initiated...");
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		return count;
	}
}
public class WordCount {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str1 = sc.next();
		
		Counting c = new Counting();
		int spcount = c.spcount(str1);
		int word_count = spcount+1;
		System.out.println("The word count in the given String is "+ word_count);
	}

}
