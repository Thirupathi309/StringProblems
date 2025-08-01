package Strings_Programs;

public class StringPalindrome {

	public static void main(String[] args) {
     String s="";
     String rev="";
     for(int i=0;i<s.length();i++) {
    	 char ch=s.charAt(i);
    	 rev=ch+rev;
     }
     if(s.equals(rev)) {
     System.out.println("Palindrome");
     }
     else {
    	 System.out.println("not Palindrome");
     }

	}

}
