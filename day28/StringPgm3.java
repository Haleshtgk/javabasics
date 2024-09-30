package com.xyz.basicsofprogramming.day28;

public class StringPgm3 {
	public static void main(String[] args) {
		String s1 = new String("raMa");
		String s2 = new String("rama");
		
		if(s1.equalsIgnoreCase(s2) ==  true) {
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
