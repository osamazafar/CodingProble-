package StringsProblems;

public class IsUnique {

	public boolean unique(String s)
	{
		//creating bol array with all false
		boolean[] char_set = new boolean[128];
		/*for(int i = 0; i< char_set.length; i++)
		{
			System.out.println(char_set[i]);
		}*/
		for(int i = 0;  i < s.length(); i++)
		{
			int val = s.charAt(i);
			if(char_set[val])
			{
				return false;
			}
			char_set[val] = true;
			
		}
		// below line can explain how algo is working
		/*for(int i = 0; i< char_set.length; i++)
		{
			System.out.println(char_set[i]);
		}*/
		return true;
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		String s = "acefdg";
		IsUnique u1 = new IsUnique();
		System.out.println(u1.unique(s));
	}
}
