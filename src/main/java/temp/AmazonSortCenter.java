package temp;

import java.util.ArrayList;
import java.util.HashMap;

public class AmazonSortCenter
{
	
	public static int [] space(int [] nums, int diff)
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		int [] result = new int [2];
		int aa = diff - 30;
		
		
		for(int i = 0; i < nums.length; i++)
		{
			int val = aa - nums[i];
			if(map.containsKey(val))
			{
				result[0] = map.get(val);
				result[1] = i;
			}
			map.put(nums[i], i);
		}
		System.out.println(map);
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int i = 0; i < result.length; i++)
			res.add(result[i]);
		System.out.println(res);
		
		return result;
	}

	public static void main(String[] args)
	{
		int truckspace = 90;
		int [] packagespace = new int [] {32,1, 10, 28, 60};
		AmazonSortCenter.space(packagespace, truckspace);

	}

}
