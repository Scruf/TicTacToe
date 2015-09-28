public class Board{
	private String [][]matrix;
	private int x;
	private int y;
		Board(int x,int y)
		{
			this.x=x;
			this.y=y;
			matrix = new String[x][y];
			fill();
		}
		//@method fiil will fill the matrix with underscores 
		//mainly for the appearance and lol with gigles
		private String [][]fill()
		{
			for(int i=0;i<this.x;i++)
				for(int j=0;j<this.y;j++)
					matrix[i][j]="_";
			return matrix;
		}
		//@method getMiddle will return the middle position so 
		//the efficient search can be performed
		private String getMiddle(){
			return (int)Math.floor(this.x/2)+"-"+(int)Math.floor(this.y/2);
		}
		//@method checkTheMiddle will check if there is something in the middle
		private boolean checkTheMiddle(){
			return getMiddle().equals("X") || getMiddle.equals("O") ? true : false;
		}
		//@method checkTheWinner will check if the player a winner or not
		public boolean checkTheWinner(boolean player)
		{
			if (checkTheMiddle() && player)
			{
				 int counter = 0;
				 for(int i=0;i<x;i++)
				 {
				 	for(int j=i;j<y;j++)
				 	{
				 		if (matrix[i][j].equals("X"))
				 			counter++;
				 	}	
				 }
				 if(counter==x)
				 	return true;
			}
			else if(checkTheMiddle() && !player)
			{
				int counter= 0;
				for(int i=0;i<x;i++)
				{
					for(int j=i;j<x;j++)
					{
						if(matrix[i][j].equals("O"))
							counter++;
					}
				}
				return true;
			}



		}
		//isFirst method will check if its a first or a second player
		public boolean isFirst(boolean player){
			return player ? true : false;
		}
		public void makeMove(int x,int y,boolean flag)
		{
			if (isFirst(flag))
				matrix[x][y]="X";
				else
					matrix[x][y]="O";	
			
		}
		//dummy function to check the board
		public void print()
		{
			for(int i=0;i<x;i++)
			{
				for(int j=0;j<y;j++)
				{
					System.out.print(matrix[i][j]);

				}
				System.out.println();
			}
		}
		
}