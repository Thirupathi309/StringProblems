package YDGR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr= new InputStreamReader(System.in);
		 
		BufferedReader br=new BufferedReader(isr);
		
		System.out.println(" Enter String");
		String str=br.readLine();
		String rev=" ";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			rev=ch+rev;
		}
	System.out.println(rev);

}
}

