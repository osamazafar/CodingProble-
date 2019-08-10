package HashMap;



public class AsciiDifference
{

	public static int ascii(String s1, String s2)
	{
		
		 int asciitotal = 0;
		String ss1;
		String ss2;
		if(s1.length() > s2.length())
		{
			ss1 = s1;
			ss2 = s2;
		}
		else
		{
			ss1 = s2;
			ss2 = s1;
		}
		
		for(int i = 0; i < ss1.length(); i++)
		{
			 asciitotal += (int) ss1.charAt(i);
		}
		for(int i = 0; i < ss2.length(); i++)
		{
			 asciitotal -= (int) ss2.charAt(i);
		}
			
		return asciitotal;
	}
	
	
	public static void main (String [] args) throws InterruptedException
	{
		String s1 = "thought";
		String s2 = "sloughs";
		System.out.println(AsciiDifference.ascii(s1,s2));
	}
	
}
