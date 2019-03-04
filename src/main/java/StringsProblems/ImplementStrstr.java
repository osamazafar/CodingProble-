package StringsProblems;

public class ImplementStrstr {

	// The complexity of this code is O(N)
	public int needlehaystack(String needle, String haystack)
	{
		int len = needle.length();
		for(int i = 0;  i <=  haystack.length()-len; i++)
		{
			if(haystack.substring(i, i+len).equals(needle))
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		String needle = "osama";
		String haystack = "khawajamuhammadosamazafar";
		ImplementStrstr ob1 = new ImplementStrstr();
		System.out.println(ob1.needlehaystack(needle,haystack));
	}
}
