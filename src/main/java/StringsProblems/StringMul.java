package StringsProblems;

public class StringMul
{

	public static String multiplication(String num1, String num2)
	{
		int n = num1.length();
		int m = num2.length();
		int [] pos = new int[n+m];
		
		for(int i = n-1; i>=0; i--)
		{
			for(int j = m-1; j>=0; j--)
			{
				int value = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				int p1 = i+j;
				int p2 = i+j+1;
				int sum = value + pos[p2];
				pos[p1] += sum /10;
				pos[p2] = sum%10;
			}
		}
		
		StringBuilder result = new StringBuilder();
		for(int i : pos)
			result.append(i);
		return result.toString();
	}
	
	public static void main(String [] args) throws InterruptedException
	{
		String num1 = "244";
		String num2 = "77";
		System.out.println(StringMul.multiplication(num1, num2));
	}
}
