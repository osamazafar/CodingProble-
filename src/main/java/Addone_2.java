
import java.util.Arrays;

public class Addone_2 {

	public int [] Addone2(int [] a)
	{
		int sum =1;
		int n = a.length-1;
		int [] result = new int[n+1];
		int j = n-1;
		for(int i = n-1; i>=0; i--)
		{
			sum += a[i];
			result[j] = sum % 10;
			sum = sum / 10;
			j--;
		}
		
		if(sum ==1)
		{
			result[0]=1;
			return result;
		}
		System.out.print(Arrays.copyOfRange(result, 1, result.length));
		return Arrays.copyOfRange(result, 1, result.length);
	}
	
	public static void main(String[] args)
	{
		int [] a = new int [] {0, 0, 0 ,9,9,9,9};
		Addone_2 ob1 = new Addone_2();
		System.out.println(ob1.Addone2(a));
	
	}
}
