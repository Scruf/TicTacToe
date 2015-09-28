public class Player{
	//@param flag will determine whether the player is first or second
	// 		if the flag is true than its a first player otherewise is;
	private boolean flag;
	private int xCoord;
	private int yCoord;
	Player(boolean f){
		this.flag = f;
	}
	//@method getTheTurn will return the value of the flag
	public boolean getTheTurn(){return this.flag;}
	//@method makeMove will make a move and set the coordinates
	public void makeMove(String x,String y){

		this.xCoord = Integer.parseInt(x);
		this.yCoord = Integer.parseInt(y);
	}
	//@method getXcord will return the x coordinates
	public int getXcord(){return this.xCoord;}
	//@method getYcord will return the y coordinates
	public int getYcord(){return this.yCoord;}


}