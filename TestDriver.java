import java.util.Scanner;
public class TestDriver{
	public static void main(String []args)
	{
		Player player1 = new Player(true);
		Player player2 = new Player(false);
		Board board = new Board(3,3);
		player2.makeMove("0","2");
		board.makeMove(player1.getXcord(),player1.getYcord(),player1.getTheTurn());
		player2.makeMove("1","1");
		board.makeMove(player1.getXcord(),player1.getYcord(),player1.getTheTurn());
		player2.makeMove("2","0");
		board.makeMove(player1.getXcord(),player1.getYcord(),player1.getTheTurn());
		/*player2.makeMove("2","2");*/
		
		boolean flag = board.isWinner();
		if (!flag)
			System.out.print("First win");
		
		
	}
}