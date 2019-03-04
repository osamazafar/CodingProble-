package BinarySearch;

public class SearchRotatedArray {

	public static boolean Search(int [] a, int target)
	{
		// This code works for only unique element if the elements are 
		if(a.length == 0)
			return false;
		int start = 0;
		int end = a.length-1;
		int mid = 0;
		while(start <= end)
		{
			mid = (start + end) / 2;
			if(a[mid] == target)
				return true;
			if(a[start] <= a[mid])
			{
				if(target >= a[start] && target < a[mid])
				{
					end = mid -1;
				}
				else
					start = mid +1;
			}
			else
			{
				if(target > a[mid] && target <= a[end])
				{
					start = mid +1;
				}
				else
					end = mid -1;
			}
			
		}
		return false;
	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException
	{
		int [] a = new int [] {5,6,7,1,3,4};
		int target = 3;
		System.out.println(SearchRotatedArray.Search(a, target));
	}
}
