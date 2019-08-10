package StringsProblems;



import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;


public class SortCharacterByFrequency
{

	public static String freq(String s)
	{
		HashMap<Character,List<Character>> map = new HashMap<>();
		List<List<Character>> result = new ArrayList<>();
		for(char c: s.toCharArray())
		{
			if(!map.containsKey(c))
			{
				List<Character> temp = new ArrayList<>();
				map.put(c, temp);
			}
			map.get(c).add(c);
			
		}
		
		System.out.println(map);
	
	
		
		System.out.println(result);
		
		return s;
	}
	
	public static void main(String[] args)
	{
		String s = "treeaaac";
		System.out.println(SortCharacterByFrequency.freq(s));
	}
	
}
