package YDGR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StatingEndindSpaces {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		
		BufferedReader br=new BufferedReader(isr);
		
		System.out.println("Enter the String");
		String str=br.readLine();
		System.out.println(str.trim());
		
		
		
	}

}
