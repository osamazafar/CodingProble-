package Sorting.algos;

public class QuickSort
{
	
	
	public static int partition(int [] nums, int left, int right)
	{
		int pivot = nums[right];
		int i = left-1;
		
		for(int j = left; j < right; j++)
		{
			if(nums[j] < pivot)
			{
				i++;
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
			
		}
		
		
		
		int temp = nums[i+1];
		nums[i+1] = nums[right];
		nums[right] = temp;
		
		return i+1;
		
	}

	public static void sort(int nums[], int left, int right)
	{
		if(left < right)
		{
			int pi = partition(nums, left, right);
			
			sort(nums, left, pi-1);
			sort(nums, pi+1, right);
			
		}
	}
	
	public static void printarr(int [] nums)
	{
		for(int i: nums)
			System.out.print(i+" ");
	}
	
	
	public static void main(String [] args) throws InterruptedException
	{
		int [] nums = new int [] {3,5,2,4,1,8,7,100,44,76,75,24,63,55,22};
		QuickSort.printarr(nums);
		System.out.println();
		QuickSort.sort(nums,0,nums.length-1);
		QuickSort.printarr(nums);
		System.out.println();
		
	}
}
