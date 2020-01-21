package Sorting.algos;

import java.util.ArrayList;

public class InsertionSort
{

	public static ArrayList<Integer> insertion(int [] nums)
	{
		ArrayList<Integer> result = new ArrayList<>();
		
		int n = nums.length;
		
		for(int i = 1; i < n; i++)
		{
			int key = nums[i];
			int j = i-1;
			while(j>= 0 && nums[j] > key)
			{
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = key;
		}
		
		return result;
		
	}
	
	static void printarray(int[] nums)
	{
		for(int i : nums)
			System.out.print(i+" ");
	}
	
//	public static ArrayList<Integer> linearSort(int [] nums)
//	{
//		ArrayList<Integer> result = new ArrayList<>();
//		int n = nums.length;
//		int min = Integer.MAX_VALUE;
//		for(int i = 0; i < nums.length; i++)
//		{
//			for(int j =i; j< n; j++)
//			{
//				min = Math.min(min, nums[j]);
//			}
//			result.add(min);
//			min = Integer.MAX_VALUE;
//		}
//		System.out.println(result);
//		return result;
//	}
	
	public static void main(String [] args) throws InterruptedException
	{
		int [] nums = new int [] {3,5,2,4,1,8,7,100,44,76,75,24,63,55,22};
		InsertionSort.printarray(nums);
		System.out.println();
		InsertionSort.insertion(nums);
		InsertionSort.printarray(nums);
		//InsertionSort.linearSort(nums);
	}
}
