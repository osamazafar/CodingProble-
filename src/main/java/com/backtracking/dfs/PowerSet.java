package com.backtracking.dfs;

import java.util.ArrayList;
import java.util.Arrays;

public class PowerSet
{

	public static ArrayList<ArrayList<Character>> pSet(String s)
	{
		ArrayList<ArrayList<Character>> result = new ArrayList<>();
		result.add(new ArrayList<Character>());
		if(s.length() == 0 || s == null)
			return result;
		char [] c = s.toCharArray();
		Arrays.sort(c);
		helper(c, result, new ArrayList<Character>(), 0);
		return result;
	}
	
	public static void helper(char [] c, ArrayList<ArrayList<Character>> result, ArrayList<Character> temp, int index)
	{
		for(int i= index; i < c.length; i++)
		{
			temp.add(c[i]);
			result.add(new ArrayList<Character>(temp));
			helper(c, result, temp, i+1);
			temp.remove(temp.size()-1);
		}
	}
	public static void main(String [] args) throws InterruptedException
	{
		String s = "abc";
		System.out.println(PowerSet.pSet(s));
	}
}
