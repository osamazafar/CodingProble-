package com.backtracking.dfs;

import java.util.ArrayList;

public class GreyCode {

	public static ArrayList<Integer> greyCode(int n)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		 result.add(0);
		
		for(int i = 0; i < n; i++)
			for(int j = result.size()-1; j>=0; j--)
			{
				System.out.println(result);
			
				result.add(result.get(j)+ (1<<i));
			}
		return result;
		
	}
	public static void main(String[] args) throws InterruptedException
	{
		int n = 2;
		System.out.println(GreyCode.greyCode(n));
	}
}
