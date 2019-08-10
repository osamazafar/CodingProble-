
package HashMap;

import java.util.ArrayList;
import java.util.HashMap;


public class WindowString
{
	
	public static int window(String s, String t)
	{
		HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
		int result = 0;
		
		
		for(int i =0; i < t.length(); i++)
		{
			if(!map.containsKey(t.charAt(i)))
			{
				map.put(t.charAt(i), new ArrayList<Integer>());	
			}
			
		}
		
		for(int i = 0; i < s.length(); i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
				map.get(s.charAt(i)).add(i);
			}
			else
				continue;
		}
		
		
	
		
			
		
		return result;
		
	}

	public static void main(String[] args)
	{
		String s = "ADOBECODEBANC";
		String t = "ABC";
		System.out.println(WindowString.window(s, t));
		
	}

}
