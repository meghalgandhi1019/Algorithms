import java.io.*;

/**
 * Two strings are called anagrams if they contain same set of characters but 
 * in different order. For example, “Dormitory – Dirty Room”, “keep – peek”,  
 * “School Master – The Classroom” are some anagrams.
 */
import java.util.*;
public class Anagrams {

	 static boolean isAnagram(String A, String B) {
	      //Complete the function
	       boolean flag; 
	       int lnA = A.length();
	       int lnB = B.length();
	       
	       if(lnA != lnB){
	                flag = false;
	                return flag;
	               }
	       
	       char[] AArray = A.toLowerCase().toCharArray();
	       char[] BArray = B.toLowerCase().toCharArray();
	       
	       Arrays.sort(AArray);
	       Arrays.sort(BArray);
	       
	       flag = Arrays.equals(AArray,BArray);
	 
	       return flag;           
	                
	   }
	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        sc.close();
	        boolean ret=isAnagram(A,B);
	        if(ret)System.out.println("Anagrams");
	        else System.out.println("Not Anagrams");
	        
	    }
}
