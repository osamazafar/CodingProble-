package Trees;

import java.util.HashSet;

public class test
{

	public static int  count(String s)
	{
		 int count = 0;
		    for(int i = 0; i < s.length()-2; i++)
		    {
		        char c1 = s.charAt(i);
		        char c2 = s.charAt(i+1);
		        char c3 = s.charAt(i+2);
		        HashSet<Character> set = new HashSet<>();
		        if(!set.contains(c1) && !set.contains(c2) && !set.contains(c3))
		        {
		            set.add(c1);
		            set.add(c2);
		            set.add(c3);
		            count++;
		            set.clear();
		        }
		        
		        
		    }
		   
		    return count; 
	}
	
	
	public static void main() throws InterruptedException 
	{
		String s = "abcdaaae";
		test.count(s);
	}
}
