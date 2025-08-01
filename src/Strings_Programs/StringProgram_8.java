package Strings_Programs;

import java.util.Scanner;

public class StringProgram_8 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String");
        String s= scanner.next();
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length()-1;i++){
        	for(int j=i+1;j<s.length();j++) {
        		if(ch[i]==ch[j]) {
        			System.out.print(ch[j]);
        		}
        	}
        	
        }


	}

}
