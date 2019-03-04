import java.util.ArrayList;
import java.util.HashMap;

public class AddtwoNumbers {

	public ArrayList<Integer> addtwo(int [] a, int target)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i = 0;  i < a.length; i++)
		{
			int index = target- a[i];
			if(map.containsKey(index))
			{
				result.add(i);
				result.add(map.get(index));
			}
			else
			map.put(a[i], i);
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		int [] a = new int [] {2,4,5,3,9,11};
		int target = 12;
		AddtwoNumbers ob1 = new AddtwoNumbers();
		System.out.println(ob1.addtwo(a, target));
	}
}
