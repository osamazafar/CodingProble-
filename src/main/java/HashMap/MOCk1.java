package HashMap;

import java.util.HashMap;
import java.util.Map;




public class MOCk1
{

	public static String test(String s, String t)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		String result = "";
		
		
		
		for(int i = 0; i < s.length(); i++)
		{
			if(map.containsKey(s.charAt(i)))
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			else
				map.put(s.charAt(i), 1);
		}
		
		for(int i = 0; i < t.length(); i++)
		{
			if(map2.containsKey(t.charAt(i)))
				map2.put(t.charAt(i), map2.get(t.charAt(i))+1);
			else
				map2.put(t.charAt(i), 1);
		}
		
		if(map.keySet().equals(map2.keySet()))
		{
			for(Map.Entry<Character, Integer> e: map2.entrySet())
			{
				result+= e.getKey();
			}
			return result;
		}
		
		return result;
	}
	
	public static void main(String[] args) throws InterruptedException
	{
//		String s = "ABCABC";
//		String t = "ABC";
		
//		String s = "ABABAB";
//		String t = "AB";
		
		String s = "LEET";
		String t = "CODE";
		System.out.println(MOCk1.test(s, t));
	}
}
