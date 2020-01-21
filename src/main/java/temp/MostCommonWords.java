package temp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class MostCommonWords
{
	
	public static List<String> commonwords(String s, String [] wordexclude)
	{
		HashSet<String> set = new HashSet<>();
		List<String> result = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<>();
		
		
		for(int i = 0; i < wordexclude.length; i++)
		{
			set.add(wordexclude[i].toLowerCase());
		}
		
		System.out.println(s);
		String [] str = s.split("\\W");
		for(int i = 0; i < str.length; i++)
		{
			System.out.println(str[i].toLowerCase());
		}
		for(String i : str)
		{
			 i = i.toLowerCase();
	
		
			if(set.contains(i))
				continue;
		
			map.put(i, map.getOrDefault(i,0)+1);
			
		}
		int max = Integer.MIN_VALUE;
		for(int i : map.values())
		{
			max = Math.max(max, i);
		}
		
		for(Map.Entry<String, Integer> e : map.entrySet())
			if(e.getValue() == max)
				result.add(e.getKey());
		
		return result;
	}

	public static void main(String[] args)
	{
		String s = "Jack and Jill went to the market to buy bread and cheese. Cheese is Jack's and Jill's favorite food.";
		String [] wordexclude = new String [] {"and", "he", "the", "to", "is", "Jack", "Jill"};
		
		System.out.println(MostCommonWords.commonwords(s, wordexclude));
	}

}
