
public class MinimumSize209
{
	
	
	
	public static int minSubArrayLen(int s, int[] nums) {
		
		int left = 0;
		int right = 0;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		
		for(left = 0; left < nums.length; left++)
		{
			while(right < nums.length && sum < s)
			{
				sum += nums[right++];
			}
			
			if(sum >= s)
			{
				min = Math.min(min, right - left);
			}
			
			sum = sum - nums[left];
		}
		return min == Integer.MAX_VALUE ? 0: min;
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int [] a = new int [] {2,3,1,2,4,3};
		int s = 7;
		System.out.println(MinimumSize209.minSubArrayLen(s, a));
	}

}
