package StringsProblems;
import java.util.Arrays;
import java.util.HashMap;
// Complexity of this code is O(Nlog(N))
public class PalindromePermutation {
	
	
	public boolean pp(String s)
	{
		int index = 0;
		
		s = s.toLowerCase();
		s = s.replaceAll("\\s+","");
		char[] a = s.toCharArray();
		Arrays.sort(a);
		int i =0;
		while( i < a.length-1)
		{
			if(a[i] == a[i+1])
			{
				i=i+2;
			}
			else
			{
				index++;
				i++;
			}
		}
		if(index > 1)
			return false;
		else 
			return true;
		
	}

	public boolean pp1(String s)
	{
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		for(int i = 0; i< s.length(); i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else
				map.put(s.charAt(i), 1);
		}
		
		int count = 0;
		for(int i = 0; i < s.length(); i++)
			{
				if(map.get(s.charAt(i)) == 1)
				{
					count++;
				}
			}
			if(count > 1)
				return false;
			else 
				return true;
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		String s = "Tact Caf";
		PalindromePermutation pp = new PalindromePermutation();
		System.out.println(pp.pp(s));
		System.out.println(pp.pp1(s));
	}
}
