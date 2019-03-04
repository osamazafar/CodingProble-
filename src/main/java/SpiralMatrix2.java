

public class SpiralMatrix2 {

	public int[][] SpiralMatrix(int n)
	{
		int [][] result = new int[n][n];
		//ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int top = 0;
		int left = 0;
		int right = n-1;
		int bottom = n-1;
		int c = 1;
		
		while(c <= n*n)
		{
			
			for(int i = top; i <= right; i++)
			{
				result[top][i] = c;

				c++;
			}
			top++;
			
			for(int i= top; i <= bottom; i++)
			{
				result[i][right] = c;
				c++;
			}
			right--;
			
			for(int i=right; i >= left; i--)
			{
				result[bottom][i] = c;
				c++;
			}
			bottom--;
			
			for(int i =bottom; i>=top; i--)
			{
				result[i][left] = c;
				c++;
			}
			left++;
		}
		
		
		return result;
	}
	
	
	public static void main(String [] args) throws InterruptedException
	{
		int  n =3;
		SpiralMatrix2 ob1= new SpiralMatrix2();
		ob1.SpiralMatrix(n);
	}
}
