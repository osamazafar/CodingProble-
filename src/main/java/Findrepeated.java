import java.util.ArrayList;
import java.util.List;

public class Findrepeated
{
	public static List<Integer> test(int [] arr)
	{
		List<Integer> result = new ArrayList<>();
		boolean [] ch = new boolean[128]; 
		
		for(int i = 0; i < arr.length; i++)
		{
			if(ch[arr[i]] != true)
			{
				ch[arr[i]] = true;
			}
			else
				result.add(arr[i]);
		}
		return result;
	}
	
	public static void main(String [] args)
	{
		int [] arr = new int [] {2,7,5,3,1,7,9,8};
		System.out.println(Findrepeated.test(arr));
	}

}
