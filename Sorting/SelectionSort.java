package leetcode.sorting;

import java.util.Arrays;

//This sorting algorithm is a in-place comparison based algorithm in which 
//the list is divided into two parts, sorted part at left end and 
//unsorted part at right end. Initially sorted part is empty and unsorted part is entire list.
public class SelectionSort {

	public static void selectionSort(int arr[]){
	
		for(int i = 0; i < arr.length; i++){
			
			int minPos = i;
			for(int j = i + 1; j < arr.length; j++ ){
				if(arr[j] < arr[minPos]){
					minPos = j;
				}
			}
			int smallerNumber = arr[minPos];
			arr[minPos] = arr[i];
			arr[i] = smallerNumber;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = { 24,2,45,20,56,75,2,56,99,53,12};
		System.out.println(Arrays.toString(arr));
		
		selectionSort(arr);
		System.out.println("After sorting : " + Arrays.toString(arr));

	}

}
