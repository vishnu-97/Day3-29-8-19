package com.genesis;

//import java.util.*;

public class Task1DomainCounter {
	
	public static void main(String ar[]) {
//		Scanner in=new Scanner(System.in);
//		System.out.print("Enter no of emails : ");
//		String s[]=new String[in.nextInt()];
		String s[]= {"fdf@jh.jh","fdfdz@hj.c","hg@ghg.hgh","v@ghg.hgh","ghgfdf@jh.jh","dz@hj.c","hguhv@ghg.hgh"};
		int a[]=new int[s.length];
//		System.out.print("Enter emails : ");
//		in.nextLine();
//		for(int i=0;i<s.length;i++) {
//			s[i]=in.nextLine();

//		}
		
		for(int i=0;i<s.length;i++) {
			if(a[i]!=-1) {
				String ss=s[i].substring(s[i].lastIndexOf("@"));
				int c=1;
				for(int j=i+1;j<s.length;j++) {
					if(a[j]!=-1) {
						if((s[j].lastIndexOf(ss)!=-1)  && s[j].length()-s[j].lastIndexOf(ss)==ss.length()) {
							c++;
							a[j]=-1;
						}
						
					}
					
				}
				System.out.println("count of "+ss+"="+c);
				
			}
			
		}
		
//		in.close();
	}
}
