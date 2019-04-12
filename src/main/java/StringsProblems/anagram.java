package StringsProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class anagram
{
	public static int Anagram(String[] s)
	{
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < s.length; i++)
		{
			String ss = s[i];
			char [] c = ss.toCharArray();
			Arrays.sort(c);
			String sorted = String.valueOf(c);
			if(map.containsKey(sorted))
			{
				map.put(sorted, map.get(sorted)+1);
			}
			else
				map.put(sorted, 1);
		}
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
	         System.out.println("value: "+entry.getKey()+" :" +"   key: "+ entry.getValue());
	             
		 }
		return 1;
		
	}
	
	
	public static ArrayList<ArrayList<String>> GroupAnagram(String [] str)
	{
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		
		for(int i = 0; i < str.length; i++)
		{
			char [] c = str[i].toCharArray();
			Arrays.sort(c);
			String sorted = String.valueOf(c);
			ArrayList<String> temp  = map.getOrDefault(sorted, new ArrayList<>());
			temp.add(str[i]);
			map.put(sorted, temp);
		}
		result.addAll(map.values());
		return result;
	}
	
	public static List<List<String>> ga(String [] s)
	{
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		
		for(String t : s)
		{
			char [] temp = t.toCharArray();
			Arrays.sort(temp);
			String sorted = String.valueOf(temp);
			if(!map.containsKey(sorted))
			{
				map.put(sorted, new ArrayList<>());
			}
			map.get(sorted).add(t);
			
		}
		return new ArrayList<>(map.values());
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException
	{
		String [] s = new String[] {"eat","tea","bnt","tnb","ate","efg" };
		anagram.Anagram(s);
		System.out.println(anagram.GroupAnagram(s));
		System.out.println(anagram.ga(s));
	
	}
}
