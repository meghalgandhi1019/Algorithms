package leetcode.sorting;

import java.util.Arrays;

//Concept of the sorted sub list. Check one by one values and put in the sorted sublist by swaping
// and also meanwhile sort the sorted sub list after inserting new values in it.
public class InsertionSort {

	public static void insertionSort(int arr[]){
		for(int i = 1; i < arr.length; i++){
			int valueToSort = arr[i];
			int j = i;
					//shifting in the sorted subarray until it greater than valueto sort
					while(j > 0 && arr[j-1] > valueToSort){
						arr[j] = arr[j-1];
						j--;
					}
					arr[j] = valueToSort;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = { 24,2,45,20,56,75,2,56,99,53,12};
		System.out.println(Arrays.toString(arr));
		
		int low = 0;
		int high = arr.length - 1; 
		
		insertionSort(arr);
		System.out.println("After sorting : " + Arrays.toString(arr));
	}

}
