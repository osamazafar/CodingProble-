package com.canvas.game;

public class TictacToeTest
{

	public static void main(String[] args)
	{

		TicTacTao game = new TicTacTao();
		game.move(4);
		game.move(0);
		game.move(3);
		game.move(2);
		game.move(7);
		game.move(1);
		game.move(6);
		game.move(8);
		game.move(5);

//		asList(0, 1, 2), asList(3, 4, 5), asList(6, 7, 8), asList(0, 3, 6), asList(1, 4, 7), asList(2, 5, 8),
//		asList(0, 4, 7), // Wrong Combination it should be (0,4,8);
//		asList(6, 4, 2));
	}
}
