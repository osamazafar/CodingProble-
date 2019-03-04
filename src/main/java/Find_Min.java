


public class Find_Min {
	
	
	public static int SecondMin(int a[])
	{
		int min = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		int min3 = Integer.MAX_VALUE;
		for(int i= 0; i < a.length; i++)
		{
			min = Math.min(min, a[i]);
		}
		for(int i = 0; i< a.length; i++)
		{
			if(a[i] != min)
				min2 = Math.min(min2, a[i]);
			else
				i++;
		}
		for(int i = 0; i< a.length; i++)
		{
			if(a[i] != min && a[i] != min2)
				min3 = Math.min(min3, a[i]);
			else
				i++;
		}
		return min3;
	}

	public static void main(String[] args) throws InterruptedException
	{
		int a [] = new int[] {7,8,6,11,1};
		
		
		System.out.println(Find_Min.SecondMin(a));
	}
}
