public class Human extends Player{
	//@param flag will determine whether the player is first or second
	// 		if the flag is true than its a first player otherewise is;
	private boolean flag;
	private int xCoord;
	private int yCoord;
	Human(boolean f){
		super(f);
		this.flag = f;
	}
	//@method getTheTurn will return the value of the flag
	public boolean getTheTurn(){return this.flag;}
	//@method makeMove will make a move and set the coordinates
	public void makeMove(String x,String y){

		this.xCoord = Integer.parseInt(x);
		this.yCoord = Integer.parseInt(y);
	}
	public boolean isAvailable(String str1){
			return str1.equals("_") ? true : false;
		}
	
	//@method move will retrive the move
	public String move(){return this.xCoord+"-"+this.yCoord;}
	//@method getXcord will return the x coordinates
	public int getXcord(){return this.xCoord;}
	//@method getYcord will return the y coordinates
	public int getYcord(){return this.yCoord;}


}