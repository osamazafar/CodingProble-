package com.backtracking.dfs;
import java.util.ArrayList;

public class Combination {

	
	public static ArrayList<ArrayList<Integer>> combinationOne(int n, int k)
	{
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		helper(result,new ArrayList<Integer> (),  n,  k,  1);
		 return result;
		
	}
	
	public static void helper(ArrayList<ArrayList<Integer>> result,ArrayList<Integer> temp, int start, int end, int index)
	{
		if(temp.size() == end)
		{
			result.add(new ArrayList<Integer>(temp));
			return;
		}
		for(int i = index; i <= start; i++)
		{
			temp.add(i);
			helper(result, temp, start, end, i+1);
			temp.remove(temp.size()-1);
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException
	{
		int n = 4; 
		int k = 2;
		System.out.println(Combination.combinationOne(n, k));
	}
}
