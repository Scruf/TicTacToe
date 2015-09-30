public abstract class Player{
	public int xCoord;
	public int yCoord;
	public boolean turn;
		Player(boolean turn)
		{

			this.turn = turn;
		}
		public abstract String move();
		public abstract void makeMove(String x,String y);
		public abstract int getXcord();
		public abstract int getYcord();
		public abstract boolean getTheTurn();
		public abstract boolean isAvailable(String str1);
}