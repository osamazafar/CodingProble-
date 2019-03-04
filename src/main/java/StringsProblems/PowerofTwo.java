package StringsProblems;

public class PowerofTwo {

	public static boolean power(String s)
	{
		int result = 0;
		for(int i = 0; i < s.length(); i++)
			result = result * 10 + (s.charAt(i) - '0');
		if((result &(result-1)) != 0)
			return false;
		return true;
	}
	
	
	public static void main(String[] args) throws InterruptedException
	{
		String s = "31";
		System.out.println(PowerofTwo.power(s));
	}
}
