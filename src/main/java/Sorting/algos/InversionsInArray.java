package Sorting.algos;

import java.util.Arrays;

public class InversionsInArray
{

	
	static int mergeCount(int [] nums, int l, int m, int r)
	{
		int [] Left = Arrays.copyOfRange(nums,l,m+1);
		int [] right = Arrays.copyOfRange(nums, m+1, r+1);
		
		int i = 0, j= 0, swap =0;
		int k = l;
		while(i < Left.length && j < right.length)
		{
			if(Left[i] <= right[j])
			{
				nums[k] = Left[i];
				i++;
			}
			else
			{
				nums[k] = right[j++];
				swap += (m+1) - (l+i);
				j++;
				
			}
			k++;
		}
		
		while(i < Left.length)
			nums[k++] = Left[i++];
		while(j < right.length)
			nums[k++] = right[j++];
		
		return swap;
	}
	
	
	static int mergesort(int [] nums, int l, int r)
	{
		int count = 0;
		if(l < r)
		{
			int m = (l+r)/2;
			count += mergesort(nums, l, m);
			count += mergesort(nums, m+1, r);
			
			count += mergeCount(nums, l, m, r);
		}
		return count;
	}
	
	public static void main(String [] args) throws InterruptedException
	{
		int [] nums = new int [] { 1, 20, 6, 4, 5 };
		
		System.out.println(InversionsInArray.mergesort(nums,0,nums.length-1));
	}
}
