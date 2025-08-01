package YDGR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringLength_Program {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader ( isr );
		System.out.println("Enter String");
		String str = br.readLine ( );
		//int num = Integer.parseInt (str);
		System.out.println("String Length:"+str.length());

}

}

