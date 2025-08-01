package YDGR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringAccurance_BufferTReader {
	public static void main(String[] args) throws IOException {

	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	System.out.println("Enther the String word");
	String s=br.readLine();
	int count=0;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(s.charAt(i)=='l') {
			count++;
			
		}
	}
	System.out.println("The given l String Repeating:"+count);
		
	}


}
