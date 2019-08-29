package com.genesis;
//import java.util.Scanner;

public class Task6CountCharacters {
	public static void main(String ar[]) {
//		Scanner in=new Scanner(System.in);
//		System.out.print("Enter string ");
//		String s=in.nextLine();
		String s="hello user123, You can Mail me @ xyz4343@gmail.com with # tag java!";
		int small,cap,spec,space,digit;
		small=cap=spec=space=digit=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
				small++;
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				cap++;
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
				digit++;
			else if(s.charAt(i)==' ')
				space++;
			else
				spec++;
		}
		System.out.printf("Small=%d,Capitals=%d,Symbols=%d,Space=%d,Digit=%d",small,cap,spec,space,digit);
//		in.close();
	}
}
