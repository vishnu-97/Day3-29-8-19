package com.genesis;

public class Task8PallindromeBuffer {

	public static void main(String[] args) {
		
		String s="hjbjh";
		
		StringBuffer sb=new StringBuffer(s);
		if(sb.reverse().toString().equals(s)) {
			System.out.println(s+" is pallindrome");
		}
		else {
			System.out.println(s+" is not pallindrome");
		}
	}

}
