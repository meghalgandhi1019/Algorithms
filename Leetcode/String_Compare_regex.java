package leetcode;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class String_Compare_regex {

	public static void main(String[] args) {
		// String to be scanned to find the pattern.
		String word = null;
		String line = null;
		
		System.out.print("Enter to find the word: ");
		Scanner sc = new Scanner(System.in);
		 word = sc.next();
		 
		 // Create a Pattern object
		 Pattern pattern = Pattern.compile("\\b"+  word +"\\b");  //Pattern regex /b for limit word boundary
        
		 // Now create matcher object.
		 line = "This is a Java";
		 System.out.println("Line is : " + line);
		 Matcher matcher = pattern.matcher(line);  

	      if (matcher.find( )) {
	         System.out.println("Found value: " + matcher.group() +" starting at "+matcher.start()+ " ending at "+matcher.end() );
	         
	      } else {
	         System.out.println("NO MATCH");
	      }
	
	sc.close();
	}

}
