package HashMap;
import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {
	
	
	public static char diff(String s, String t)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char result = '0';
		for(int i = 0; i < t.length(); i++)
		{
			if(map.containsKey(t.charAt(i)))
				map.put(t.charAt(i), map.get(t.charAt(i))+1);
			else
				map.put(t.charAt(i), 1);
		}
		
		 for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	         if(entry.getValue() == 1)
	             result = entry.getKey();
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		 }
		
		for(int i = 0; i < s.length(); i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
				map.put(s.charAt(i), map.get(s.charAt(i))-1);
			}
			
		}
		
		 for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	         if(entry.getValue() == 1)
	             result = entry.getKey();
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		 }
		return result;
		
	}
	
	
	public static void main(String[] args) throws InterruptedException
	{
		String s = "abcd";
		String t = "abcde";
		System.out.println(FindTheDifference.diff(s, t));
	}

}
