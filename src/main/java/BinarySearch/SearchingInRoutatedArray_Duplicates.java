package BinarySearch;

public class SearchingInRoutatedArray_Duplicates {

	
	public static boolean Search(int [] a, int target)
	{
		if(a == null || a.length == 0)
			return false;
		return helper(a, 0, a.length-1, target);
		
		
	}
	private static boolean helper(int [] a, int start, int end, int target)
	{
		int mid = (start + end)/2;
		if(a[mid] == target)
			return true;
		if(end < start)
			return false;
		
		if(a[start] < a[mid]) // left is sorted
		{
			if(target >= a[start] && target < a[mid])
			{
				return helper(a, start, mid-1, target);
			}
			else
				return helper(a, mid+1, end, target);
		}
		else if(a[start] > a[mid]) // check right side
		{
			 if(target > a[mid] && target <= a[end])
			 {
				 return helper(a, mid+1, end, target);
			 }
			 else
				 return helper(a, start, mid-1, target);
		}
		else if(a[start] == a[mid]) // duplicate in left or right
		{
			if(a[mid] != a[end])
				return helper(a, mid +1, end, target);
			else
			{
				boolean result = helper(a, start, mid-1, target);
				if(!result)
					result = helper(a, mid +1, end, target);
				return result;
			}
			
		}
		return false;
	}
	public static void main(String[] args) throws InterruptedException
	{
		int [] a = new int [] {1,3,1,1,1,1};
		int target = 3;
		System.out.println(SearchingInRoutatedArray_Duplicates.Search(a, target));
	}
}
