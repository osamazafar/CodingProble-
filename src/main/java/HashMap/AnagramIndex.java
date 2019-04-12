package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class AnagramIndex
{
	
	public static ArrayList<ArrayList<Integer>> anagram(String [] s)
	{
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
		
		for(int i = 0; i < s.length; i++)
		{
			char [] ch = s[i].toCharArray();
			Arrays.sort(ch);
			String newstring = String.valueOf(ch);
			if(map.containsKey(newstring))
			{
				map.get(newstring).add(i+1);
			}
			else
			{
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(i+1);
				map.put(newstring, temp);
				
			}
		}
		
		for(ArrayList<Integer> l : map.values())
			result.add(l);
		return result;
	}
	

	public static void main(String[] args)
	{
		String [] s = new String [] {"cat", "dog", "god", "tca"};
		System.out.println(AnagramIndex.anagram(s));
	}

}
