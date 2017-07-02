package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 * @author meghalgandhi
 *
 */
public class ThreeSum {
	
	public List<List<Integer>> threeSum (int num[]){
		List<List<Integer>> result = new ArrayList<>();
		if(num.length < 3 ) return result;
		int i = 0;
		
		while(i < num.length-2){
			if(num[i] > 0) break;
			int j = i+1;
			int k = num.length-1;
			int sum = num[i] + num[j] + num[k];
			
			while(j < k){
				if(sum == 0) result.add(Arrays.asList(num[i], num[j], num[k]));
				if(sum <= 0) while(num[j] == num[++j] && j<k);
				if(sum >= 0) while(num[k--] == num[k] && j<k);
			}
			
			while(num[i] == num[++i] && i < num.length-2);
		}
		
		return result;
	}

}
