package StringsProblems;

public class OneAway {

	 boolean oa(String s1 , String s2)
	{
		if(s1.length() == s2.length())
			return OneEdit(s1,s2);
		else if(s1.length()+1 == s2.length())
			return OneAdded(s1,s2);
		else if(s1.length()-1 == s2.length())
			return OneAdded(s1,s2);
		return false;
	}
	 boolean OneEdit(String s , String t)
	{
		int count = 0;
		for(int i = 0;  i < s.length(); i++)
		{
			if(s.charAt(i) != t.charAt(i))
				count++;
		}
		if(count > 1)
			return false;
		else 
			return true;
	}
	
	 boolean OneAdded(String s, String t)
	{
		int index1 = 0;
		int index2 = 0;
		while(index1 < s.length() && index2 < t.length())
		{
			if(s.charAt(index1) != t.charAt(index2))
			{
				if(index1 != index2)
					return false;
				index1++;
			}
			else
			{
				index1++;
				index2++;
			}
			
				
		}
		return true;
	}
	
	
	public static void main(String[] args) throws InterruptedException
	{
		String s = "pale";
		String t = "bae";
		OneAway pp1 = new OneAway();
		System.out.println(pp1.oa(s,t));
		
		
	}
}
