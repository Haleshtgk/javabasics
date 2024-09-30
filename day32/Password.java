package com.xyz.basicsofprogramming.day32;

import java.util.Scanner;
class passCheck{
	void passCheck(String s) {
			int i=0;
			if((s.charAt(i)>=65 && s.charAt(i)<=90) ||(s.charAt(i)>=97 && s.charAt(i)<=122) ||s.charAt(i)>=48 && s.charAt(i)<=57 && s.length() == 8 && s.charAt(i) == '@' || s.charAt(i) == '#' || s.charAt(i) == '$')
			{
				System.out.println("Valid Password");
			}
			else {
				System.out.println("Invalid Password");
			}
				
				
				
				
			//System.out.println("String is vaild");
			
//			else if(s.charAt(i)>=48 && s.charAt(i)<=57) {
//				System.out.println("String is vaild");
//			}
//			else if(s.length() == 8) {
//				System.out.println("String is vaild");
//			}
//			else if(s.charAt(i) == '@' || s.charAt(i) == '#' || s.charAt(i) == '$') {
//				System.out.println("String is vaild");
//			}

	}
}

public class Password {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str1 = sc.nextLine();
		passCheck pc = new passCheck();
		pc.passCheck(str1);
		
	}
}

