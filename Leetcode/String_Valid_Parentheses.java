package leetcode;

import java.util.Scanner;

//Determine if a string is valid based on placement of parenthesis. i.e. "123(13(44))" is valid but ")234(12)(" is not. 
public class String_Valid_Parentheses {

	public static void main(String[] args) {
		
		//write the input string here.
		System.out.println("Enter the input string: ");
		Scanner sc  = new Scanner(System.in);
		String input = sc.next();
		int len = input.length();
		int left = 0;
		int right = 0;
		
		for(int i = 0; i<len; i++){
			
			if (input.charAt(i) == '(')
				left++;
			
			if (input.charAt(i) == ')' && left>right)
				right++;
		}
		
		if(left == right){
			System.out.println(input + " is Valid.");
		}else{
			System.out.println(input + " is not Valid.");
		}
sc.close();
	}

}
