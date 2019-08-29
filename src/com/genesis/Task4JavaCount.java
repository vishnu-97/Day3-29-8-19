package com.genesis;
//import java.util.Scanner;

public class Task4JavaCount {

	public static void main(String ar[]) {
//		Scanner in=new Scanner(System.in);
//		System.out.print("Enter String : ");
//		String s=in.nextLine()];
		String s="this is java and java is object oriented and java is powerful. I love java language";
		s=s.toLowerCase();
		int i=0,c=0;
		if(s.startsWith("java")) {
			System.out.println(i);
			c++;
		}
		while(i!=-1) {
			i=s.indexOf("java",i+1);
			if(i!=-1) {
				System.out.println(i);
				c++;
			}
		}
		System.out.println("Total count="+c);
//		in.close();
	}
}
