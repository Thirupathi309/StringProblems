package YDGR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoOfWords {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader ( isr );
		System.out.println("Enter The String");
		String str = br.readLine ( );
		String s2[]=str.split(" ");
		System.out.println("Output:"+s2.length);
		
		
	}

}
