package StringsProblems;

public class StringRotation {
	
	
	public int round(String s1, String s2)
	{
		String s = s1 + s1;
		int len = s2.length();
		for(int i = 0; i <= s.length()-len; i++)
		{
			if(s.substring(i, i+len).equals(s2))
			{
				return i;
			}
		}
		return 0;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		
		StringRotation ob1 = new StringRotation();
		System.out.println(ob1.round(s1, s2));
	}

}
