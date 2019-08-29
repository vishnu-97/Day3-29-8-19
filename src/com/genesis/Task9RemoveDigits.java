package com.genesis;
//import java.util.Scanner;

public class Task9RemoveDigits {

	public static void main(String[] args) {
//		Scanner in=new Scanner(System.in);
//		System.out.print("Enter string ");
//		String s=in.nextLine();
		String s="ad3daddfd5443dfsfss";
	    StringBuffer sb=new StringBuffer(s);
	    for(int i=0;i<sb.length();i++) {
	    	if(sb.charAt(i)>='0' && sb.charAt(i)<='9' ) {
	    		sb.deleteCharAt(i);
	    		i--;
	    	}
	    }
	    System.out.println("New String ="+sb);
	}

}
