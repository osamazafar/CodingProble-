import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MaxLengthRepeatedsubarray
{

	public static int findLength(int[] A, int[] B) {
        int ans = 0;
        HashMap<Integer, ArrayList<Integer>> Bstarts = new HashMap<>();
        for (int j = 0; j < B.length; j++) {
            Bstarts.computeIfAbsent(B[j], x -> new ArrayList<>()).add(j);
        }
        System.out.println(Bstarts);

        for (int i = 0; i < A.length; i++) if (Bstarts.containsKey(A[i])) {
            for (int j: Bstarts.get(A[i])) {
                int k = 0;
                while (i+k < A.length && j+k < B.length && A[i+k] == B[j+k]) {
                    k++;
                }
                ans = Math.max(ans, k);
            }
        }
        return ans;
	}
	
	public static int mysolution(int [] A, int [] B)
	{
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		
		for(int i = 0; i < B.length; i++)
		{
			map.computeIfAbsent(B[i], x->new ArrayList<>()).add(i);
		}
		int ans = Integer.MIN_VALUE;
		for(int i =0; i< A.length; i++)
		{
			if(map.containsKey(A[i]))
			{
				System.out.println(map.get(A[i]));
				for(int j : map.get(A[i]))
				{
					int k = 0;
					while(i+k < A.length && j+k < B.length && A[i+k] == B[j+k])
						k++;
				
				ans = Math.max(ans, k);
				}
			}
		}
			
		return ans;
	}
	
	public static void main(String[] args)
	{
		int [] a = new int [] {1,2,3,2,1};
		int [] b = new int [] {3,2,1,4,7,1};
		System.out.println(MaxLengthRepeatedsubarray.findLength(a, b));
		System.out.println(MaxLengthRepeatedsubarray.mysolution(a, b));
		
	}

}
