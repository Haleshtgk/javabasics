package com.xyz.basicsofprogramming.dayproject;

import java.util.Scanner;

public class Questions {
	static int life_line_count=2;
	static int aud_phn_cnt=1;
	static int fifty_fifty_cnt=1;
	Scanner sc = new Scanner(System.in);
	int amount;
 		
	public boolean question1(String name) {
		int amount = 10000;
		System.out.println("1. Who is the founder of Java?");
		System.out.println("a. Dennis Ritchie\n"
						 + "b. Stroustrup\n"
						 + "c. Charles Babbage\n"
						 + "d. James Gosling\n"
						 + "e. Life Line");
		String res = sc.next();
		int sel1=0;
		String sel2;
		if(res.equalsIgnoreCase("e")) {
			if(life_line_count!=0) {
				System.out.println("You have the following Life Lines: \n"
								 + "1. Audiance Phone\n"
								 + "2. 50-50\n");
				sel1=sc.nextInt();
				if(sel1==1) {
					if(aud_phn_cnt!=0) {
						aud_phn_cnt--;
						life_line_count--;
						System.out.println("Select your choice: ");
						System.out.println("a. Dennis Ritchie ---> 20%\n"
								 + "b. Stroustrup ---> 5%\n"
								 + "c. Charles Babbage ---> 15%\n"
								 + "d. James Gosling ---> 60%\n");
						res = sc.next();
						if(res.equalsIgnoreCase("d")) {
							System.out.println("Correct Answer You have won Rs." + amount);
							amount = 10000;
							return true;
						}
						else {
							System.out.println("Wrong Answer. You have completed the game.");
							System.out.println("Your take away reward is : "+ amount);
							return false;
						}
					}
					else {
						System.out.println("You have already used this life line.\n"
										 + "Available Life line is : \n"
										 + "2. 50-50\n"
										 + "Do you wish to use it?(y/n)");
						sel2 = sc.next();
						if(sel2.equalsIgnoreCase("y")) {
							if(fifty_fifty_cnt!=0) {
								fifty_fifty_cnt--;
								life_line_count--;
								System.out.println("Select your choice: ");
								System.out.println("a. Dennis Ritchie ---> 20%\n"
										 + "d. James Gosling ---> 60%\n");
								res = sc.next();
								if(res.equalsIgnoreCase("d")) {
									System.out.println("Correct Answer You have won Rs." + amount);
									amount = 10000;
									return true;
								}
								else {
									System.out.println("Wrong Answer. You have completed the game.");
									System.out.println("Your take away reward is : "+amount);
									return false;
								}
							}
							else {
								System.out.println("None of the life lines are available.");
								System.out.println("Choose the correct option: ");
								System.out.println("a. Dennis Ritchie\n"
										 + "b. Stroustrup\n"
										 + "c. Charles Babbage\n"
										 + "d. James Gosling\n"
										 + "e. Life Line");
								res = sc.next();
								if(res.equalsIgnoreCase("d")) {
									System.out.println("Correct Answer You have won Rs." + amount);
									amount = 1000;
									return true;
								}
								else {
									System.out.println("Wrong Answer. You have completed the game.");
									System.out.println("Your take away reward is : "+amount);
									return false;
								}
							}
						}
						else {
							System.out.println("Choose the correct option: ");
							System.out.println("a. Dennis Ritchie\n"
									 + "b. Stroustrup\n"
									 + "c. Charles Babbage\n"
									 + "d. James Gosling\n"
									 + "e. Life Line");
							res = sc.next();
							if(res.equalsIgnoreCase("d")) {
								System.out.println("Correct Answer You have won Rs." + amount);
								amount = 10000;
								return true;
							}
							else {
								System.out.println("Wrong Answer. You have completed the game.");
								System.out.println("Your take away reward is : "+amount);
								return false;
							}
						}
					}
				}
				else if(sel1==2) {
					if(fifty_fifty_cnt!=0) {
						fifty_fifty_cnt--;
						life_line_count--;
						System.out.println("Select your choice: ");
						System.out.println("a. Dennis Ritchie ---> 20%\n"
								 + "d. James Gosling ---> 60%\n");
						res = sc.next();
						if(res.equalsIgnoreCase("d")) {
							System.out.println("Correct Answer You have won Rs." + amount);
							amount = 1000;
							return true;
						}
						else {
							System.out.println("Wrong Answer. You have completed the game.");
							System.out.println("Your take away reward is : "+amount);
							return false;
						}
					}
					else {
						System.out.println("You have already used this life line.\n"
										 + "Available Life line is : \n"
										 + "1. audiance phone\n"
										 + "Do you wish to use it?(y/n)");
						sel2 = sc.next();
						if(sel2.equalsIgnoreCase("y")) {
							if(aud_phn_cnt!=0) {
								aud_phn_cnt--;
								life_line_count--;
								System.out.println("Select your choice: ");
								System.out.println("a. Dennis Ritchie ---> 20%\n"
										 + "b. Stroustrup ---> 5%\n"
										 + "c. Charles Babbage ---> 15%\n"
										 + "d. James Gosling ---> 60%\n");
								res = sc.next();
								if(res.equalsIgnoreCase("d")) {
									System.out.println("Correct Answer You have won Rs." + amount);
									amount = 1000;
									return true;
								}
								else {
									System.out.println("Wrong Answer. You have completed the game.");
									System.out.println("Your take away reward is : "+amount);
									return false;
								}
							}
							else {
								System.out.println("None of the life lines are available.");
								System.out.println("Choose the correct option: ");
								System.out.println("a. Dennis Ritchie\n"
										 + "b. Stroustrup\n"
										 + "c. Charles Babbage\n"
										 + "d. James Gosling\n"
										 + "e. Life Line");
								res = sc.next();
								if(res.equalsIgnoreCase("d")) {
									System.out.println("Correct Answer You have won Rs." + amount);
									amount = 1000;
									return true;
								}
								else {
									System.out.println("Wrong Answer. You have completed the game.");
									System.out.println("Your take away reward is : "+amount);
									return false;
								}
							}
						}
						else {
							System.out.println("Choose the correct option: ");
							System.out.println("a. Dennis Ritchie\n"
									 + "b. Stroustrup\n"
									 + "c. Charles Babbage\n"
									 + "d. James Gosling\n"
									 + "e. Life Line");
							res = sc.next();
							if(res.equalsIgnoreCase("d")) {
								System.out.println("Correct Answer You have won Rs." + amount);
								amount = 1000;
								return true;
							}
							else {
								System.out.println("Wrong Answer. You have completed the game.");
								System.out.println("Your take away reward is : "+amount);
								return false;
							}
						}
					}
				}
			}
		}
		else {
			if(res.equalsIgnoreCase("d")) {
				System.out.println("Correct Answer You have won Rs." + amount);
				amount = 1000;
				return true;
				
			}
			
			else {
				System.out.println("Wrong Answer. You have completed the game.");
				System.out.println("Your take away reward is : "+amount);
				return false;
			}
		}
		return false;
		
	}
	
