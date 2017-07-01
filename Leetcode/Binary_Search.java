package leetcode;

import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key you want to search: ");
		int key = sc.nextInt();
		
		int in_arr[] = {2,4,6,7,22,23,65,75,85,90};
		
		System.out.println( binarySearch(in_arr,key));
		sc.close();
	}
	public static String binarySearch(int[] arr, int key){
		int low = 0;
		int high = arr.length-1;
		
		while(low <= high){
			int middle = (low + high)/2;
			
			if(arr[middle] > key){
		       high = middle-1;
			}
			if(arr[middle] < key){
				low = middle + 1;
			}
			if(arr[middle] == key){
				return "Key: " + key + " found at index " + middle;
			}
				
		}
		
		 return "Nothing found";
		
	}	
	
}

