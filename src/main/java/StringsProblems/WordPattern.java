package StringsProblems;

import java.util.HashMap;
import java.util.Map;

public class WordPattern
{
	
	public static boolean word(String pattern, String str)
	{
		 if (pattern == null || str == null || pattern.length() == 0 || str.length() == 0) {
	            return false;
	        }
	        String[] words = str.split(" ");
	        if (words.length != pattern.length()) {
	            return false;
	        }
	        
	        Map<Character, String> map1 = new HashMap<>();
	        Map<String, Character> map2 = new HashMap<>();
	        
	        
	        for(int i = 0; i < words.length; i++)
	        {
	        	char ch = pattern.charAt(i);
	        	if(map1.containsKey(ch) && !map1.get(ch).equals(words[i]))
	        		return false;
	        	else if(map2.containsKey(words[i]) && map2.get(words[i]) != ch)
	        		return false;
	        	
	        	map1.put(ch, words[i]);
	        	map2.put(words[i], ch);
	        }
	        
	       System.out.println(map1);
	        return true;
	}

	
	public static void main(String [] args) throws InterruptedException
	{
		String pattern = "abba";
//		String str = "dog cat cat dog";
		String str = "dog cat cat fish";
		System.out.println(WordPattern.word(pattern, str));
		
	}
}
