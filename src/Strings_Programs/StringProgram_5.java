package Strings_Programs;
/*4. WAP to check whether the given string is pallindrome or not. 
     a."madam"  b."Mom" 
 * 
 */
public class StringProgram_5 {

	public static void main(String[] args) {
		String s="madam";
		String rev="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			rev=ch+rev;
		}
		//System.out.println("The Revesr String is:"+rev);
		if(s.equals(rev)) {
			System.out.println("Given String is Pallindrom");
		}
		else {
			System.out.println("Given String Not Pallindrom");
		}
		

	}

}
