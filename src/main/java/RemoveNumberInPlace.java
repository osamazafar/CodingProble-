import java.util.ArrayList;

public class RemoveNumberInPlace
{
	
	public static int [] inplace(int [] nums, int val)
	{
		int j = 0;
		ArrayList<Integer> result = new ArrayList<>();
	
		
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] != val)
			{
				nums[j++] = nums[i];
				result.add(nums[i]);
			
			}
		}
		
		System.out.println(result);
		return nums;
	}

	public static void main(String[] args)
	{
		int [] nums = new int [] {2,3,4,2,3,5,6,3};
		int val = 3;
		System.out.println(RemoveNumberInPlace.inplace(nums, val));
		

	}

}
