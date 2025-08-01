package Strings_Programs;
//1.  WAP to check count of e/E character present in a String s="javaEEdeve"
public class StringProgram_1 {

	public static void main(String[] args) {
		String s="javaEEdeve";
		int count=0;
		 for(int i=0;i<s.length();i++) {
			 char ch=s.charAt(i);
			 if(s.charAt(i)=='e'||s.charAt(i)=='E') {
				 count++;
			 }
			
		}
		 System.out.println("The count of e/E:"+count);
			

	}
}
