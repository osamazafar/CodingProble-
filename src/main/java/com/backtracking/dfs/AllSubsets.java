package com.backtracking.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSubsets
{

	public static List<List<Integer>> subsets(int [] nums)
	{
		List<List<Integer>> result = new ArrayList<>();
		result.add(new ArrayList<Integer>());
		if(nums.length == 0)
			return result;
		Arrays.sort(nums);
		helper(nums, result, new ArrayList<Integer>(), 0);
		return result;
		
	}
	
	public static void helper(int [] nums, List<List<Integer>> result, List<Integer> temp,int startIndex)
	{
		for(int i = startIndex; i < nums.length; i++)
		{
//			if(i != startIndex && nums[i] != nums[i-1]) 
//				continue;
			// if i is not at startIndex that means its not at 0, then check if in array elements are same then just continue
			temp.add(nums[i]);
			if(!result.contains(temp))
			{
				result.add(new ArrayList<Integer>(temp));
				
			}

			helper(nums, result, temp, i+1);
			temp.remove(temp.size()-1);
		}
	}
	
	
	public static void main(String [] args) throws InterruptedException
	{
		int [] nums = new int [] {4,4,4,1,4};
		System.out.println(AllSubsets.subsets(nums));
	}
}

//[[],[1],[1,4],[1,4,4],[1,4,4,4],[1,4,4,4,4],[4],[4,4],[4,4,4],[4,4,4,4]]
