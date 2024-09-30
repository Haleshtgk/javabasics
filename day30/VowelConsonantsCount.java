package com.xyz.basicsofprogramming.day30;

import java.util.Scanner;

class VowelOperations{
	static int vowel_count;
	static int consonants_count;
	static int upper_vowel_count;
	static int lowe_vowel_count;
	
	

	public void lowecaseVowelCount(String str) {
		System.out.println("Counting the lower case vowels");
		for(int i= 0; i<str.length() ; i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||
			   str.charAt(i)=='o' || str.charAt(i)=='u') {
				vowel_count++;
			}
			else {
				consonants_count++;
			}
		}
		
	}



	public void uppercaseVowelCount(String str) {
		System.out.println("Counting the upper case vowels");
		for(int i= 0; i<str.length() ; i++) {
			if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' ||
			   str.charAt(i)=='O' || str.charAt(i)=='U') {
				vowel_count++;
			}
			else {
				consonants_count++;
			}
		}
		
	}



	public void vowelCount(String str) {
		System.out.println("Counting the  vowels");
		//str = str.toUpperCase();
		for(int i= 0; i<str.length() ; i++) {
			if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' ||
			   str.charAt(i)=='O' || str.charAt(i)=='U' || str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||
			   str.charAt(i)=='o' || str.charAt(i)=='u') {
				vowel_count++;
			}
			else {
				consonants_count++;
			}
		}
		
	}



	public void loweuppercaseVowelCount(String str) {
		System.out.println("Counting the upper case vowels");
		for(int i= 0; i<str.length() ; i++) {
			if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' ||
			   str.charAt(i)=='O' || str.charAt(i)=='U') {
				upper_vowel_count++;
			}
			else {
				consonants_count++;
			}
		}
		for(int i= 0; i<str.length() ; i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||
			   str.charAt(i)=='0' || str.charAt(i)=='u') {
				lowe_vowel_count++;
			}
			else {
				consonants_count++;
			}
		}
		
	}
	public String vowelReplace(String str1) {
		String str_temp = "";
		//str = str.toUpperCase();
		for(int i= 0; i<str1.length() ; i++) {
			if(str1.charAt(i)=='A' || str1.charAt(i)=='E' || str1.charAt(i)=='I' ||
			   str1.charAt(i)=='O' || str1.charAt(i)=='U' || str1.charAt(i)=='a' || str1.charAt(i)=='e' || str1.charAt(i)=='i' ||
			   str1.charAt(i)=='o' || str1.charAt(i)=='u') {
				str_temp += '#';
			}
			else {
				str_temp += str1.charAt(i);
			}
		}
		return str_temp;
		
	}
	public String vowelRpaceIndivtual(String str1) {
		String str_temp = "";
		for(int i= 0; i<str1.length() ; i++) {
			if(str1.charAt(i)=='A' || str1.charAt(i)=='a') {
				str_temp += '!';
			}
			else if(str1.charAt(i)=='E' || str1.charAt(i)=='e') {
				str_temp += '@';
			}
			else if(str1.charAt(i)=='I' || str1.charAt(i)=='i') {
				str_temp += '#';
			}
			else if(str1.charAt(i)=='O' || str1.charAt(i)=='o') {
				str_temp += '$';
			}
			else if(str1.charAt(i)=='U' || str1.charAt(i)=='u') {
				str_temp += '%';
			}
			else {
				str_temp+=str1.charAt(i);
			}
		}
		return str_temp;
		
	}
	
}
public class VowelConsonantsCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		VowelOperations vc = new VowelOperations();
		System.out.println("1. Lower case vowel count \n"
				         + "2. Upper case vowl count \n"
				         + "3. vowel count\n"
				         + "4. both upper and lowe case\n"
				         + "5. Replace the vowel with some char\n"
				         + "6. Replace Indivitual with some cahr\n");
		int cho = sc.nextInt();
		switch (cho) {
		case 1: {
			vc.lowecaseVowelCount(str);
			System.out.println("Counting the lower case: "+ VowelOperations.vowel_count);
			System.out.println("Counting the Consonants case: "+ VowelOperations.consonants_count);
			break;
		}
		case 2: {
			vc.uppercaseVowelCount(str);
			System.out.println("Counting the lower case: "+ VowelOperations.vowel_count);
			System.out.println("Counting the Consonants case: "+ VowelOperations.consonants_count);
			break;
		}
		case 3: {
			vc.vowelCount(str);
			System.out.println("Counting the lower case: "+ VowelOperations.vowel_count);
			System.out.println("Counting the Consonants case: "+ VowelOperations.consonants_count);
			break;
		}
		case 4: {
			vc.loweuppercaseVowelCount(str);
			System.out.println("counting the lower case vowel "+ VowelOperations.lowe_vowel_count);
			System.out.println("counting the lower case vowel "+ VowelOperations.upper_vowel_count);
			System.out.println("Counting the Consonants case: "+ VowelOperations.consonants_count);
			break;
		}
		case 5:{
			str= vc.vowelReplace(str);
			System.out.println("Replacement of vowel "+str);
			break;
			
		}
		case 6:{
			str = vc.vowelRpaceIndivtual(str);
			System.out.println("Replacement of vowel "+str);
			break;
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + cho);
		}
		
	}
}
