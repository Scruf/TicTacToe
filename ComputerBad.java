public class ComputerBad extends Player{

	protected int x;
	protected int y;
	private boolean player ;
	private int xC=-1;
	private int yC=-1;
	

		ComputerBad(boolean player,int x,int y){

			super(player);
			this.player = player;
			this.x=x;
			this.y=y;
			
			
		}
		public boolean isAvailable(String str1){
			return str1.equals("_") ? true : false;
		}
	
		public boolean getTheTurn(){return this.player;}
		public String move(){
			
			if(yC<0 && xC<0)
			{
				xC++;
				yC++;
				return xC+" "+yC;
			}
			else if(yC<y-1){
				
				yC++;
				return xC+" "+yC;
			}
			else if(xC<x-1)
			{
				yC=0;
				xC++;
				return xC+" "+yC;
			}
			return " ";
			
		}
		public void makeMove(String x,String y){
			this.x = Integer.parseInt(x);
			this.y = Integer.parseInt(y);
		}
		public int getXcord()
		{
			return this.x;
		}
		public int getYcord()
		{
			return this.y;
		}
	
}