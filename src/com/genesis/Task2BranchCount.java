package com.genesis;

//import java.util.Scanner;

public class Task2BranchCount {
	public static void main(String ar[]) {
//		Scanner in=new Scanner(System.in);
//		System.out.print("Enter no of rnos : ");
//		String s[]=new String[in.nextInt()];
//		System.out.print("Enter rnos : ");
//		in.nextLine();
//		for(int i=0;i<s.length;i++) {
//			s[i]=in.nextLine();
//			
//		}
		String s[]={"12343434","3415434","5633232","12516525","7864655"};

		int i=0;
		int cs,it,mech,civil,others;
		cs=it=mech=civil=others=0;
		while(i<s.length) {
			String ss=s[i].substring(0,2);
			if(ss.equals("12")) {
				cs++;
				
			}
			else if(ss.equals("34")) {
				it++;
				
			}
			else if(ss.equals("78")) {
				civil++;
				
			}
			else if(ss.equals("56")) {
				mech++;
				
			}
			else {
				others++;
				
			}
			i++;
		}
		System.out.println("count of cs="+cs);
		System.out.println("count of it="+it);
		System.out.println("count of civil="+civil);
		System.out.println("count of mech="+mech);
		System.out.println("count of others="+others);
//		in.close();
	}
	
}
