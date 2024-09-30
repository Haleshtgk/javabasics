package com.xyz.basicsofprogramming.day28;

public class StringPgm2 {
	public static void main(String[] args) {
		String s1 = "rama";
		String s2 = "rama";
		
		if(s1.equals(s2) == true) {
			System.out.println("Strings are Equal");
		}
		else {
			System.out.println("Strings are not Equal");
		}
		System.out.println("=================================");
		if(s1==s2) {
			System.out.println("Adresses are Equal");
		}
		else {
			System.out.println("Adresses are not Equal");
		}
	}
}
