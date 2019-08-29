package com.genesis;

//import java.util.Scanner;

public class Task3Sort {
	public static void main(String ar[]) {
//		Scanner in=new Scanner(System.in);
//		System.out.print("Enter no of Strings : ");
//		String s[]=new String[in.nextInt()];
//		System.out.print("Enter Strings : ");
//		in.nextLine();
//		for(int i=0;i<s.length;i++) {
//			s[i]=in.nextLine();
//			
//		}
		String s[]={"bhopal","agra","mumbai","chennai","pune","delhi"};

		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length-1;i++) {
				if(s[i].compareToIgnoreCase(s[j])>0) {
					String t=s[i];
					s[i]=s[j];
					s[j]=t;
				}
			}
			
		}
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]);
		}
//		in.close();
	}
}
