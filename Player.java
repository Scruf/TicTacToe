public abstract class Player{
	public int xCoord;
	public int yCoord;
	public boolean turn;
		Player(boolean turn)
		{

			this.turn = turn;
		}
		public abstract String move();
		public abstract boolean isAvailable(String str1);
}