	//-------------------------------------------------------------------------------
	public boolean question2(String name) {
		amount=10000;
		System.out.println("2. Who is the founder of Java?");
		System.out.println("a. Dennis Ritchie\n"
						 + "b. Stroustrup\n"
						 + "c. Charles Babbage\n"
						 + "d. James Gosling\n"
						 + "e. Life Line");
		String res = sc.next();
		int sel1=0;
		String sel2;
		if(res.equalsIgnoreCase("e")) {
			if(life_line_count!=0) {
				System.out.println("You have the following Life Lines: \n"
								 + "1. Audiance Phone\n"
								 + "2. 50-50\n");
				sel1=sc.nextInt();
				if(sel1==1) {
					if(aud_phn_cnt!=0) {
						aud_phn_cnt--;
						life_line_count--;
						System.out.println("Select your choice: ");
						System.out.println("a. Dennis Ritchie ---> 20%\n"
								 + "b. Stroustrup ---> 5%\n"
								 + "c. Charles Babbage ---> 15%\n"
								 + "d. James Gosling ---> 60%\n");
						res = sc.next();
						if(res.equalsIgnoreCase("d")) {
							System.out.println("Correct Answer You have won Rs." + amount);
							amount = 10000;
							return true;
						}
						else {
							System.out.println("Wrong Answer. You have completed the game.");
							System.out.println("Your take away reward is : "+amount);
							return false;
						}
					}
					else {
						System.out.println("You have already used this life line.\n"
										 + "Available Life line is : \n"
										 + "2. 50-50\n"
										 + "Do you wish to use it?(y/n)");
						sel2 = sc.next();
						if(sel2.equalsIgnoreCase("y")) {
							if(fifty_fifty_cnt!=0) {
								fifty_fifty_cnt--;
								life_line_count--;
								System.out.println("Select your choice: ");
								System.out.println("a. Dennis Ritchie ---> 20%\n"
										 + "d. James Gosling ---> 60%\n");
								res = sc.next();
								if(res.equalsIgnoreCase("d")) {
									System.out.println("Correct Answer You have won Rs." + amount);
									amount = 10000;
									return true;
								}
								else {
									System.out.println("Wrong Answer. You have completed the game.");
									System.out.println("Your take away reward is : "+amount);
									return false;
								}
							}
							else {
								System.out.println("None of the life lines are available.");
								System.out.println("Choose the correct option: ");
								System.out.println("a. Dennis Ritchie\n"
										 + "b. Stroustrup\n"
										 + "c. Charles Babbage\n"
										 + "d. James Gosling\n"
										 + "e. Life Line");
								res = sc.next();
								if(res.equalsIgnoreCase("d")) {
									System.out.println("Correct Answer You have won Rs." + amount);
									amount = 10000;
									return true;
								}
								else {
									System.out.println("Wrong Answer. You have completed the game.");
									System.out.println("Your take away reward is : "+amount);
									return false;
								}
							}
						}
						else {
							System.out.println("Choose the correct option: ");
							System.out.println("a. Dennis Ritchie\n"
									 + "b. Stroustrup\n"
									 + "c. Charles Babbage\n"
									 + "d. James Gosling\n"
									 + "e. Life Line");
							res = sc.next();
							if(res.equalsIgnoreCase("d")) {
								System.out.println("Correct Answer You have won Rs." + amount);
								amount = 10000;
								return true;
							}
							else {
								System.out.println("Wrong Answer. You have completed the game.");
								System.out.println("Your take away reward is : "+amount);
								return false;
							}
						}
					}
				}
			}
		}
		else {
			if(res.equalsIgnoreCase("d")) {
				System.out.println("Correct Answer You have won Rs." + amount);
				amount = 10000;
				return true;
			}
			else {
				System.out.println("Wrong Answer. You have completed the game.");
				System.out.println("Your take away reward is : "+amount);
				return false;
			}
		}
		return false;
	}
	//-----------------------------------------------------------------------------------
	public boolean question3(String name) {
		System.out.println("3. Who is the founder of Java?");
		System.out.println("a. Dennis Ritchie\n"
						 + "b. Stroustrup\n"
						 + "c. Charles Babbage\n"
						 + "d. James Gosling\n"
						 + "e. Life Line");
		String res = sc.next();
		int sel1=0;
		String sel2;
		if(res.equalsIgnoreCase("e")) {
			if(life_line_count!=0) {
				System.out.println("You have the following Life Lines: \n"
								 + "1. Audiance Phone\n"
								 + "2. 50-50\n");
				sel1=sc.nextInt();
				if(sel1==1) {
					if(aud_phn_cnt!=0) {
						aud_phn_cnt--;
						life_line_count--;
						System.out.println("Select your choice: ");
						System.out.println("a. Dennis Ritchie ---> 20%\n"
								 + "b. Stroustrup ---> 5%\n"
								 + "c. Charles Babbage ---> 15%\n"
								 + "d. James Gosling ---> 60%\n");
						res = sc.next();
						if(res.equalsIgnoreCase("d")) {
							System.out.println("Correct Answer You have won Rs." + amount);
							amount = 25000;
							return true;
						}
						else {
							System.out.println("Wrong Answer. You have completed the game.");
							System.out.println("Your take away reward is : "+amount);
							return false;
						}
					}
					else {
						System.out.println("You have already used this life line.\n"
										 + "Available Life line is : \n"
										 + "2. 50-50\n"
										 + "Do you wish to use it?(y/n)");
						sel2 = sc.next();
						if(sel2.equalsIgnoreCase("y")) {
							if(fifty_fifty_cnt!=0) {
								fifty_fifty_cnt--;
								life_line_count--;
								System.out.println("Select your choice: ");
								System.out.println("a. Dennis Ritchie ---> 20%\n"
										 + "d. James Gosling ---> 60%\n");
								res = sc.next();
								if(res.equalsIgnoreCase("d")) {
									System.out.println("Correct Answer You have won Rs." + amount);
									amount = 25000;
									return true;
								}
								else {
									System.out.println("Wrong Answer. You have completed the game.");
									System.out.println("Your take away reward is : "+amount);
									return false;
								}
							}
							else {
								System.out.println("None of the life lines are available.");
								System.out.println("Choose the correct option: ");
								System.out.println("a. Dennis Ritchie\n"
										 + "b. Stroustrup\n"
										 + "c. Charles Babbage\n"
										 + "d. James Gosling\n"
										 + "e. Life Line");
								res = sc.next();
								if(res.equalsIgnoreCase("d")) {
									System.out.println("Correct Answer You have won Rs." + amount);
									amount = 25000;
									return true;
								}
								else {
									System.out.println("Wrong Answer. You have completed the game.");
									System.out.println("Your take away reward is : "+amount);
									return false;
								}
							}
						}
						else {
							System.out.println("Choose the correct option: ");
							System.out.println("a. Dennis Ritchie\n"
									 + "b. Stroustrup\n"
									 + "c. Charles Babbage\n"
									 + "d. James Gosling\n"
									 + "e. Life Line");
							res = sc.next();
							if(res.equalsIgnoreCase("d")) {
								System.out.println("Correct Answer You have won Rs." + amount);
								amount = 25000;
								return true;
							}
							else {
								System.out.println("Wrong Answer. You have completed the game.");
								System.out.println("Your take away reward is : "+amount);
								return false;
							}
						}
					}
				}
			}
		}
		else {
			if(res.equalsIgnoreCase("d")) {
				System.out.println("Correct Answer You have won Rs." + amount);
				amount = 25000;
				return true;
			}
			else {
				System.out.println("Wrong Answer. You have completed the game.");
				System.out.println("Your take away reward is : "+amount);
				return false;
			}
		}
		return false;
	}
	public boolean question4(String name) {
		System.out.println("4. Who is the founder of Java?");
		System.out.println("a. Dennis Ritchie\n"
						 + "b. Stroustrup\n"
						 + "c. Charles Babbage\n"
						 + "d. James Gosling\n"
						 + "e. Life Line");
		String res = sc.next();
		int sel1=0;
		String sel2;
		if(res.equalsIgnoreCase("e")) {
			if(life_line_count!=0) {
				System.out.println("You have the following Life Lines: \n"
								 + "1. Audiance Phone\n"
								 + "2. 50-50\n");
				sel1=sc.nextInt();
				if(sel1==1) {
					if(aud_phn_cnt!=0) {
						aud_phn_cnt--;
						life_line_count--;
						System.out.println("Select your choice: ");
						System.out.println("a. Dennis Ritchie ---> 20%\n"
								 + "b. Stroustrup ---> 5%\n"
								 + "c. Charles Babbage ---> 15%\n"
								 + "d. James Gosling ---> 60%\n");
						res = sc.next();
						if(res.equalsIgnoreCase("d")) {
							System.out.println("Correct Answer You have won Rs." + amount);
							amount = 30000;
							return true;
						}
						else {
							System.out.println("Wrong Answer. You have completed the game.");
							System.out.println("Your take away reward is : "+amount);
							return false;
						}
					}
					else {
						System.out.println("You have already used this life line.\n"
										 + "Available Life line is : \n"
										 + "2. 50-50\n"
										 + "Do you wish to use it?(y/n)");
						sel2 = sc.next();
						if(sel2.equalsIgnoreCase("y")) {
							if(fifty_fifty_cnt!=0) {
								fifty_fifty_cnt--;
								life_line_count--;
								System.out.println("Select your choice: ");
								System.out.println("a. Dennis Ritchie ---> 20%\n"
										 + "d. James Gosling ---> 60%\n");
								res = sc.next();
								if(res.equalsIgnoreCase("d")) {
									System.out.println("Correct Answer You have won Rs." + amount);
									amount = 30000;
									return true;
								}
								else {
									System.out.println("Wrong Answer. You have completed the game.");
									System.out.println("Your take away reward is : "+amount);
									return false;
								}
							}
							else {
								System.out.println("None of the life lines are available.");
								System.out.println("Choose the correct option: ");
								System.out.println("a. Dennis Ritchie\n"
										 + "b. Stroustrup\n"
										 + "c. Charles Babbage\n"
										 + "d. James Gosling\n"
										 + "e. Life Line");
								res = sc.next();
								if(res.equalsIgnoreCase("d")) {
									System.out.println("Correct Answer You have won Rs." + amount);
									amount = 30000;
									return true;
								}
								else {
									System.out.println("Wrong Answer. You have completed the game.");
									System.out.println("Your take away reward is : "+amount);
									return false;
								}
							}
						}
						else {
							System.out.println("Choose the correct option: ");
							System.out.println("a. Dennis Ritchie\n"
									 + "b. Stroustrup\n"
									 + "c. Charles Babbage\n"
									 + "d. James Gosling\n"
									 + "e. Life Line");
							res = sc.next();
							if(res.equalsIgnoreCase("d")) {
								System.out.println("Correct Answer You have won Rs." + amount);
								amount = 30000;
								return true;
							}
							else {
								System.out.println("Wrong Answer. You have completed the game.");
								System.out.println("Your take away reward is : "+amount);
								return false;
							}
						}
					}
				}
			}
		}
		else {
			if(res.equalsIgnoreCase("d")) {
				System.out.println("Correct Answer You have won Rs." + amount);
				amount = 30000;
				return true;
			}
			else {
				System.out.println("Wrong Answer. You have completed the game.");
				System.out.println("Your take away reward is : "+amount);
				return false;
			}
		}
		return false;
	}
	public boolean question5(String name) {
		System.out.println("5. Who is the founder of Java?");
		System.out.println("a. Dennis Ritchie\n"
						 + "b. Stroustrup\n"
						 + "c. Charles Babbage\n"
						 + "d. James Gosling\n"
						 + "e. Life Line");
		String res = sc.next();
		int sel1=0;
		String sel2;
		if(res.equalsIgnoreCase("e")) {
			if(life_line_count!=0) {
				System.out.println("You have the following Life Lines: \n"
								 + "1. Audiance Phone\n"
								 + "2. 50-50\n");
				sel1=sc.nextInt();
				if(sel1==1) {
					if(aud_phn_cnt!=0) {
						aud_phn_cnt--;
						life_line_count--;
						System.out.println("Select your choice: ");
						System.out.println("a. Dennis Ritchie ---> 20%\n"
								 + "b. Stroustrup ---> 5%\n"
								 + "c. Charles Babbage ---> 15%\n"
								 + "d. James Gosling ---> 60%\n");
						res = sc.next();
						if(res.equalsIgnoreCase("d")) {
							System.out.println("Correct Answer You have won Rs." + amount);
							amount = 35000;
							return true;
						}
						else {
							System.out.println("Wrong Answer. You have completed the game.");
							System.out.println("Your take away reward is : "+amount);
							return false;
						}
					}
					else {
						System.out.println("You have already used this life line.\n"
										 + "Available Life line is : \n"
										 + "2. 50-50\n"
										 + "Do you wish to use it?(y/n)");
						sel2 = sc.next();
						if(sel2.equalsIgnoreCase("y")) {
							if(fifty_fifty_cnt!=0) {
								fifty_fifty_cnt--;
								life_line_count--;
								System.out.println("Select your choice: ");
								System.out.println("a. Dennis Ritchie ---> 20%\n"
										 + "d. James Gosling ---> 60%\n");
								res = sc.next();
								if(res.equalsIgnoreCase("d")) {
									System.out.println("Correct Answer You have won Rs." + amount);
									amount = 35000;
									return true;
								}
								else {
									System.out.println("Wrong Answer. You have completed the game.");
									System.out.println("Your take away reward is : "+amount);
									return false;
								}
							}
							else {
								System.out.println("None of the life lines are available.");
								System.out.println("Choose the correct option: ");
								System.out.println("a. Dennis Ritchie\n"
										 + "b. Stroustrup\n"
										 + "c. Charles Babbage\n"
										 + "d. James Gosling\n"
										 + "e. Life Line");
								res = sc.next();
								if(res.equalsIgnoreCase("d")) {
									System.out.println("Correct Answer You have won Rs." + amount);
									amount = 35000;
									return true;
								}
								else {
									System.out.println("Wrong Answer. You have completed the game.");
									System.out.println("Your take away reward is : "+amount);
									return false;
								}
							}
						}
						else {
							System.out.println("Choose the correct option: ");
							System.out.println("a. Dennis Ritchie\n"
									 + "b. Stroustrup\n"
									 + "c. Charles Babbage\n"
									 + "d. James Gosling\n"
									 + "e. Life Line");
							res = sc.next();
							if(res.equalsIgnoreCase("d")) {
								System.out.println("Correct Answer You have won Rs." + amount);
								amount = 35000;
								return true;
							}
							else {
								System.out.println("Wrong Answer. You have completed the game.");
								System.out.println("Your take away reward is : "+amount);
								return false;
							}
						}
					}
				}
			}
		}
		else {
			if(res.equalsIgnoreCase("d")) {
				System.out.println("Correct Answer You have won Rs." + amount);
				amount = 35000;
				return true;
			}
			else {
				System.out.println("Wrong Answer. You have completed the game.");
				System.out.println("Your take away reward is : "+amount);
				return false;
			}
		}
		return false;
	}
	public boolean question6(String name) {
		amount=40000;
		System.out.println("6. Who is the founder of Java?");
		System.out.println("a. Dennis Ritchie\n"
						 + "b. Stroustrup\n"
						 + "c. Charles Babbage\n"
						 + "d. James Gosling\n"
						 + "e. Life Line");
		String res = sc.next();
		int sel1=0;
		String sel2;
		if(res.equalsIgnoreCase("e")) {
			if(life_line_count!=0) {
				System.out.println("You have the following Life Lines: \n"
								 + "1. Audiance Phone\n"
								 + "2. 50-50\n");
				sel1=sc.nextInt();
				if(sel1==1) {
					if(aud_phn_cnt!=0) {
						aud_phn_cnt--;
						life_line_count--;
						System.out.println("Select your choice: ");
						System.out.println("a. Dennis Ritchie ---> 20%\n"
								 + "b. Stroustrup ---> 5%\n"
								 + "c. Charles Babbage ---> 15%\n"
								 + "d. James Gosling ---> 60%\n");
						res = sc.next();
						if(res.equalsIgnoreCase("d")) {
							System.out.println("Correct Answer You have won Rs." + amount);
							amount = 40000;
							return true;
						}
						else {
							System.out.println("Wrong Answer. You have completed the game.");
							System.out.println("Your take away reward is : "+amount);
							return false;
						}
					}
					else {
						System.out.println("You have already used this life line.\n"
										 + "Available Life line is : \n"
										 + "2. 50-50\n"
										 + "Do you wish to use it?(y/n)");
						sel2 = sc.next();
						if(sel2.equalsIgnoreCase("y")) {
							if(fifty_fifty_cnt!=0) {
								fifty_fifty_cnt--;
								life_line_count--;
								System.out.println("Select your choice: ");
								System.out.println("a. Dennis Ritchie ---> 20%\n"
										 + "d. James Gosling ---> 60%\n");
								res = sc.next();
								if(res.equalsIgnoreCase("d")) {
									System.out.println("Correct Answer You have won Rs." + amount);
									amount = 40000;
									return true;
								}
								else {
									System.out.println("Wrong Answer. You have completed the game.");
									System.out.println("Your take away reward is : "+amount);
									return false;
								}
							}
							else {
								System.out.println("None of the life lines are available.");
								System.out.println("Choose the correct option: ");
								System.out.println("a. Dennis Ritchie\n"
										 + "b. Stroustrup\n"
										 + "c. Charles Babbage\n"
										 + "d. James Gosling\n"
										 + "e. Life Line");
								res = sc.next();
								if(res.equalsIgnoreCase("d")) {
									System.out.println("Correct Answer You have won Rs." + amount);
									amount = 40000;
									return true;
								}
								else {
									System.out.println("Wrong Answer. You have completed the game.");
									System.out.println("Your take away reward is : "+amount);
									return false;
								}
							}
						}
						else {
							System.out.println("Choose the correct option: ");
							System.out.println("a. Dennis Ritchie\n"
									 + "b. Stroustrup\n"
									 + "c. Charles Babbage\n"
									 + "d. James Gosling\n"
									 + "e. Life Line");
							res = sc.next();
							if(res.equalsIgnoreCase("d")) {
								System.out.println("Correct Answer You have won Rs." + amount);
								amount = 40000;
								return true;
							}
							else {
								System.out.println("Wrong Answer. You have completed the game.");
								System.out.println("Your take away reward is : "+amount);
								return false;
							}
						}
					}
				}
			}
		}
		else {
			if(res.equalsIgnoreCase("d")) {
				System.out.println("Correct Answer You have won Rs." + amount);
				amount = 40000;
				return true;
			}
			else {
				System.out.println("Wrong Answer. You have completed the game.");
				System.out.println("Your take away reward is : "+amount);
				return false;
			}
		}
		return false;
	}
	public boolean question7(String name) {
		System.out.println("7. Who is the founder of Java?");
		System.out.println("a. Dennis Ritchie\n"
						 + "b. Stroustrup\n"
						 + "c. Charles Babbage\n"
						 + "d. James Gosling\n"
						 + "e. Life Line");
		String res = sc.next();
		int sel1=0;
		String sel2;
		if(res.equalsIgnoreCase("e")) {
			if(life_line_count!=0) {
				System.out.println("You have the following Life Lines: \n"
								 + "1. Audiance Phone\n"
								 + "2. 50-50\n");
				sel1=sc.nextInt();
				if(sel1==1) {
					if(aud_phn_cnt!=0) {
						aud_phn_cnt--;
						life_line_count--;
						System.out.println("Select your choice: ");
						System.out.println("a. Dennis Ritchie ---> 20%\n"
								 + "b. Stroustrup ---> 5%\n"
								 + "c. Charles Babbage ---> 15%\n"
								 + "d. James Gosling ---> 60%\n");
						res = sc.next();
						if(res.equalsIgnoreCase("d")) {
							System.out.println("Correct Answer You have won Rs." + amount);
							amount = 45000;
							return true;
						}
						else {
							System.out.println("Wrong Answer. You have completed the game.");
							System.out.println("Your take away reward is : "+amount);
							return false;
						}
					}
					else {
						System.out.println("You have already used this life line.\n"
										 + "Available Life line is : \n"
										 + "2. 50-50\n"
										 + "Do you wish to use it?(y/n)");
						sel2 = sc.next();
						if(sel2.equalsIgnoreCase("y")) {
							if(fifty_fifty_cnt!=0) {
								fifty_fifty_cnt--;
								life_line_count--;
								System.out.println("Select your choice: ");
								System.out.println("a. Dennis Ritchie ---> 20%\n"
										 + "d. James Gosling ---> 60%\n");
								res = sc.next();
								if(res.equalsIgnoreCase("d")) {
									System.out.println("Correct Answer You have won Rs." + amount);
									amount = 45000;
									return true;
								}
								else {
									System.out.println("Wrong Answer. You have completed the game.");
									System.out.println("Your take away reward is : "+amount);
									return false;
								}
							}
							else {
								System.out.println("None of the life lines are available.");
								System.out.println("Choose the correct option: ");
								System.out.println("a. Dennis Ritchie\n"
										 + "b. Stroustrup\n"
										 + "c. Charles Babbage\n"
										 + "d. James Gosling\n"
										 + "e. Life Line");
								res = sc.next();
								if(res.equalsIgnoreCase("d")) {
									System.out.println("Correct Answer You have won Rs." + amount);
									amount = 45000;
									return true;
								}
								else {
									System.out.println("Wrong Answer. You have completed the game.");
									System.out.println("Your take away reward is : "+amount);
									return false;
								}
							}
						}
						else {
							System.out.println("Choose the correct option: ");
							System.out.println("a. Dennis Ritchie\n"
									 + "b. Stroustrup\n"
									 + "c. Charles Babbage\n"
									 + "d. James Gosling\n"
									 + "e. Life Line");
							res = sc.next();
							if(res.equalsIgnoreCase("d")) {
								System.out.println("Correct Answer You have won Rs." + amount);
								amount = 45000;
								return true;
							}
							else {
								System.out.println("Wrong Answer. You have completed the game.");
								System.out.println("Your take away reward is : "+amount);
								return false;
							}
						}
					}
				}
			}
		}
		else {
			if(res.equalsIgnoreCase("d")) {
				System.out.println("Correct Answer You have won Rs." + amount);
				amount = 45000;
				return true;
			}
			else {
				System.out.println("Wrong Answer. You have completed the game.");
				System.out.println("Your take away reward is : "+amount);
				return false;
			}
		}
		return false;
	}
	public boolean question8(String name) {
		System.out.println("8. Who is the founder of Java?");
		System.out.println("a. Dennis Ritchie\n"
						 + "b. Stroustrup\n"
						 + "c. Charles Babbage\n"
						 + "d. James Gosling\n"
						 + "e. Life Line");
		String res = sc.next();
		int sel1=0;
		String sel2;
		if(res.equalsIgnoreCase("e")) {
			if(life_line_count!=0) {
				System.out.println("You have the following Life Lines: \n"
								 + "1. Audiance Phone\n"
								 + "2. 50-50\n");
				sel1=sc.nextInt();
				if(sel1==1) {
					if(aud_phn_cnt!=0) {
						aud_phn_cnt--;
						life_line_count--;
						System.out.println("Select your choice: ");
						System.out.println("a. Dennis Ritchie ---> 20%\n"
								 + "b. Stroustrup ---> 5%\n"
								 + "c. Charles Babbage ---> 15%\n"
								 + "d. James Gosling ---> 60%\n");
						res = sc.next();
						if(res.equalsIgnoreCase("d")) {
							System.out.println("Correct Answer You have won Rs." + amount);
							amount = 50000;
							return true;
						}
						else {
							System.out.println("Wrong Answer. You have completed the game.");
							System.out.println("Your take away reward is : "+amount);
							return false;
						}
					}
					else {
						System.out.println("You have already used this life line.\n"
										 + "Available Life line is : \n"
										 + "2. 50-50\n"
										 + "Do you wish to use it?(y/n)");
						sel2 = sc.next();
						if(sel2.equalsIgnoreCase("y")) {
							if(fifty_fifty_cnt!=0) {
								fifty_fifty_cnt--;
								life_line_count--;
								System.out.println("Select your choice: ");
								System.out.println("a. Dennis Ritchie ---> 20%\n"
										 + "d. James Gosling ---> 60%\n");
								res = sc.next();
								if(res.equalsIgnoreCase("d")) {
									System.out.println("Correct Answer You have won Rs." + amount);
									amount = 50000;
									return true;
								}
								else {
									System.out.println("Wrong Answer. You have completed the game.");
									System.out.println("Your take away reward is : "+amount);
									return false;
								}
							}
							else {
								System.out.println("None of the life lines are available.");
								System.out.println("Choose the correct option: ");
								System.out.println("a. Dennis Ritchie\n"
										 + "b. Stroustrup\n"
										 + "c. Charles Babbage\n"
										 + "d. James Gosling\n"
										 + "e. Life Line");
								res = sc.next();
								if(res.equalsIgnoreCase("d")) {
									System.out.println("Correct Answer You have won Rs." + amount);
									amount = 50000;
									return true;
								}
								else {
									System.out.println("Wrong Answer. You have completed the game.");
									System.out.println("Your take away reward is : "+amount);
									return false;
								}
							}
						}
						else {
							System.out.println("Choose the correct option: ");
							System.out.println("a. Dennis Ritchie\n"
									 + "b. Stroustrup\n"
									 + "c. Charles Babbage\n"
									 + "d. James Gosling\n"
									 + "e. Life Line");
							res = sc.next();
							if(res.equalsIgnoreCase("d")) {
								System.out.println("Correct Answer You have won Rs." + amount);
								amount = 50000;
								return true;
							}
							else {
								System.out.println("Wrong Answer. You have completed the game.");
								System.out.println("Your take away reward is : "+amount);
								return false;
							}
						}
					}
				}
			}
		}
		else {
			if(res.equalsIgnoreCase("d")) {
				System.out.println("Correct Answer You have won Rs." + amount);
				amount = 50000;
				return true;
			}
			else {
				System.out.println("Wrong Answer. You have completed the game.");
				System.out.println("Your take away reward is : "+amount);
				return false;
			}
		}
		return false;
	}
	public boolean question9(String name) {
		System.out.println("9. Who is the founder of Java?");
		System.out.println("a. Dennis Ritchie\n"
						 + "b. Stroustrup\n"
						 + "c. Charles Babbage\n"
						 + "d. James Gosling\n"
						 + "e. Life Line");
		String res = sc.next();
		int sel1=0;
		String sel2;
		if(res.equalsIgnoreCase("e")) {
			if(life_line_count!=0) {
				System.out.println("You have the following Life Lines: \n"
								 + "1. Audiance Phone\n"
								 + "2. 50-50\n");
				sel1=sc.nextInt();
				if(sel1==1) {
					if(aud_phn_cnt!=0) {
						aud_phn_cnt--;
						life_line_count--;
						System.out.println("Select your choice: ");
						System.out.println("a. Dennis Ritchie ---> 20%\n"
								 + "b. Stroustrup ---> 5%\n"
								 + "c. Charles Babbage ---> 15%\n"
								 + "d. James Gosling ---> 60%\n");
						res = sc.next();
						if(res.equalsIgnoreCase("d")) {
							System.out.println("Correct Answer You have won Rs." + amount);
							amount = 90000;
							return true;
						}
						else {
							System.out.println("Wrong Answer. You have completed the game.");
							System.out.println("Your take away reward is : "+amount);
							return false;
						}
					}
					else {
						System.out.println("You have already used this life line.\n"
										 + "Available Life line is : \n"
										 + "2. 50-50\n"
										 + "Do you wish to use it?(y/n)");
						sel2 = sc.next();
						if(sel2.equalsIgnoreCase("y")) {
							if(fifty_fifty_cnt!=0) {
								fifty_fifty_cnt--;
								life_line_count--;
								System.out.println("Select your choice: ");
								System.out.println("a. Dennis Ritchie ---> 20%\n"
										 + "d. James Gosling ---> 60%\n");
								res = sc.next();
								if(res.equalsIgnoreCase("d")) {
									System.out.println("Correct Answer You have won Rs." + amount);
									amount = 90000;
									return true;
								}
								else {
									System.out.println("Wrong Answer. You have completed the game.");
									System.out.println("Your take away reward is : "+amount);
									return false;
								}
							}
							else {
								System.out.println("None of the life lines are available.");
								System.out.println("Choose the correct option: ");
								System.out.println("a. Dennis Ritchie\n"
										 + "b. Stroustrup\n"
										 + "c. Charles Babbage\n"
										 + "d. James Gosling\n"
										 + "e. Life Line");
								res = sc.next();
								if(res.equalsIgnoreCase("d")) {
									System.out.println("Correct Answer You have won Rs." + amount);
									amount = 90000;
									return true;
								}
								else {
									System.out.println("Wrong Answer. You have completed the game.");
									System.out.println("Your take away reward is : "+amount);
									return false;
								}
							}
						}
						else {
							System.out.println("Choose the correct option: ");
							System.out.println("a. Dennis Ritchie\n"
									 + "b. Stroustrup\n"
									 + "c. Charles Babbage\n"
									 + "d. James Gosling\n"
									 + "e. Life Line");
							res = sc.next();
							if(res.equalsIgnoreCase("d")) {
								System.out.println("Correct Answer You have won Rs." + amount);
								amount = 90000;
								return true;
							}
							else {
								System.out.println("Wrong Answer. You have completed the game.");
								System.out.println("Your take away reward is : "+amount);
								return false;
							}
						}
					}
				}
			}
		}
		else {
			if(res.equalsIgnoreCase("d")) {
				System.out.println("Correct Answer You have won Rs." + amount);
				amount = 90000;
				return true;
			}
			else {
				System.out.println("Wrong Answer. You have completed the game.");
				System.out.println("Your take away reward is : "+amount);
				return false;
			}
		}
		return false;
	}
	public boolean question10(String name) {
		System.out.println("10. Who is the founder of Java?");
		System.out.println("a. Dennis Ritchie\n"
						 + "b. Stroustrup\n"
						 + "c. Charles Babbage\n"
						 + "d. James Gosling\n"
						 + "e. Life Line");
		String res = sc.next();
		int sel1=0;
		String sel2;
		if(res.equalsIgnoreCase("e")) {
			if(life_line_count!=0) {
				System.out.println("You have the following Life Lines: \n"
								 + "1. Audiance Phone\n"
								 + "2. 50-50\n");
				sel1=sc.nextInt();
				if(sel1==1) {
					if(aud_phn_cnt!=0) {
						aud_phn_cnt--;
						life_line_count--;
						System.out.println("Select your choice: ");
						System.out.println("a. Dennis Ritchie ---> 20%\n"
								 + "b. Stroustrup ---> 5%\n"
								 + "c. Charles Babbage ---> 15%\n"
								 + "d. James Gosling ---> 60%\n");
						res = sc.next();
						if(res.equalsIgnoreCase("d")) {
							System.out.println("Correct Answer You have won Rs." + amount);
							amount = 100000;
							return true;
						}
						else {
							System.out.println("Wrong Answer. You have completed the game.");
							System.out.println("Your take away reward is : "+amount);
							return false;
						}
					}
					else {
						System.out.println("You have already used this life line.\n"
										 + "Available Life line is : \n"
										 + "2. 50-50\n"
										 + "Do you wish to use it?(y/n)");
						sel2 = sc.next();
						if(sel2.equalsIgnoreCase("y")) {
							if(fifty_fifty_cnt!=0) {
								fifty_fifty_cnt--;
								life_line_count--;
								System.out.println("Select your choice: ");
								System.out.println("a. Dennis Ritchie ---> 20%\n"
										 + "d. James Gosling ---> 60%\n");
								res = sc.next();
								if(res.equalsIgnoreCase("d")) {
									System.out.println("Correct Answer You have won Rs." + amount);
									amount = 100000;
									return true;
								}
								else {
									System.out.println("Wrong Answer. You have completed the game.");
									System.out.println("Your take away reward is : "+amount);
									return false;
								}
							}
							else {
								System.out.println("None of the life lines are available.");
								System.out.println("Choose the correct option: ");
								System.out.println("a. Dennis Ritchie\n"
										 + "b. Stroustrup\n"
										 + "c. Charles Babbage\n"
										 + "d. James Gosling\n"
										 + "e. Life Line");
								res = sc.next();
								if(res.equalsIgnoreCase("d")) {
									System.out.println("Correct Answer You have won Rs." + amount);
									amount = 100000;
									return true;
								}
								else {
									System.out.println("Wrong Answer. You have completed the game.");
									System.out.println("Your take away reward is : "+amount);
									return false;
								}
							}
						}
						else {
							System.out.println("Choose the correct option: ");
							System.out.println("a. Dennis Ritchie\n"
									 + "b. Stroustrup\n"
									 + "c. Charles Babbage\n"
									 + "d. James Gosling\n"
									 + "e. Life Line");
							res = sc.next();
							if(res.equalsIgnoreCase("d")) {
								System.out.println("Correct Answer You have won Rs." + amount);
								amount = 100000;
								return true;
							}
							else {
								System.out.println("Wrong Answer. You have completed the game.");
								System.out.println("Your take away reward is : "+amount);
								return false;
							}
						}
					}
				}
			}
		}
		else {
			if(res.equalsIgnoreCase("d")) {
				System.out.println("Correct Answer You have won Rs." + amount);
				amount = 100000;
				System.out.println("\nGame over!");
			    System.out.println("Your total earnings: Rs." + amount);
				return true;
			}
			else {
				System.out.println("Wrong Answer. You have completed the game.");
				System.out.println("Your take away reward is : "+amount);
				return false;
			}
		}
		System.out.println("\nGame over!");
	    System.out.println("Your total earnings: Rs." + amount);
		return false;
	}
	 
	
	
}
