package com.backtracking.dfs;

public class AdditiveNumber
{

	
	public static boolean isAdditvie(String nums)
	{
		String a = "";
		String b = "";
		
		for(int i = 0; i < nums.length()/3; i++)
		{
			a = nums.substring(0, i+1);
			if(a.length() > 1 && a.charAt(0) == '0')
				continue;
			
			for(int j = i+1; j < nums.length(); j++)
			{
				b = nums.substring(i+1, j+1);
				if(b.length() > 1 && b.charAt(0) == '0')
					continue;
				if(valid(nums.substring(j+1), Long.parseLong(a), Long.parseLong(b)))
					return true;
					
			}
		}
		return false;
	}
	
	private static boolean valid(String nums, long a, long b)
	{
		long sum = a+b;
		
		String tempsum = String.valueOf(sum);
		int len = tempsum.length();
		if(len > nums.length())
			return false;
		if(len == nums.length() && tempsum.equals(nums))
			return true;
		if(nums.substring(0, len).equals(tempsum))
		{
			return valid(nums.substring(len), b, sum);
		}
		return false;
	}
	
	

	public static void main(String[] args)
	{
	
		String num = "0235813";
		System.out.println(AdditiveNumber.isAdditvie(num));
	}

}
