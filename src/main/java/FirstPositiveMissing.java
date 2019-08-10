
public class FirstPositiveMissing
{
	
	public static int missing(int [] nums)
	{
		int n = nums.length;
		
		for(int i = 0; i < n; i++)
			if(nums[i] < 0)
				nums[i] = Integer.MAX_VALUE;
		
		
		for(int i = 0; i < n; i++)
		{
			int num = Math.abs(nums[i]);            
			if (num-1 < nums.length && nums[num-1] > 0)
				nums[num-1]*=-1;
		}
		
		for(int i = 0; i < n; i++)
		{
			if(nums[i] > 0)
			{
				return i+1;
			}
		}
		
		return nums.length+1;
	}
	

	public static void main(String[] args) throws InterruptedException
	{
		int [] nums = new int [] {3,4,-1,1};
		System.out.println(FirstPositiveMissing.missing(nums));
	}
}
