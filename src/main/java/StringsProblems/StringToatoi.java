package StringsProblems;

public class StringToatoi
{
	
	public static int convert(String str)
	{
		str = str.trim();
		int i = 0;
		if(str == null || str.length() < 0)
			return 0;

		char sign = '+';
		double result = 0;
		
		if(str.charAt(0) == '+')
		{
			i++;
		}
		else if(str.charAt(0) == '-')
		{
			sign = '-';
			i++;
		}
		else if(str.charAt(0)!='+' && str.charAt(0)!='-' && (str.charAt(0)<'0'||str.charAt(0)>'9')) return 0;
		
			while(str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				result = result * 10 + (str.charAt(i) - '0');
				i++;
			}
			if(sign=='-')
            {
                result=-result;
            }
		if(result > Integer.MAX_VALUE)
		{
			return Integer.MAX_VALUE;
		}
		else if(result < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		else
			return (int)result;
		
		
		
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		String s = "        4125 with words";
		System.out.println(StringToatoi.convert(s));
	}

}
