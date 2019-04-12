package HashMap;

import java.util.HashMap;

public class ColorNumber
{
/*A number can be broken into different contiguous sub-subsequence parts. 
Suppose, a number 3245 can be broken into parts like 3 2 4 5 32 24 45 324 245. 
And this number is a COLORFUL number, since product of every digit of a contiguous subsequence is different*/
	public static boolean color(int a)
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		String s = String.valueOf(a);
		int arr [] = new int [s.length()];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = s.charAt(i) - '0';
			//System.out.println(arr[i]);
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			int res = 1;
			for(int j = i; j < arr.length; j++)
			{
				res *= arr[j];
				if(map.containsKey(res))
				{
					return false;
				}
				else
					map.put(res, j);
			}
		}
				
		return true;
	}
	
	
	
	
	
	public static void main(String [] args) throws InterruptedException
	{
		int a = 1213;
		System.out.println(ColorNumber.color(a));
	}
}
