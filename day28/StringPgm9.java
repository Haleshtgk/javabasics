package com.xyz.basicsofprogramming.day28;

public class StringPgm9 {
	public static void main(String[] args) {
		String s = "RajaRamMohanRoy";
		System.out.println(s.charAt(0));
		System.out.println(s.codePointAt(0));
		System.out.println(s.codePointBefore(1));
		System.out.println(s.concat("Sing"));
		System.out.println(s.contains("Roy"));
		System.out.println(s.endsWith("Roy"));
		System.out.println(s.hashCode());
		System.out.println(s.indexOf('j'));
		System.out.println(s.isBlank());
		System.out.println(s.isEmpty());
		System.out.println(s.lastIndexOf("a"));
		System.out.println(s.length());
		System.out.println(s.replace('a', '$'));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.getClass());
		System.out.println(s.startsWith("Raj"));
		
		
	}
}
