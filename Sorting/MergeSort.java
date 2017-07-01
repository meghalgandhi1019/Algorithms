package leetcode.sorting;

public class MergeSort {
	
	public static void mergeSort(int arr[], int low, int high){
		if(low < high){
			int mid = low + (high - low)/2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}

	public static void merge(int arr[], int low, int mid, int high){
		int[] tempArray = new int[high -low + 1]; 
		int left = low;
		int right = mid + 1;
		int k = 0;
		
		while( left <= mid && right <= high){
			//if()
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
