import java.util.Scanner;

public class PlaytoLoseGame
{

	public static void playsticks(int n)
	{
		 
		 Scanner input;
		 
		 while(n != 1)
		 {
		 
			 int computerTurn = 0;
			  input = new Scanner(System.in);
			 System.out.println("Please ! take first turn choose candy between 1 to 4");
			 int val = input.nextInt();
			 if(val == 1)
			 {

				 computerTurn = 4;
				 System.out.println("Comp choose the num: "+ computerTurn);
				 n -=5;
			 }
			 else if(val == 2)
			 {
				 computerTurn = 3;
				 System.out.println("Comp choose the num: "+ computerTurn);
				 n -=5;
			 }

			 else if(val == 3)
			 {
				 computerTurn = 2;
				 System.out.println("Comp choose the num: "+ computerTurn);
				 n -=5;
			 }
			 else if(val == 4)
			 {
				 computerTurn = 1;
				 System.out.println("Comp choose the num: "+ computerTurn);
				 n -=5;
			 }
		}
		 
		 System.out.println("You have to choose the last stick! lost the game :( ");
		
	}
	
	
	public static void main(String [] args) throws InterruptedException
	{
		int n = 21;
		PlaytoLoseGame.playsticks(n);
	}
}
