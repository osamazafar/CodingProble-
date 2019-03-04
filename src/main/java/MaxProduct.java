
public class MaxProduct {

	public static int maxProd(int [] arr)
	{
		int max = Integer.MIN_VALUE;
		int sum = 1;
		for(int i = 0; i< arr.length; i++)
		{
			sum *= arr[i];
			max = Math.max(max, sum);
			
			if(arr[i] == 0)
			{
				sum = 1;
			}
		}
		
		sum = 1;
		for(int i = arr.length-1; i>=0; i--)
		{
			sum *= arr[i];
			max = Math.max(max, sum);
			if(arr[i] == 0)
				sum = 1;
		}
		return max;
	}
	
	
	public static void main(String[] args) throws InterruptedException
	{
		int [] arr = new int [] {3,-1,4};
		System.out.println(MaxProduct.maxProd(arr));
	}
}
