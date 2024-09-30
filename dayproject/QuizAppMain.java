package com.xyz.basicsofprogramming.dayproject;

import java.util.Scanner;

public class QuizAppMain {
	public static void main(String[] args) {
		System.out.println("Welcome to quiz application");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Rules:");
        System.out.println("1. You will be asked 10 questions.");
        System.out.println("2. For each correct answer, you will earn money as per the money chart below.");
        System.out.println("3. You have two lifelines: Phone a Friend and 50/50. You can use each lifeline only once.");
        System.out.println("4. If you answer incorrectly, the game will end.");
        System.out.println("5. After each correct answer, you won the amout");
        System.out.println("Money Chart:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Question " + i + ": Rs" + (i * 10000));
        }
        System.out.println(); 
        
		boolean res;
		Questions q = new Questions();
		System.out.println("Do you wish to start the game?(Y/N)");
		String resp1 = sc.next();
		if(resp1.equalsIgnoreCase("y")) {
			res = q.question1(name);
			if(res==true) {
				System.out.println("Here comes your Second Question.");
				res = q.question2(name);
				if(res==true) {
					System.out.println("Here comes your Third Question.");
					res = q.question3(name);
					if(res == true) {
						System.out.println("Here comes your 4th Question.");
						res = q.question4(name);
						if(res == true) {
							System.out.println("Here comes your 4th Question.");
							res = q.question5(name);
							if(res == true) {
								System.out.println("Here comes your 5th Question.");
								res = q.question6(name);
								if(res == true) {
									System.out.println("Here comes your 6th Question.");
									res = q.question6(name);
									if(res == true) {
										System.out.println("Here comes your 7th Question.");
										res = q.question7(name);
										if(res == true) {
											System.out.println("Here comes your 8th Question.");
											res = q.question8(name);
											if(res == true) {
												System.out.println("Here comes your 9th Question.");
												res = q.question9(name);
												if(res == true) {
													System.out.println("Here comes your 10th Question.");
													res = q.question10(name);
													System.exit(0);
												}
												else {
													System.out.println("Thank You.");
													System.exit(0);
												}
											}
											else {
												System.out.println("Thank You.");
												System.exit(0);
											}
										}
										else {
											System.out.println("Thank You.");
											System.exit(0);
										}
									}
									else {
										System.out.println("Thank You.");
										System.exit(0);
									}
								}
								else {
									System.out.println("Thank You.");
									System.exit(0);
								}
							}
							else {
								System.out.println("Thank You.");
								System.exit(0);
							}
						}
						else {
							System.out.println("Thank You.");
							System.exit(0);
						}
					}
					else {
						System.out.println("Thank You.");
						System.exit(0);
					}
					
				}
				else {
					System.out.println("Thank You.");
					System.exit(0);
				}
			}
			else {
				System.out.println("Thank You.");
				System.exit(0);
			}
		}
		else {
			System.out.println("Thank You.");
			System.exit(0);
		}
		System.exit(0);
	}
}
