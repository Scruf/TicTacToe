import java.util.Queue;
public class ComputerSmart extends Player{
	private int x;
	private int y;
	private String [][]matr;
	private boolean player;
	private int moveX;
	private int moveY;
	private String []moves;
	private int counter = 0; 
	
		ComputerSmart(int x,int y,boolean player,String [][]matr){
			super(player);
			this.x=x;
			this.y=y;
			this.player=player;
			this.matr = matr;
			moves = new String[x*x];
		}
		private String getContent(int x,int y){
			return matr[x][y];
		}
		private int parser(String str1){
			return Integer.parseInt(str1);
		}
		
		public String  move()
		{
			if(counter>0)
			{

			}
				//check if its possible to do a circle around the x starting from the botom 
				if(moveX>0 && moveY>0 && moveX<x-1 && moveY<y-1)
				{
					moveX--;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
					moveY++;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
					moveX++;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
					moveX++;
					moveY++;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
					moveY--;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
					moveY--;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
					moveX--;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;

				}
				//check if its close to the left border
				//start looking at the element at the right 
				else if(moveY==0 && moveX!=x-1 && moveX!=0){
					moveX--;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
					moveY++;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
					moveX++;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
					moveX++;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
					moveY--;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
				}
				//check if it close to the right border
				//start looking to the right
				else if(moveY==y-1 && moveX!=x-1 && moveX!=0)
				{
					moveX--;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
					moveY--;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
					moveX++;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
					moveX++;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
					moveY--;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
				}
				//check if its top left corner
				else if(moveY==0 && moveX==0)
				{
					moveY++;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
					moveX--;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
					moveY--;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
				}
				//check if its a bottom left corner
				else if(moveY==0 && moveX==x-1)
				{
					moveY++;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
					moveX--;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
					moveY--;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
				}
				//check if its a top right corner
				else if(moveY==y-1 && moveX==0)
				{
					
					moveY--;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
					moveX++;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
					moveY++;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
				}
				//checking the bottom right corner
				else if(moveX==x-1 && moveY==y-1)
				{
					moveY--;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
					moveX--;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
					moveY++;
					if(isAvailable(getContent(moveX,moveY)))
						return moveX+" "+moveY;
				}
				
				else
					return " ";
			return " ";
		}
		private String getTheMiddle(){
			return String.valueOf((int)Math.floor(y/2));

		}
		public void makeMove(String x,String y){
			this.moveX = Integer.parseInt(x);
			this.moveY = Integer.parseInt(y);
			String move = String.valueOf(moveX)+" "+String.valueOf(moveY);
			moves[counter]=move;
			counter++;

		}
		public int getXcord(){return this.x;}
		public int getYcord(){return this.y;}
		public boolean isAvailable(String str1){return str1.equals("_") ? true : false;}
		public boolean getTheTurn(){return player;}
}