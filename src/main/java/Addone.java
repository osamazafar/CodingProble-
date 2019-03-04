
import java.util.ArrayList;

public class Addone {

	
	public ArrayList<Integer> AddOne(int a[])
	{
		int carry = 1;
		int n = a.length;
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = n-1; i>=0; i--)
		{
			int num = a[i] + carry;
			carry = 0;
			if(num == 10)
			{
				carry = 1;
				num = 0;
			}
			a[i] = num;

		}
	if(carry != 0)
	{
		result.add(1);
	}
	
	for(int i : a)
	{
		if((i==0) && (result.size() == 0))
			continue;
		result.add(i);
	}
	return result;
	}
	
	
	public static void main(String[] args)
	{
		int [] a = new int [] {0, 0, 0 ,9,9,9,9}; // {9,9,9} = {1,0,0,0} 
		Addone ob1 = new Addone();
		System.out.println(ob1.AddOne(a));
	}
}
