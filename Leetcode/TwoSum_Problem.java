package leetcode;
import java.util.HashMap;
import java.util.Map;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution.
//
//Example:
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].

public class TwoSum_Problem {
	
	public static void main(String args[]){
		
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
