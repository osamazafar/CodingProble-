import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Amazon1
{
	
	public static ArrayList<Integer> IDsOfPackages(int [] nums, int target)
	{
		Map<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> result = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		int first = -1;
		int last = -1;
		for(int i = 0; i < nums.length; i++)
		{
			int index = target - nums[i];
			if(map.containsKey(index))
			{
				if(max < (map.get(index)+ i))
						{
							first = map.get(index);
							last = i;
							max = first +last;
						}
				

			}
			else
				map.put(nums[i], i);
			
		}
		result.add(first);
		result.add(last);
		return result;
	}

	
	public static void main(String [] args)
	{
		int [] nums = new int [] {1,10,25,35,60, 45,15};
		int target = 90;
		System.out.println(Amazon1.IDsOfPackages(nums, target));
	}
}
