package com.canvas.game;

import static java.lang.System.out;
import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

public class TestClass extends TicTacTao
{
static 	List<Character> _board = asList('X', '0', 'X', null, null, null, null, null, null);
	 public void printBoard() {
		    List<String> boardPlayers = new ArrayList<>();
		    for (int i = 0; i < _board.size(); i++) {
		      boardPlayers.add(_board.get(i) == null ? Integer.toString(i) : Character.toString(_board.get(i)));
		    }
		    out.println(
		      new StringBuilder()
		        .append(printRow(0))
		        .append("-+-+-\n")
		        .append(printRow(3))
		        .append("-+-+-\n")
		        .append(printRow(6))
		        .toString()
		   );
		  }
	 String printRow(int start) {
		    return new StringBuilder()
		      .append(printPlayer(start))
		      .append("|")
		      .append(printPlayer(start + 1))
		      .append("|")
		      .append(printPlayer(start + 2))
		      .append("\n")
		      .toString();
		  }
	
	  String printPlayer(int offset) {
	    if (_board.get(offset) == null) {
	      return Integer.toString(offset);
	    } else {
	      return Character.toString(_board.get(offset));
	    }
	  }
	

	
	public static void main(String [] args)
	{
		TestClass ts = new TestClass();
		
		ts.printBoard();
//	  List<List<Integer>> WIN_CONDITIONS = asList(
//			    asList(0, 1, 2),
//			    asList(3, 4, 5),
//			    asList(6, 7, 8),
//			    asList(0, 3, 6),
//			    asList(1, 4, 7),
//			    asList(2, 5, 8),
//			    asList(0, 4, 8), // Wrong Combination it should be (0,4,8);
//			    asList(6, 4, 2)
//			  );
//	  List<Integer> test = new ArrayList<>();
//	  test.add(1);
//	  test.add(2);
//	  test.add(3);
//	 for(List<Integer> l :WIN_CONDITIONS )
//	 {
//		  if(!l.equals(test))
//		  {
//			  continue;
//		  }
//		  else
//			  System.out.println("true");
//	 }
//	}
}
}
