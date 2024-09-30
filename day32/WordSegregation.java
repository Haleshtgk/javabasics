package com.xyz.basicsofprogramming.day32;

import java.util.Scanner;
class Segregation{
	 static String alphabet_str=" "; 
	 static String numeric_str=" "; 
	 static String special_str=" "; 
	void Segregation(String s) {
		System.out.println("Segregation process is initiated.....");
		for(int i=0; i<s.length();i++) {
			if((s.charAt(i)>=65 && s.charAt(i)<=90) ||(s.charAt(i)>=97 && s.charAt(i)<=122) ) {
				alphabet_str += s.charAt(i);
			}
			else if(s.charAt(i)>=48 && s.charAt(i)<=57) {
				numeric_str += s.charAt(i);
			}
			else {
				special_str += s.charAt(i);
			}
		}
		
			
	}
	void display(){
		System.out.println("Aphatbet string is:"+ alphabet_str);
		System.out.println("Numeric string is :" + numeric_str);
		System.out.println("Special String is: "+ special_str);
	}
}

public class WordSegregation {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str1 = sc.nextLine();
		Segregation s = new Segregation();
		s.Segregation(str1);
		s.display();

	}

}
