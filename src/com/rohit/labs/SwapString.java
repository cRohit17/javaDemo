package com.rohit.labs;

public class SwapString {

	public static void main(String[] args) {
		//hie this is demo for git
		
		//wap to swap string without using third/temp variable.
		
		String a = "Hello";
		String b = "World";
		
		System.out.println("Before Swap");
		System.out.println("String a is :"+a);
		System.out.println("String b is :"+b);
		
		//1. append a and b:
		a=a+b; //HelloWorld
		
		//2. store initial string a in string b:
		b = a.substring(0, a.length()-b.length());
		
		//3. store initial string b in a:
		a = a.substring(b.length());
		
		System.out.println("After Swap");
		System.out.println("String a is :"+a);
		System.out.println("String b is :"+b);
		
	}

}
