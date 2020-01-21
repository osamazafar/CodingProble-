
public class InMiddle
{
	
	public static int find(int [] a)
	{
		boolean found = false;
		int start = 0;
		int count = 0;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == 1 && found == false )
			{
				start = i;
				found = true;
			}
			else if(a[i] == 1 && found)
			{
				count = i - start;
				start = i;
				count /=2;
				max = Math.max(max, count);
			}
			else if((a[i] == 0 && found) && i == a.length-1)
			{
				max = Math.max(max, i-start+1);
			}
		}
		return max;
	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException
	{
		int [] a = new int [] {1,0,0,0,0,0,0,0,0,0,0,1};
		System.out.println(InMiddle.find(a));
	}

}
