package YDGR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
	import java.io.*;
	public class ReverseEachWord {
	    public static void main(String[] args) throws IOException {
	    		InputStreamReader isr = new InputStreamReader(System.in);
	    		BufferedReader br = new BufferedReader ( isr );
	    		System.out.println("Enter The String");
	    		String str = br.readLine ( );
	    		String s2[]=str.split(" ");
	    		
	    		for(String s:s2) {
	    			for(int i=s.length()-1;i>=0;i--) {
	    				char ch=s.charAt(i);
	    		System.out.print(s.charAt(i));
	    			}
	    				System.out.print(" ");
	    		}
	    	}
	    }

