package com.xyz.basicsofprogramming.day23;

 class Calculator {
	 int add(int a ,int b) {
		 return a+b;
	  }
		double add(int a,double b) {
			 return a+b;
		  }
		float add(int a,float b) {
			 return a+b;
		  }
		int add(short a,byte b) {
			 return a+b;
		  }
		int add(short a,int b) {
			 return a+b;
		  }
		float add(float a,float b) {
			 return a+b;
		  }
		int add(int a,int b ,int c) {
			 return a+b+c;
		  }
		int add(byte a,byte b) {
			 return a+b;
		  }
		double add(float a,double b) {
			 return a+b;
		  }
		double add(double a,int b) {
			 return a+b;
		  }
		double add(int a,int b,double c) {
			 return a+b+c;
		  }
	public class programCalcy {
		public static void main(String[] args) {
			Calculator cal =new Calculator();
			int a=10 ,b=20 , c=15;
			short a1=12 ,b1=14, c1=16;
			byte a2=15,b2=16,c2=18;
			float p=123.4f ,q=556.123f ,r=977.45f;
			double m=2234.67, n=589.89 ,o=789.67;
			System.out.println(cal.add(a2, b2));
			System.out.println(cal.add(a, b ,c));
			System.out.println(cal.add(p, q));

			System.out.println(cal.add(m, b2));
			System.out.println(cal.add(a2, n));
		}
		
			
		}
}
