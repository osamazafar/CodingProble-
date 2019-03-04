import java.util.ArrayList;

public class divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 3; 
		int n2 = 5;
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 1; i <= 100; i++)
		{
			if(i % n1 == 0 || i %n2 == 0)
			{
				result.add(i);
			}
		}
		System.out.println(result);
	}

}
