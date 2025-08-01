package Strings_Programs;

public class stringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Congnizant";
		String rev=" ";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);
		
		
		
		

	}

}
