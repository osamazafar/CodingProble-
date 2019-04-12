
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SaadiTest {
	
	
	public static List<Integer> test(List<String> s, List<String> t)
	{
	
		int count = 0;
		List<Integer> result = new ArrayList<Integer>();
		
		if(s.size() != t.size())
		{
			result.add(0);
			return result;
		}
		String s1;
		String s2;
			
	
		for(int j =0; j < s.size(); j++ )
		{
			 s1 = s.get(j);
			 s2 = t.get(j);
			System.out.println(s1);
			System.out.println(s2);
			String ss = s1 + s2;
			int n1 = s1.length();
			int n2 = s2.length();
			
			if(n1 != n2)
			{
				result.add(-1);
				
			}
			else
			{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>(); 
		for(int i = 0; i< ss.length(); i++)
		{
			if(map.containsKey(ss.charAt(i)))
			{
				map.put(ss.charAt(i), map.get(ss.charAt(i))+1);
			}
			else
				map.put(ss.charAt(i), 1);
		}
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	         if(entry.getValue() == 1)
	             count++;
		 }
		if(count == 0 )
		result.add(count);
		else
		{
			count /=2;
			result.add(count);
		}
		count = 0;
		}
		}
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = new String [] {"act", "taf", "acf", "abc", "efg"};
		String [] brr = new String [] {"acts", "aft", "acd", "efa", "awv"};
		List<String> a = new ArrayList<String>();
		List<String> b = new ArrayList<String>();
		for(int i = 0; i < arr.length; i++)
		{
			a.add(arr[i]);
			b.add(brr[i]);
			System.out.println(SaadiTest.test(a, b));
		}
		
	}

}
