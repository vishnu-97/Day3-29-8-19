package com.genesis;

import java.util.StringTokenizer;

public class Task10TokenCreation {

	public static void main(String[] args) {
		String s="1.java,2.oracle,3.python,4.php,5.linux";
	    StringTokenizer t=new StringTokenizer(s,",");
	    while(t.hasMoreTokens()) {
	    	String k=t.nextToken();
	    	System.out.println(k.substring(k.indexOf('.')+1));
	    }
	}

}
