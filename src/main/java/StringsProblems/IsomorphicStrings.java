package StringsProblems;

public class IsomorphicStrings
{
	
	public static boolean test(String s, String t)
	{
		if(s.length() != t.length())
			return false;
		char [] temp1 = new char [128]; 
		char [] temp2 = new char [128]; 
		
		char [] S = s.toCharArray();
		char [] T = t.toCharArray();
		
		
		for(int i = 0; i <s.length(); i++)
		{
			if(temp1[S[i]] != '\0' || temp2[T[i]] != '\0')
			{
				if(temp2[T[i]] != S[i])
					return false;
			}
			else
			{
				temp2[T[i]] = S[i];
				temp1[S[i]] = T[i];
			}
				
		}
		return true;
	}

	public static void main(String[] args)
	{
		String [] s = new String []  {"egg","foo", "paper"};
		String [] t = new String []  {"egg","bar", "title"};
		for(int i = 0; i < s.length; i++)
		System.out.println(IsomorphicStrings.test(s[i], t[i]));

		
	}

}
