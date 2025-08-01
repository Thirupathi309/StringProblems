package YDGR;
import java.util.*;
public class AnagamNumber {
	public static void main(String[ ] args){

		String s1="silent";
		String s2="listen";

		if ( s1.length ( ) != s2.length () ){
				System.out.println("Given Strings are not anagrams");
				return ;
		}

		char ch1[ ] = s1.toCharArray ( );

		char ch2[ ] = s2.toCharArray ( ) ;

		Arrays.sort ( ch1 );
		Arrays.sort ( ch2 );

		boolean flag = Arrays.equals(ch1, ch2);
		if( flag  ){
			System.out.println("Given strings are anagrams");
		}else{
			System.out.println("Given Strings are not anagrams");
		}
		

}

}


