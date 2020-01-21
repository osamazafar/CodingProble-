package BinarySearch;

public class searchRvalue
{

	
	public static boolean search(int [] a, int target)
	{
		int n = a.length;
		if(n == 0)
			return false;
		int start = 0;
		int end = n-1;
		int mid = 0;
		
		while(start <= end)
		{
			mid = (start + end)/2;
			
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
	
	public static void main(String [] args) throws InterruptedException
	{
		int [] a = new int [] {5,6,7,1,2,3};
		int target = 10;
		System.out.println(searchRvalue.search(a, target));
		
	}

	
}
