
import java.util.HashMap;

public class ColorNumber {

	public static boolean color(int n)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		String s = String.valueOf(n);
		int [] arr = new int[s.length()];
		for(int i =0; i < arr.length; i++)
		{
			arr[i] = s.charAt(i) - '0';

		}
		
	
		int res = 1;
		for(int i =0; i < arr.length; i++)
		{
			res = 1;
			for(int j =i; j < arr.length; j++)
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
	
	public static void main(String[] args) throws InterruptedException
	{
		int n = 3245;
		System.out.println(ColorNumber.color(n));
	}
}
