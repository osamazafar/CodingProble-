import java.util.ArrayList;
import java.util.Arrays;

public class MaximumUnsortedArray {

	public static ArrayList<Integer> maximumUnsorted(int a [])
	{
		int [] newArray = new int [a.length];
		for(int i = 0; i < newArray.length; i++)
			newArray[i] = a[i];
		Arrays.sort(newArray);
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		int i = 0;
		int j = a.length-1;
		int start = -1;
		int end = -1;
		while(i < a.length)
		{
			if(newArray[i] != a[i])
			{
				start = i;
				break;
			}
			else
				i++;
		}
		
		while(j > 0)
		{
			if(newArray[j] != a[j])
			{
				end = j;
				break;
			}
			else
				j--;
		}
		
		if(start != -1 && end != -1)
		{
			result.add(start);
			
			if(start != end)
				result.add(end);
		}
		else 
			result.add(-1);
		return result;
	}
	
	public static void main(String [] args) throws InterruptedException
	{
		int [] a = new int []{1,4,2,3,7,8,9};
		System.out.println(MaximumUnsortedArray.maximumUnsorted(a));
	}
}
