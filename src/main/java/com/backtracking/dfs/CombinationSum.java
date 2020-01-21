package com.backtracking.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum
{
	
	public static List<List<Integer>> comSum(int [] combinations, int target)
	{
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(combinations);
		helper(combinations, result, new ArrayList<>(),target, 0);
		return result;
		
	}

	public static void helper(int [] combinations, List<List<Integer>> result, List<Integer> temp, int target, int start)
	{
		
		if(target < 0)
			return;
		
		if(target == 0)
		{
			List<Integer> a = new ArrayList<>();
			a.addAll(temp);
			if(!result.contains(a))
				result.add(a);
		}
		else
		{
			for(int i =  start; i < combinations.length; i++)
			{
//				if(combinations[i] > target)
//					return;
				temp.add(combinations[i]);
				helper(combinations, result, temp, target -combinations[i], i);
				temp.remove(temp.size()-1);
			}
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		int [] combinations = new int [] {2,3,6,7};
		int target = 7;
		System.out.println(CombinationSum.comSum(combinations, target));
	}
}
