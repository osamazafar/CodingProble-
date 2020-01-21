
public class SecondMax
{
	
	public static int secMax(int [] a)
	{
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		if(a.length < 2)
			return 0;
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] > first)
			{
				second = first;
				first = a[i];
			}
			else if(a[i] > second && a[i] != first)
			{
				second = a[i];
			}
		}
		
		if(second != Integer.MIN_VALUE)
			return second;
		else
			return 0;
	}
	
	
	public static int secMin(int [] a)
	{
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		
		if(a.length < 2)
			return 0;
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] < first)
			{
				second = first;
				first = a[i];
			}
			else if(a[i] < second && a[i] != first)
			{
				second = a[i];
			}
		}
		
		if(second != Integer.MAX_VALUE)
			return second;
		else
			return 0;
	}
	
	public static void main(String [] args) throws InterruptedException
	{
			int [] a = new int [] {12, 35, 1, 10, 34, 1};
			System.out.println(SecondMax.secMax(a));
			System.out.println(SecondMax.secMin(a));
	}
}
