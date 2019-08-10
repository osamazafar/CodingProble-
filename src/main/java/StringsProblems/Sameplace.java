package StringsProblems;


import java.util.HashMap;

public class Sameplace
{
	
	public static boolean check(String s, String t)
	{
		int  i = 0;
		HashMap<Character, Character> map = new HashMap<>();
		
		while(i < s.length())
		{
			if(!map.containsKey(s.charAt(i)))
			{
				map.put(s.charAt(i), t.charAt(i));
				i++;
			}
			else
			{
				char c = map.get(s.charAt(i));
				System.out.println(c);
				if(c != t.charAt(i))
					return false;
				i++;
			}
			
		}
		return true;
	}

	public static void main(String [] args)
	{
		String s = "cbcdkpcp";
		String t = "afaghiai";
		System.out.println(Sameplace.check(s, t));
	}
}
