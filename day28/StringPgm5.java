package com.xyz.basicsofprogramming.day28;

public class StringPgm5 {
	public static void main(String[] args) {
		String s1 = new String("rama");
		String s2 = new String("Rama");
		int result = s1.compareTo(s2);
		if(result == 0) {
			System.out.println("Strings are Equal");
		}
		else {
			System.out.println("Strings are not Equal and the diff is :" + result);
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
