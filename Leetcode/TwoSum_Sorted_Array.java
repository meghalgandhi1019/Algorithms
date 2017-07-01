package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrIn = {2,4,7,8};
		int target = 15;
		int[] res = new int[2];
		res = twoSum(arrIn, target);
		
		System.out.println("Answer " + res[0] + "  " +res[1]);
		
	}

	public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        int x = 0;
        
        for(int i = 0; i<nums.length; i++){
             x = nums[i];
        
            if(mp.containsKey(target - x)){
                return new int[]{mp.get(target - x), i};
            }
            mp.put(x,i);
        }
     throw new IllegalArgumentException("No two sum solution");   
    }
	
}
