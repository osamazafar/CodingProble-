package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnagram
{
	
	public static ArrayList<ArrayList<String>> anagram(String [] str)
	{
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		HashMap<String, ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
		
		for(int i = 0; i < str.length; i++)
		{
			char [] ch = str[i].toCharArray();
			Arrays.sort(ch);
			String newString = String.valueOf(ch);
			
			if(!map.containsKey(newString))
			{
				ArrayList<String> temp = new ArrayList<String>();
				map.put(newString, temp);
				//temp.add(str[i]);
				
			}
			map.get(newString).add(str[i]);
			
		}
		
		for(ArrayList<String> s: map.values())
			result.add(s);
		return result;
		
	}
	
	
	public static void main(String[] args) throws InterruptedException
	{
		String [] str = new String [] {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(GroupAnagram.anagram(str));
	}
}