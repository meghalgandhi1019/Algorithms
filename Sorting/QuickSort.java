package leetcode.sorting;

import java.util.Arrays;

public class QuickSort {
	
	public static void main(String[] args) {
	
		int arr[] = { 24,2,45,20,56,75,2,56,99,53,12};
		System.out.println(Arrays.toString(arr));
		
		int low = 0;
		int high = arr.length - 1; 
		
		quickSort(arr, low, high);
		System.out.println("After sorting : " + Arrays.toString(arr));
	}

	public static void quickSort(int arr[], int low, int high){
		if(arr == null || arr.length == 0){
			return ;
		}
		
		if(low >= high){
			return;
		}
		
		int i = low;
		int j = high;
		int middle = low + (high - low)/2;
		// Get the pivot element from the middle of the list
		int pivot = arr[middle];
		
		// Divide into two lists
		while( i <= j){
			
			// If the current value from the left list is smaller then the pivot
		      // element then get the next element from the left list
			while(arr[i] < pivot){
				i++;
			}
			
			// If the current value from the right list is larger then the pivot
		      // element then get the next element from the right list
			while(arr[j] > pivot) {
				j--;
			}
			
			// If we have found a values in the left list which is larger then
		      // the pivot element and if we have found a value in the right list
		      // which is smaller then the pivot element then we exchange the
		      // values.
		      // As we are done we can increase i and j
			if(i <= j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				i++;
				j--;
			}
		}
		
		if(low < j){
			quickSort(arr, low, j);
		}
		if(high > i){
			quickSort(arr, i, high);
		}
	}
	
	//public static void 
}
