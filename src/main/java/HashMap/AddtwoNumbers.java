package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class AddtwoNumbers {

	public ArrayList<Integer> addtwo(int [] a, int target)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>(2);
		
		
		for(int i = 0;  i < a.length; i++)
		{
			int index = target- a[i];
			if(map.containsKey(index))
			{
				result.add(i);
				result.add(map.get(index));
			}
			else
			{
				if(!map.containsKey(index))
					map.put(a[i], i);
			}
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		int [] a = new int [] {4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8};
		int target = -3;
		AddtwoNumbers ob1 = new AddtwoNumbers();
		System.out.println(ob1.addtwo(a, target));
	}
}
