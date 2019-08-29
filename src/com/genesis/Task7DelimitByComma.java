package com.genesis;
//import java.util.Scanner;

public class Task7DelimitByComma {

	public static void main(String[] args) {
//		Scanner in=new Scanner(System.in);
//		System.out.print("Enter string ");
//		String s=in.nextLine();
		String s="India,Australia,England,Canada";
		int i=0,j=0;
		
		while(i!=-1) {
			i=s.indexOf(",",i+1);
			if(i!=-1) {
				System.out.println(s.substring(j,i));
				j=i+1;
			}
		}
		
		System.out.println(s.substring(j,s.length()));
		
	}
//	in.close();
}
