
public class findMissingin100
{
	
	
	
	public static int findMissing(int [] a)
	{
		boolean number [] = new boolean [101];
		int j =0;
		for(int i = 0; i < a.length; i++)
		{
			number[a[i]] = true;
		}
		
		for(j =1; j< number.length; j++)
		{
			if(number[j] == false)
				break;
			System.out.println(j + " : " + number[j]);
		}
		if(j == 101)
			j = 0;
		return j;
		
	}
	
	public static void main(String [] args) throws InterruptedException
	{
		int [] a = new int [] {100,99,98,97,96,95,94,93,92,91,1,2,
							3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
							15,16,17,18,19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
		                    30, 31, 32, 33, 34, 35, 36, 37, 38, 39,
		                    40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
		                    50, 51, 52, 53, 54, 55, 56, 57, 58, 59,
		                    60, 61, 62, 63, 64, 65, 66, 67, 68, 69,
		                    70, 71, 73, 72, 74, 75, 76, 77, 78, 79,
		                    80, 81, 82, 83, 84, 85, 86, 87, 88, 89,
		                    90};
		
		System.out.println(findMissingin100.findMissing(a));
	}
}
