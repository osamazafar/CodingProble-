package com.backtracking.dfs;

public class PowerSetwithoutArrayList
{
	
	public static void powerset(String s, int index, String temp)
	{
		int n = s.length();
		if(index == n)
		{
			return;
		}
		System.out.println(temp);
		for(int i = index +1; i< n; i++)
		{
			temp += s.charAt(i);
			powerset(s, i, temp);
			temp = temp.substring(0, temp.length()-1);
		}
	}

	public static void main(String [] args) throws InterruptedException
	{
		String s = "abc";
		int index = -1;
		String temp = "";
		PowerSetwithoutArrayList.powerset(s, index, temp);
		
	}
}
