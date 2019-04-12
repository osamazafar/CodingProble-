package HashMap;

import java.util.HashMap;
import java.util.Map;

public class AsciiDifference
{

	public static int ascii(String s1, String s2)
	{
		HashMap<Character, Integer> map =  new HashMap<Character, Integer>();
		int asciitotal = 0;
		
		String ss = s1+s2;
		for(int i = 0; i < ss.length(); i++)
		{
			if(map.containsKey(ss.charAt(i)))
				map.put(ss.charAt(i), map.get(ss.charAt(i))+1);
			else
				map.put(ss.charAt(i), 1);
		}
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	         if(entry.getValue() == 1)
	         {
	        	 asciitotal += (int) entry.getKey();
	         }
		 }
		return asciitotal;
	}
	
	
	public static void main (String [] args) throws InterruptedException
	{
		String s1 = "cat";
		String s2 = "eat";
		System.out.println(AsciiDifference.ascii(s1,s2));
	}
	
}
