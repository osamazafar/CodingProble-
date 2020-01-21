package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWords
{

	public static List<String> unCommon(String a, String b)
	{
		HashMap<String, Integer> map = new HashMap<>();
		List<String> result = new ArrayList<>();
		String  collective = a+" "+b;
		String [] str = collective.split(" ");
		
		for(int i = 0; i < str.length; i++)
		{
			if(map.containsKey(str[i]))
				map.put(str[i], map.get(str[i])+1);
			else
				map.put(str[i], 1);
		}
		
		for(Map.Entry<String, Integer> e : map.entrySet())
		{
			if(e.getValue() == 1)
				result.add(e.getKey());
		}
	
		System.out.println(map);
		System.out.println(result);
		return result;
	}
	
	
	public static void main(String[] args)  throws InterruptedException
	{
		String a = "this apple is sweet";
		String b = "this apple is sour";
		UncommonWords.unCommon(a, b);
	}
}
