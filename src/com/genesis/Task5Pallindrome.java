package com.genesis;

public class Task5Pallindrome {
	public static void main(String ar[]) {
		
		String s="hbjh";
		boolean pallindrome=true;
		if(s!="")
			for(int i=0;i<=s.length()/2;i++) {
				if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
					pallindrome=false;
				}
			}
		if(pallindrome) {
			System.out.println(s+" is pallindrome");
		}
		else {
			System.out.println(s+" is not pallindrome");
		}
		
		
	}
	
}
