package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Ip4_Ip6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner in = new Scanner(System.in);
        String[] input = new String[in.nextInt()];
        
        for(int i=0; i<input.length; i++){
           input[i] = in.nextLine();
        }
   
       /* String IPV4_PATTERN_REGEX = "[12]//d|1//d//d|2[0-5][0-5]//." +
                                "[12]//d|1//d//d|2[0-5][0-5]//." +
                                "[12]//d|1//d//d|2[0-5][0-5]//." +
                                "[12]//d|1//d//d|2[0-5][0-5]$";         */
        
       /* String IPV4_PATTERN_REGEX = "[12]?[0-9]|1[0-9][0-9]|2[0-4]//d|25[0-5]//." +
                "[12]?[0-9]|1[0-9][0-9]|2[0-4]//d|25[0-5]//." +
                "[12]?[0-9]|1[0-9][0-9]|25[0-5]//." +
                "[12]?[0-9]|1[0-9][0-9]|25[0-5]$";   */
		
	       String IPV4_REGEX = "\\A(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}\\z";
		   String IPV6_6HEX4DEC_REGEX = "\\A((?:[0-9A-Fa-f]{1,4}:){6,6})(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}\\z";
		   String IPV6_HEXCOMPRESSED_REGEX = "\\A((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)\\z";
		   String IPV6_REGEX = "\\A(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}\\z";
		
		String IPV4_PATTERN_REGEX = "25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d\\." +
				"25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d\\." +
				"25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d\\." +
				"25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d\\."; 
                

    
        String IPV6_PATTERN_REGEX = "//d//d//d//d|[a-f]//d//d//d|//d[a-f]//d//d|//d//d[a-f]//d|//d//d//d[a-f]|[a-f][a-f]//d//d|//d[a-f][a-f]//d|//d//d[a-f][a-f]|[a-f]//d//d[a-f]|[a-f][a-f][a-f]//d|//d[a-f][a-f][a-f]|[a-f]//d[a-f][a-f]|[a-f][a-f]//d[a-f]|[a-f][a-f][a-f][a-f]:" + 
            "//d//d//d//d|[a-f]//d//d//d|//d[a-f]//d//d|//d//d[a-f]//d|//d//d//d[a-f]|[a-f][a-f]//d//d|//d[a-f][a-f]//d|//d//d[a-f][a-f]|[a-f]//d//d[a-f]|[a-f][a-f][a-f]//d|//d[a-f][a-f][a-f]|[a-f]//d[a-f][a-f]|[a-f][a-f]//d[a-f]|[a-f][a-f][a-f][a-f]:" +
            "//d//d//d//d|[a-f]//d//d//d|//d[a-f]//d//d|//d//d[a-f]//d|//d//d//d[a-f]|[a-f][a-f]//d//d|//d[a-f][a-f]//d|//d//d[a-f][a-f]|[a-f]//d//d[a-f]|[a-f][a-f][a-f]//d|//d[a-f][a-f][a-f]|[a-f]//d[a-f][a-f]|[a-f][a-f]//d[a-f]|[a-f][a-f][a-f][a-f]:" +
            "//d//d//d//d|[a-f]//d//d//d|//d[a-f]//d//d|//d//d[a-f]//d|//d//d//d[a-f]|[a-f][a-f]//d//d|//d[a-f][a-f]//d|//d//d[a-f][a-f]|[a-f]//d//d[a-f]|[a-f][a-f][a-f]//d|//d[a-f][a-f][a-f]|[a-f]//d[a-f][a-f]|[a-f][a-f]//d[a-f]|[a-f][a-f][a-f][a-f]:" +
            "//d//d//d//d|[a-f]//d//d//d|//d[a-f]//d//d|//d//d[a-f]//d|//d//d//d[a-f]|[a-f][a-f]//d//d|//d[a-f][a-f]//d|//d//d[a-f][a-f]|[a-f]//d//d[a-f]|[a-f][a-f][a-f]//d|//d[a-f][a-f][a-f]|[a-f]//d[a-f][a-f]|[a-f][a-f]//d[a-f]|[a-f][a-f][a-f][a-f]:" +
            "//d//d//d//d|[a-f]//d//d//d|//d[a-f]//d//d|//d//d[a-f]//d|//d//d//d[a-f]|[a-f][a-f]//d//d|//d[a-f][a-f]//d|//d//d[a-f][a-f]|[a-f]//d//d[a-f]|[a-f][a-f][a-f]//d|//d[a-f][a-f][a-f]|[a-f]//d[a-f][a-f]|[a-f][a-f]//d[a-f]|[a-f][a-f][a-f][a-f]:" +
            "//d//d//d//d|[a-f]//d//d//d|//d[a-f]//d//d|//d//d[a-f]//d|//d//d//d[a-f]|[a-f][a-f]//d//d|//d[a-f][a-f]//d|//d//d[a-f][a-f]|[a-f]//d//d[a-f]|[a-f][a-f][a-f]//d|//d[a-f][a-f][a-f]|[a-f]//d[a-f][a-f]|[a-f][a-f]//d[a-f]|[a-f][a-f][a-f][a-f]:" +
            "//d//d//d//d|[a-f]//d//d//d|//d[a-f]//d//d|//d//d[a-f]//d|//d//d//d[a-f]|[a-f][a-f]//d//d|//d[a-f][a-f]//d|//d//d[a-f][a-f]|[a-f]//d//d[a-f]|[a-f][a-f][a-f]//d|//d[a-f][a-f][a-f]|[a-f]//d[a-f][a-f]|[a-f][a-f]//d[a-f]|[a-f][a-f][a-f][a-f]$";
        
        String temp = "255.255.255.255";
        
        System.out.println(temp.matches("IPV4_PATTERN_REGEX"));
        
        // Create a Pattern object
        Pattern r = Pattern.compile(IPV4_PATTERN_REGEX);
        Pattern r1 = Pattern.compile(IPV6_PATTERN_REGEX);

        // Now create matcher object.
        Matcher m = r.matcher(temp);
        Matcher m1 = r1.matcher(temp);
        if (m.find( )) {
           System.out.println("Found value: " + m.group() );
           //System.out.println("Found value1: " + m.group(0) );
          // System.out.println("Found value2: " + m.group(1) );
           //System.out.println("Found value3: " + m.group(2) );
          
        } else {
           System.out.println("NO MATCH");
        }
     /*   for(int j =0; j<input.length; j++){
            if(input[j].matches(IPV4_PATTERN_REGEX)){
                System.out.println("IPV4");
            }
            
            else if(input[j].matches(IPV6_PATTERN_REGEX)){
                System.out.println("IPV6");
            }else{
                System.out.println("Neither");
            }
       
    }
	in.close();  */
	}

}
