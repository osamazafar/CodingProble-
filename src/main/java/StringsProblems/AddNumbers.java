package StringsProblems;

public class AddNumbers
{

	public static String sum(String s, String t)
	{
		StringBuilder sb = new StringBuilder();
		int i = s.length()-1;
		int j = t.length()-1;
		int sum = 0;
		while(i >= 0 || j >= 0)
		{
			if(i >= 0)
			{
				sum += s.charAt(i) - '0';
				i--;
			}
			
			if(j >= 0)
			{
				sum += t.charAt(j) - '0';
				j--;
			}
			sb.append(sum%10);
			sum /=10;
		}
		if(sum !=0)
			sb.append(1);
		String result = reverse(sb.toString());
		System.out.println(result);
		return sb.toString();
	}
	
	public static String reverse(String s)
	{
		char [] c = s.toCharArray();
		int i = 0;
		int j = c.length-1;
		while(i <j)
		{
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			i++;
			j--;
		}
		
		return String.valueOf(c);
		
	}
	
	public static void main(String [] args) throws InterruptedException
	{
		String s = "5631";
		String t = "349";
		AddNumbers.sum(s, t);
	}
}
