import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class BinaryToDec {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        //int num =8;
        if(num == 0){
            System.out.print(num);
        }
        
        while(num > 0){
             result.add(num % 2);
            
           // System.out.println(tmp);
            num = num / 2;
        }
        
        ListIterator<Integer> it = result.listIterator(result.size());
         while(it.hasPrevious()){
        	
             System.out.print(it.previous());
         }
	}

}
