package Strings_Buffer;

public class Insert {

	public static void main(String[] args) {
StringBuffer sb=new StringBuffer("Advanced ");
		     sb.append("Java");
		    System.out.println(sb);
		    System.out.println("------------------");
		    
StringBuffer sb1=new StringBuffer(" Java");
             sb1.insert(0, "core");
             System.out.println(sb1);
 System.out.println("--------------------------");            
             
             
StringBuffer sb2=new StringBuffer("core java");
             sb1.insert(4, "SQL");
             System.out.println(sb2);
             System.out.println("-----------------------------");
             
             
 StringBuffer sb3=new StringBuffer("java");
              sb3.insert(0, "core");
              sb3.deleteCharAt(0);
              System.out.println(sb3);
              System.out.println("-----------------------");
              
              
  StringBuffer sb4=new StringBuffer("java");
               sb4.append("core");
         System.out.println(sb4.length());
           System.out.println(sb4);
                sb4.delete(0, 4);
           System.out.println(sb4);
     System.out.println("---------------------");
     
     StringBuffer sb5=new StringBuffer();
     System.out.println(sb5.capacity());
     System.out.println("");
     
     StringBuffer sb6=new StringBuffer("Hyderabad");
                  System.out.println(sb6.capacity());
     System.out.println("---------------------------");
     
     StringBuffer sb7=new StringBuffer("Hederabad");
                  sb7.ensureCapacity(100);
                  System.out.println(sb7.capacity());

     StringBuffer s6=new StringBuffer("Advanced Java");
		System.out.println(s6.reverse());
	}

}
