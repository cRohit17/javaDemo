package com.rohit.labs;

public class ReverseInteger {

	public static void main(String[] args) {
		
		//1. using algo
		int num= 12345;
		int rev = 0;
		
		while(num!=0)
		{
			rev = rev*10 + num%10 ;
			num=num/10;
			
		}
			
		System.out.println("Reverse nos is:"+rev);
		
		//2. using Stringbuffer method
		
		long num1 = 546863;
		System.out.println("Reverse nos is:"+new StringBuffer(String.valueOf(num1)).reverse());
		
	}

}
