package com.triarq;

public class Test {
	
	public static void add (int a, int b) {
		System.out.println(a+b);
	}
	
	public void add (int c, int d, int e) {
		System.out.println(c+d+e);
	}
	public static void main(String[] args) {
		
//		calling static method:
		add(10,20);
		
		Test t=new Test();
		t.add(10, 10, 20);
		
//	1. (Reverse string + Palindrome or not)	
		/*String name="wow";
		int l=name.length();
		String rev="";
		for(int i=l-1; i>=0; i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		if(name.equals(rev)) {
			System.out.println("Palindrome Sring");
		}else {
			System.out.println("Not a Palindrome Sring");
		}*/
		
//  2. (Palindrome number or not)	
		
//	3. Ternary operator
		
		/*int x=10;
		int y=20;
		System.out.println((x>y)? "X is greater":"Y is Greater");*/
		
//	4. unary operator 
		/*int x=10;
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(--x);
		System.out.println(x--);*/
		
//	5. Shift operator 
		
//		(Right shift)
//		int x=20;
//		System.out.println(x>>2);
		/*
		x=20 --> 20/4 = --> 5
		*/
		
//		Left Shift
		
}
}
