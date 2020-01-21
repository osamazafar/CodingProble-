

public class MatrixRotation
{

	public static int [][] rotate1(int [][] a)
	{
		int n = a.length;
		int m = a[0].length;
		
		for(int i = 0; i < n; i++)
		{
			for(int j = i+1; j< m; j++)
			{
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
		
		for(int i = 0; i < m; i++)
		{
			int j =0; 
			int k = n-1;
			while(j < n/2 && k >= n/2)
			{
				int temp = a[i][j];
				a[i][j] = a[i][k];
				a[i][k] = temp;
				j++;
				k--;
			}
		}
		printMatrix(a);
		return a;
		
		
	}
	
	
	public static void printMatrix(int [][] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String [] args) throws InterruptedException
	{
		int [][] a = new int [][] {{1,2,3,10}, {4,5,6,11}, {7,8,9,12},{13,14,15,16}};
		System.out.println(MatrixRotation.rotate1(a));
	}
}
