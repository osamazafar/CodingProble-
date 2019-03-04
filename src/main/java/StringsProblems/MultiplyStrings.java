package StringsProblems;



public class MultiplyStrings {

	public static String mul(String A, String B)
	{
		int n = A.length();
		int m = B.length();
		int [] pos = new int[n+m];
		
		for(int i = n-1; i>= 0; i--)
		{
			for(int j = m-1; j >= 0; j--)
			{
				 
				 int mul  =( A.charAt(i) - '0') * (B.charAt(j) - '0');
				 int p1 = i+j;
				 int p2 = i+j+1;
				 int sum = mul + pos[p2];
				 pos[p1] = sum /10;
				 pos[p2] = sum % 10;
			}
		}
		
		StringBuilder result = new StringBuilder();
		for(int i : pos)
		{
			if((i == 0) && (result.length() ==0))
				continue;
			result.append(i);
		}
		return result.toString();
	}
	
	
	public static void main(String[] args) throws InterruptedException
	{
		String A = "12";
		String B = "20";
		System.out.println(MultiplyStrings.mul(A, B));
	}
}
