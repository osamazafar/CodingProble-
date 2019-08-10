package temp;

import static java.lang.System.out;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

public class test
{
	
	
	
	public static void main(String [] args) {
		
		boolean flag = false;
		 List<List<Integer>> WIN_CONDITIONS = asList(
				    asList(0, 1, 2),
				    asList(3, 4, 5),
				    asList(6, 7, 8),
				    asList(0, 3, 6),
				    asList(1, 4, 7),
				    asList(2, 5, 8),
				    asList(0, 4, 7), // Wrong Combination it should be (0,4,8);
				    asList(6, 4, 2)
				  );
		Character _lastPlayer = 'X';
		 List<Character> _board = asList('X', '0', 'X', 'X', 'X', 'X', 'X', null, null);
		List<List<Integer>>_remainingWinConditions = new ArrayList<>();

		    for (List<Integer> win_condition : WIN_CONDITIONS) {
		      _remainingWinConditions.add(new ArrayList<>(win_condition));
		    }
		    //char player = _lastPlayer = PLAYERS[_turnCount % 2];
		    ListIterator<List<Integer>> wins = _remainingWinConditions.listIterator();
		  while (wins.hasNext()) {
		      List<Character> row = wins.next().stream()
		        .map(_board::get)
		        .filter(p -> p != null)
		        .collect(toList());
		      System.out.println(row.get(0));
		      System.out.println(row);
		      
		      int players = new HashSet<>(row).size();
		      System.out.println(row.size()+"," +players+ " ,"+row.get(0));
		      if (row.size() == 3 && players == 1 && row.get(0) == _lastPlayer) {
		    	  System.out.println("flag before");
		         flag = true;
		      } else if (players == 2) {
		        wins.remove();
		      }
		    }
		  System.out.println("flag here");
		    flag = false;
	}
	
}
