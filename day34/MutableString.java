package com.xyz.basicsofprogramming.day34;

public class MutableString {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("SITA");
		StringBuffer sb2 = new StringBuffer("RAMA");
		sb1.append(sb2);
		System.out.println(sb1);
		System.out.println(sb1.getClass());
		System.out.println(sb1.replace(0, 2, "T"));
	
		sb1.reverse();
		System.out.println(sb1);
		System.out.println(sb1.hashCode());
		System.out.println(sb1);
		
	}
}
