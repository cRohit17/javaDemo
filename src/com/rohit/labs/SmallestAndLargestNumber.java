package com.rohit.labs;

import java.util.Arrays;

/* smallest and largest integer from array */

public class SmallestAndLargestNumber {
	
	public static void main(String[] args) {
		
		int numbers[] = {-10, 24, -10, -88, 987657};
		//int numbers[] = {-137,-137,0,0};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i=1; i<numbers.length; i++)
		{
			if(numbers[i] > largest)
			{
				largest = numbers[i];
			}
			else if(numbers[i] < smallest)
			{
				smallest = numbers[i];
			}
		}
		System.out.println("\n given array is:"+Arrays.toString(numbers));
		System.out.println("\n largest number is:"+largest);
		System.out.println("\n smallest number is:"+smallest);
		
	}

}
