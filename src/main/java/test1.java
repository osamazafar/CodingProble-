
public class test1
{

	public static String test(int A)
	{
	    
	       int found = 0;
	       String a = "";
	       int num = 0;
	      A=  A+1;
	      while(true)
	      {
	           num = A;
	           String s = String.valueOf(num);
	           
	           for(int j =  s.length()-1; j >0; j--)
	           {
	               if(s.charAt(j) == '0')
	               {
	                   found++;
	                   break;
	               }
	           }
	           if(found == 0)
	           {
	        	   a = s;
	        	   break;
	           }
	           else
	           {
	        	   found = 0;
	        	   A++;
	           }
	           
	       }
	       return a;
	      
	}
	
	
	public static String ktest(int A)
	{
		StringBuilder result = new StringBuilder();
		A = A+1;
		String s = String.valueOf(A);
		for(int i= 0; i < s.length(); i++)
		{
			if(s.charAt(i)== '0')
			{
				result.append('1');
			}
			else
			{
				result.append(s.charAt(i));
			}
		}
		return result.toString();
		
	}
	
	
	static int k (int a, int b) {
		  if (a < b) {
		    if (b > 4) {
		      return 0 ;
		    }
		    else {
		      return 1;
		    }
		  }
		  else {
		    if (a > 4) {
		      return 2;
		    }
		    else {
		      return 3;
		    }
		  }
		}
	
	public static void main(String [] args) throws InterruptedException
	{
		int A = 3999;
		System.out.println(test1.test(A));
		System.out.println(test1.ktest(A));
		System.out.println(test1.k(6,8));
	}
}
