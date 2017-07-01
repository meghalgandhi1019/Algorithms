package leetcode.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int arr[]){
		boolean swapped = true;
	
		while(swapped){
			swapped = false;
			for(int i = 1; i < arr.length; i++){
				if(arr[i-1] > arr[i]){
					int temp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = temp;
					swapped = true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = { 24,2,45,20,56,75,2,56,99,53,12};
		System.out.println(Arrays.toString(arr));
		
		bubbleSort(arr);
		System.out.println("After sorting : " + Arrays.toString(arr));
	}

}
