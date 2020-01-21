


public class Diamond
{

	
	public static void main(String [] args) throws InterruptedException
	{
		int n = 10;
		int i = 0,j=0;
		for(i = 0; i < n; i++)
		{
			for(j = 0; j < n-i; j++)
			{
				System.out.print(" ");
			}
			
			for(int l = 0; l <= 2*i; l++)
				System.out.print("|");
			
			System.out.println("");
		}
	}
}
