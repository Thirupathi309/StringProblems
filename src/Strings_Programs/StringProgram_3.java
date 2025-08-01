 package Strings_Programs;
/*. WAP to provide reverse of a string, actual string is "javadev"and reverse 
    string is "vedavaj" 
 * 
 */
public class StringProgram_3 {

	public static void main(String[] args) {
		String s="javadev";
		String rev=" ";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			rev=ch+rev;
		}
		System.out.println("The Reverse String is:"+rev);
	}
	
 
}
