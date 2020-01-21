
package StringsProblems;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber
{
	public static String largestNum(int [] nums)
	{
		String [] str = new String [nums.length];
		for(int i = 0; i < nums.length; i++)
		{
			str[i] = String.valueOf(nums[i]);
		}
		
		
		Comparator<String> comp = new Comparator<String>()
		{
			@Override
			public int compare(String s1, String s2)
			{
				return (s2+s1).compareTo(s1+s2);
			}
			
		};
		
		Arrays.sort(str, comp);
		
		StringBuilder sb = new StringBuilder();
		if(str[0].equals("0")) return "0";
		for(String s: str)
		{
			sb.append(s);
		}
		return sb.toString();
	}

	
	public static void main(String [] args) throws InterruptedException
	{
		int [] nums = new int [] {3, 30, 34, 5, 9}; // 9534330
		System.out.println(LargestNumber.largestNum(nums));
	}
}
