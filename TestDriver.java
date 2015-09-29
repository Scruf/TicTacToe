import java.util.Scanner;
public class TestDriver{
	public static void main(String []args)
	{
		Player player1 = new Player(true);
		Player player2 = new Player(false);
		Board board = new Board(3,3);
		player1.makeMove("0","1");
		board.makeMove(player1.getXcord(),player1.getYcord(),player1.getTheTurn());
		player2.makeMove("0","1");
		board.makeMove(player2.getXcord(),player2.getYcord(),player2.getTheTurn());
		player2.makeMove("2","1");
		board.makeMove(player2.getXcord(),player2.getYcord(),player2.getTheTurn());
		
		/*player1.makeMove("2","2");*/
		//Player class must be retested 
		boolean flag = board.isWinner(player1.getTheTurn());
		if (flag)
			System.out.print("First win");
		else
			System.out.print("Second win");
		
		
	}
}