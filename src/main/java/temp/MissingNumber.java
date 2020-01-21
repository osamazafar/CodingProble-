package temp;

import java.util.ArrayList;

public class MissingNumber
{

	public static int missing(int [] nums)
	{
		int total = (0+ nums.length) * (nums.length+1)/2;
		
		for(int i: nums)
			total -=i;
		return total;
		
	}
	
	public static int miss(int [] nums)
	{
		int n = nums.length;
		ArrayList<Integer> temp = new ArrayList<>();
		for(int i = 0; i < n; i++)
		{
			if(nums[Math.abs(nums[i])-1] > 0)
				nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
			temp.add(nums[Math.abs(nums[i])-1]);
				
		}
		
		System.out.println(temp);
		return 0;
		
		
	}
	
	
	public static void main(String [] args) throws InterruptedException
	{
		int [] nums = new int [] {9,6,4,2,3,5,7,0,1};
		System.out.println(MissingNumber.missing(nums));
		System.out.println(MissingNumber.miss(nums));
	}
}
