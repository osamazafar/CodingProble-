
public class largestSameSubarray
{
	
	public static int subarr(int [] a, int [] b)
	{
		int max = Integer.MIN_VALUE;
		int count = 0;
		for(int i = 0; i < a.length; i++)
		{
			int j = 0, k = i;
			while(j < b.length && k < a.length)
			{
				if(b[j] == a[k])
				{
					count++;
					max = Math.max(max, count);
					j++;
					k++;
				}
				else
				{
					count = 0;
					j++;
					k++;
				}
			}
			count = 0;
		}
		return max;
	}

	public static void main(String [] args) throws InterruptedException
	{
//		int a [] = new int [] {1,2,3,2,7,8,3,2,1,9,8};
//		int b [] = new int [] {3,2,1,9,6,4};
		
//		int a [] = new int [] {0,0,0,0,0};
//		int b [] = new int [] {0,0,0,0,0};
		
		int a [] = new int [] {0,0,0,0,1};
		int b [] = new int [] {1,0,0,0,0};
		System.out.println(largestSameSubarray.subarr(a, b));
	}
}
