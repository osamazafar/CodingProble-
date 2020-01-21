package temp;



public class PrimeNum
{

	public static void prime(int start, int end)
	{
		int i, j;
		boolean flag = false;
		
		for(i = start; i <= end; i++)
		{
			if(i < 2)
				continue;
			flag = true;
			for(j = 2; j<= i/2; j++)
			{
				if(i%j == 0)
				{
					flag = false;
					break;
				}
			}
			
			if(flag == true)
				System.out.print(i+" ");
		}
	}
	
	public static void main(String [] args) 
	{
		PrimeNum.prime(-1, 20);
	}
}
