package StringsProblems;

public class StringCompression {

	
	public String sc(String s)
	{
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for(int i= 0; i < s.length(); i++)
		{
			 count++;
			if(i+1 >= s.length() || s.charAt(i) != s.charAt(i+1))
			{
				sb.append(s.charAt(i));
				sb.append(count);
				count = 0;
			}
			
				
		}
		return sb.length() < s.length()? sb.toString():s; 
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		String s = "aabcccccaaa";
		StringCompression pp1 = new StringCompression();
		System.out.println(pp1.sc(s));
	}
}
