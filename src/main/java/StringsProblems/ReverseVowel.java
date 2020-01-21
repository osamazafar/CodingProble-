package StringsProblems;



public class ReverseVowel
{

	public static String reverseVowel(String s)
	{
		char [] c = s.toCharArray();
		int i =0, j = c.length-1;
		while(i < j)
		{
			if(!checkVowel(c[i]))
					i++;
			if(!checkVowel(c[j]))
				j--;
			if(checkVowel(c[i]) && checkVowel(c[j]))
			{
				char temp = c[i];
				c[i] = c[j];
				c[j] = temp;
				i++;
				j--;
			}
						
		}
		
		String newstring = new String(c);
		return newstring;
	}


	private static boolean checkVowel(char c)
	{
		if(c == 'a' || c == 'e' || c == 'i' || c == 'u' || c == 'o' || c == 'A' || c=='E' || c=='I' || c=='O' || c == 'U')
			return true;
		return false;
	}

	

	
	public static void main(String [] args) throws InterruptedException
	{
		String s = "hello";
		System.out.println(ReverseVowel.reverseVowel(s));
	}
}
