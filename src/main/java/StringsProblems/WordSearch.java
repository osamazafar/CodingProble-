package StringsProblems;

public class WordSearch {
	
	public  boolean Word(char [][] a, String word)
	{
		int n = a.length;
		int m = a[0].length;
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				if(helper(a, word,  i, j, 0))
					return true;
			}
		}
		return false;
	}
	
	public boolean helper(char [][] a, String word, int i, int j, int index)
	{
		if(index == word.length())
			return true;
		if(i < 0 || i >= a.length || j < 0 || j >= a[0].length)
			return false;
		if(a[i][j] - word.charAt(index) != 0)
			return false;
		char c = a[i][j];
		a[i][j] = 1;
		boolean res =	helper(a, word,  i+1, j, index+ 1) ||
						helper(a, word,  i-1, j, index+ 1) ||
						helper(a, word,  i, j+1, index+ 1) ||
						helper(a, word,  i, j-1, index+ 1);
		
		a[i][j] = c;
		return res;
	}

	
	public static void main(String[] args ) throws InterruptedException
	{
		char [][] a = new char [][] {{'A','B','C','E'},
									{'S','F','C','S'},
									{'A','D','E','E'},};
									
		String s = "ABCCED SEE ABCB ASA ";
		String [] str = s.split(" ");
		for(int i = 0; i < str.length; i++)
		{
									
		String word = str[i];
		
		WordSearch ob1 = new WordSearch();
	    System.out.println(ob1.Word(a, word));
		}
	}
}
