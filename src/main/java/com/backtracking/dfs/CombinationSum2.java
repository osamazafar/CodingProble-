package com.backtracking.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2
{
	
	public static List<List<Integer>> combinationSum2(int [] comb, int target)
	{
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(comb);
		helper(comb, result, new ArrayList<Integer>(),target, 0);
		return result;
		
	}
	
	public static void helper(int [] comb, List<List<Integer>> result, List<Integer> temp,int target, int index)
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
			for(int i =  index; i < comb.length; i++)
			{
				temp.add(comb[i]);
				helper(comb, result, temp, target- comb[i], i+1);
				temp.remove(temp.size()-1);
			}
		}
	}

	public static void main(String [] args) throws InterruptedException
	{
		int [] comb = new int [] {10,1,2,7,6,1,5};
		int target = 8;
		
		System.out.println(CombinationSum2.combinationSum2(comb, target));
		
	}
}
