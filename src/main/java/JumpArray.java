
public class JumpArray {

	public static boolean jump(int [] a)
	{
		int end = a.length -1;
		int MaxJump = a[0];
		for(int i = 0; i <= MaxJump; i++)
		{
			MaxJump = Math.max(MaxJump, i+a[i]);
			if(MaxJump >= end)
				return true;
		}
		return false;
		
	}
	
	
	public static void main(String[] args) throws InterruptedException
	{
		int a[] = new int [] {3,2,1,0,4}; //  2,3,1,1,4
		System.out.println(JumpArray.jump(a));
	}
}
