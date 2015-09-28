import java.util.Scanner;
public class TestDriver{
	public static void main(String []args)
	{
		Player player1 = new Player(true);
		Player player2 = new Player(false);
		Board board = new Board(3,3);
		player1.makeMove("1","2");
		player2.makeMove("2","2");
		String middle = board.getMiddle();
		System.out.print(middle);
		System.out.println();
		board.makeMove(player1.getXcord(),player1.getYcord(),player1.getTheTurn());
		board.makeMove(player2.getXcord(),player2.getYcord(),player2.getTheTurn());
		board.print();
	}
}