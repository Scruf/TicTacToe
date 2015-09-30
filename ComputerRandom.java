public class ComputerRandom extends Player{
	public int x;
	public int y;
	public boolean player;
		ComputerRandom(int x,int y,boolean player)
		{
			super(player);
			this.x=x;
			this.y=y;
			this.player = player;

		}
		public int getXcord(){return this.x;}
		public int getYcord(){return this.y;}
		public boolean isAvailable(String str1){return str1.equals("_") ? true : false;}
		public boolean getTheTurn(){return this.player;}
		public String move(){
			int x = (int)(Math.random()*3);
			int y =(int)(Math.random()*3);
			return x+" "+y;
		}
		public void makeMove(String x,String y){
			this.x  = Integer.parseInt(x);
			this.y = Integer.parseInt(y);
		}
}