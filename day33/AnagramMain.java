package com.xyz.basicsofprogramming.day33;

import java.util.Arrays;
import java.util.Scanner;
//class Anagram{
//	int flag;
//	char arr1[];
//	char arr2[];
//	int logic(String s1, String s2) {
//		convertToArray(s1,s2);
//		if(flag != 0) {
//			return flag;
//		}else {
//			sorting();
//			comparing();
//		}
//		
//		return flag;
//		
//	}
//	private void comparing() {
//		// TODO Auto-generated method stub
//		System.out.println("Comparing the given array");
//		for(int i=0; i<arr1.length;i++) {
//			if(arr1[i]!= arr2[i]) {
//				flag = -1;
//			
//			}
//		}
//		System.out.println("Comparing the string is done");
//		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
//		
//	}
//	private void sorting() {
//		// TODO Auto-generated method stub
//		char temp1;
//		System.out.println("Sorting the 1st array");
//		for(int i=0; i<arr1.length;i++) {
//			for(int j=0; j<arr1.length;j++) {
//				if(arr1[i]>arr2[i]) {
//					temp1 = arr1[i];
//					arr1[i] = arr1[j];
//					arr1[j] = temp1;
//				}
//			}
//		}
//		char temp2;
//		System.out.println("Sorting the 2nd array");
//		for(int i=0; i<arr2.length;i++) {
//			for(int j=0; j<arr2.length;j++) {
//				if(arr1[i]>arr2[i]) {
//					temp2 = arr2[i];
//					arr2[i] = arr2[j];
//					arr2[j] = temp2;
//				}
//			}
//		}
//		System.out.println("Sorting of the array is done");
//		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
//		
//	}
//	private void convertToArray(String s1, String s2) {
//		// TODO Auto-generated method stub
//		System.out.println("Converting the arrays");
//		arr1 = new char[s1.length()];
//		arr2 = new char[s2.length()];
//		
//		if(s1.length() == s2.length()) {
//			for(int i=0;i<s1.length();i++) {
//				arr1[i] = s1.charAt(i);
//				arr2[i] = s2.charAt(i);
//		}
//		}else {
//			flag = -1;
//			return;
//		}
//		System.out.println("The covering is done");
//		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
//	}
//}
//
//	
//
//public class AnagramMain {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner  sc = new Scanner(System.in);
//		System.out.println("Enter the String 1:");
//		String s1 = sc.next();
//		System.out.println("Enter the String 2:");
//		String s2 = sc.next();
//		Anagram a = new Anagram();
//		int res = a.logic(s1, s2);
//		System.out.println(res);
//		if(res == 0) {
//			System.out.println("The string is Anagram");
//			
//		}else {
//			System.out.println("The string is not Anagram");
//		}
//	}
//
//}
class Anagram {
    int flag;
    char arr1[];
    char arr2[];

    int logic(String s1, String s2) {
        convertToArray(s1, s2);
        if (flag != 0) {
            return flag;
        } else {
            sorting();  // Sort both arrays
            comparing();  // Compare both arrays
        }
        return flag;
    }

    private void comparing() {
        System.out.println("Comparing the given arrays");
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                flag = -1;
                return;
            }
        }
        System.out.println("The strings are anagrams.");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }

    private void sorting() {
        System.out.println("Sorting the arrays");
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("Sorting of the arrays is done");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }

    private void convertToArray(String s1, String s2) {
        System.out.println("Converting the strings to arrays");
        arr1 = new char[s1.length()];
        arr2 = new char[s2.length()];

        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                arr1[i] = s1.charAt(i);
                arr2[i] = s2.charAt(i);
            }
        } else {
            flag = -1;  // If lengths are not equal, it's not an anagram
            return;
        }
        System.out.println("Array conversion is done");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }
}

public class AnagramMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String 1:");
        String s1 = sc.next();
        System.out.println("Enter the String 2:");
        String s2 = sc.next();
        Anagram a = new Anagram();
        int res = a.logic(s1, s2);
        if (res == 0) {
            System.out.println("The strings are Anagrams");
        } else {
            System.out.println("The strings are not Anagrams");
        }
    }
}