package YDGR;

public class StringAccurance {
	public static void main(String[] args) {
	String s="Hellow World";
	int count=0;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(s.charAt(i)=='l') {
			count++;
			
		}
	}
	System.out.println("The given String Repeating:"+count);
		
	}

}
