import java.io.*;
import java.util.*;
public class Palindrome {

public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
     // String finalRs = A.replaceAll("\\s+","");
        int ln = A.length();
   //  System.out.println(finalRs+"  :after trim " + ln);
    	  for(int i = 0; i<ln/2; i++){
    		if(A.charAt(i) == A.charAt(ln-1)){
            	 ln = ln-1;	
            	 char bc = A.charAt(i);
            	 
            }else{
            	System.out.println("No");
            	System.exit(0);
            }
          }
    	  
        System.out.println("Yes");
      
       // able was i ere i saw elba
    }
}
