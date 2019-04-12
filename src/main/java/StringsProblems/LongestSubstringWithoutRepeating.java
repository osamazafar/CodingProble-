package StringsProblems;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeating
{

	public static int longest(String s)
	{
		HashSet<Character> set = new HashSet<Character>();
		int i = 0; 
		int j = 0;
		int ans = 0;
		while(i < s.length() && j < s.length())
		{
			if(!set.contains(s.charAt(j)))
	         {
	             set.add(s.charAt(j));
	             j++;
	             ans = Math.max(ans, j-i);
	         }
	         else
	         {
	             set.remove(s.charAt(i++));
	         }
		}
		return ans;
	}
	
	public static int max(String s)
	{
		HashSet<Character> set = new HashSet<Character>();
		
		int max = 0;
		if(s.length() == 1)
			return 1;
		for(int i = 0; i < s.length(); i++)
		{
			if(!set.contains(s.charAt(i)))
			{
				set.add(s.charAt(i));
				
			}
			else {
				max = Math.max(max, set.size());
				set.clear();
				set.add(s.charAt(i));
			}
		}
		return max;
	}
	
	public static int common(String s)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		int n = s.length();
		int max = 0;
		int count = 0;
		
		for(int i = 0; i < n; i++)
		{
			char ch = s.charAt(i);
			Integer c = map.get(ch);
			if(c == null)
			{
				count++;
				map.put(ch, i);
				max = Math.max(max, count);
			}
			else
			{
				i = map.get(ch);
				map.clear();
				count = 0;
			}
		}
		return max;
	}
	
	
	public static void main(String [] args) throws InterruptedException
	{
		
		String s = "dadbc"; // bbbbbbb abcabcbb pwwkew aab
		System.out.println(LongestSubstringWithoutRepeating.longest(s));
		System.out.println(LongestSubstringWithoutRepeating.max(s));
		System.out.println(LongestSubstringWithoutRepeating.common(s));
	}
}
