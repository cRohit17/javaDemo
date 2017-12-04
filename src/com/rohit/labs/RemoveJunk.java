package com.rohit.labs;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s = "ab123# jkj###sfk #$$%^";
		String s1 = "java @$%^%^ sndfnsl 451894njA*538394 gfm";
		
		// Regular Expression [^a-zA-Z0-9]
		
		s= s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		s1= s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
	}

}
