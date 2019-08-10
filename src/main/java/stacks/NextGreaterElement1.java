package stacks;

import java.util.ArrayList;


public class NextGreaterElement1
{
	
	public static ArrayList<Integer> stack(int [] nums1, int [] nums2)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i = 0; i < nums1.length; i++)
		{
			int num = nums1[i];
			for(int j = 0; i < nums2.length; j++)
			{
				if(num == nums2[j])
				{
					if(nums2[j+1] > num  || j+1 < nums2.length-1)
					{
						result.add(num);
					}
					else
						result.add(-1);
				}
			}
		}

		
		return result;
		
	}

	
	public static void main(String[] args)
	{
		int nums2 [] = new int [] {1,3,4,2,5};
		int nums1 [] = new int [] {4,1,2};
		System.out.println(NextGreaterElement1.stack(nums1, nums2));

	}

}
