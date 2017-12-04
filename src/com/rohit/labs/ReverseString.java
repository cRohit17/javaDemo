package com.rohit.labs;

public class ReverseString {

	public static void main(String[] args) {
		
		//Reverse a String:
		
		String s = "Hello World";
		
		//1. using for loop
		int len = s.length(); //8
		String rev="";
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		
		
		//2. using StringBuffer class:
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());

	}

}
