package com.canvas.game;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

import static java.lang.System.out;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

class Solution
{
	public static void main(String[] args)
	{
		TicTacTao game = new TicTacTao();
		game.move(0);
		game.move(3);
		game.move(1);
		game.move(4);
		game.move(2);
	}
}

public class TicTacTao
{
	static List<List<Integer>> WIN_CONDITIONS = asList(
			// asList(0, 1, 2),
			asList(0, 1, 2), asList(3, 4, 5), asList(6, 7, 8), asList(0, 3, 6), asList(1, 4, 7), asList(2, 5, 8),
			asList(0, 4, 7), // Wrong Combination it should be (0,4,8);
			asList(6, 4, 2));

	static char[] PLAYERS =
	{ 'X', 'O' };

	private List<Character> _board;
	private int _turnCount;
	private Character _lastPlayer;
	private List<List<Integer>> _remainingWinConditions;

	public TicTacTao()
	{
		_board = asList(null, null, null, null, null, null, null, null, null);
		_turnCount = 0;
		_lastPlayer = null;
		_remainingWinConditions = new ArrayList<>();

		for (List<Integer> win_condition : WIN_CONDITIONS)
		{
			_remainingWinConditions.add(new ArrayList<>(win_condition));
		}
	}

	public void move(int square)
	{
		if (square < 0 || square >= _board.size())
		{
			throw new IllegalArgumentException("Square outside of bounds");
		}
		if (_board.get(square) != null)
		{
			throw new IllegalArgumentException("Not a valid square");
		}
		char player = _lastPlayer = PLAYERS[_turnCount % 2];
		_turnCount++;
		_board.set(square, player);
		resolveTurn();
	}

	void resolveTurn()
	{
		printBoard();
		if (possibleWinner() && hasWinner())
		{
			out.println(_lastPlayer + " has won the game, congratulations!");
			return;
		} else if (_remainingWinConditions.isEmpty())
		{
			if (_board.contains(null))
			{
				out.println("Tie, there is no path to victory");
			} else
			{
				out.println("Tie, the board is full and there is no winner");
			}
		}
	}

	boolean possibleWinner()
	{
		int xCount = 0;
		int oCount = 0;
		for (Character c : _board)
		{
			if (c == null)
			{
				continue;
			} else if (c == 'X')
			{
				xCount++;
			} else if (c == 'O')
			{
				oCount++; // oCount
			}
		}
		return xCount > 2 || oCount > 2;
	}

	boolean hasWinner()
	{
		ListIterator<List<Integer>> wins = _remainingWinConditions.listIterator();
		while (wins.hasNext())
		{
			List<Character> row = wins.next().stream().map(_board::get).filter(p -> p != null).collect(toList());
			int players = new HashSet<>(row).size();
			if (row.size() == 3 && players == 1 && row.get(0) == _lastPlayer)
			{
				return true;
			} else if (players == 2)
			{
				wins.remove();
			}
		}
		return false;
	}

	void printBoard()
	{
		List<String> boardPlayers = new ArrayList<>();
		for (int i = 0; i < _board.size(); i++)
		{
			boardPlayers.add(_board.get(i) == null ? Integer.toString(i) : Character.toString(_board.get(i)));
		}
		out.println(new StringBuilder().append(printRow(0)).append("-+-+-\n").append(printRow(3)).append("-+-+-\n")
				.append(printRow(6)).toString());
	}

	String printRow(int start)
	{
		return new StringBuilder().append(printPlayer(start)).append("|") /// Missing append("|")
				.append(printPlayer(start + 1)).append("|").append(printPlayer(start + 2)).append("\n").toString();
	}

	String printPlayer(int offset)
	{
		if (_board.get(offset) == null)
		{
			return Integer.toString(offset);
		} else
		{
			return Character.toString(_board.get(offset));
		}
	}
}
