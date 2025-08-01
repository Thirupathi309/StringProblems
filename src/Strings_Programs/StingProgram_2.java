package Strings_Programs;
/*/
 * 2. WAP to find smaller case vowels fom string s="javadev" \
 *    a.print vowels  b.count vowels 
 */

public class StingProgram_2 {

	public static void main(String[] args) {
		String s="javadev";
		int count=0;
		for(int i=0;i<s.length();i++) {
		   char ch=s.charAt(i);
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				System.out.println(s.charAt(i));
			    count++;	
		}
	}
	System.out.println("Count of vowels in smaller case is :"+count);
    
	
	}

}
