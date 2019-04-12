import java.util.ArrayList;


public class Testing {
	
	public static int test(int [] arr)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		int max 	= 0;
		int count = 0;
		for(int i = 0; i < arr.length; i++)
			{
				if(!result.contains(arr[i]))
				{
					result.add(arr[i]);
					count += arr[i];
					max = Math.max(max, arr[i]);
				}
				else
				{
					max = max +1;
					result.add(max);
					count +=max;
				}
			}
		System.out.println(result);
		return count;
		
	}

	
	public static void main(String[] args)
	{
		int arr [] = new int [] {3,2,1,2,4,7,4}; // [3,2,1,4,7] total = 17
		System.out.println(Testing.test(arr));
	}
}
