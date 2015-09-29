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
			int i=Integer.parseInt(getMiddle().split("-")[0]);
			int j=Integer.parseInt(getMiddle().split("-")[1]);
			return matrix[i][j].equals("X") || matrix[i][j].equals("O") ? true : false;
		}
		//@method checkDiagonal will check the diagonal 
		//if the player a winner or not 
		
		private boolean checkDiagonaleForPlayer()
		{
			if (checkTheMiddle() )
			{
				
				if(!matrix[0][0].equals("_"))
				{
					int counter=0;
					for(int i=0;i<x;i++)
					{
						for(int j=i;j<y;j++){
							if(matrix[i][j].equals("X"))
								counter++;
						}
					}
				
					if(counter==x)
						return true;
					
					
				}
				else{
					int counter=0;
					if(!matrix[0][y-1].equals("_"))
					{
						for(int i=0;i<x;i++)
						{
							for(int j=x-1;j>=0;j--)
							{
								if(matrix[i][j].equals("X"))
									counter++;
							}
						}
						if(counter==x)
							return true;
					}
				}
			}else if(!checkTheMiddle() ){
			
				if(!matrix[0][0].equals("_"))
				{
					int counter=0;
					for(int i=0;i<x;i++)
					{
						for(int j=x;j<y;j++){
							if(matrix[i][j].equals("O"))
								counter++;
						}
					}
					if(counter==x-1)
						return true;
				}
				else{
					int counter=0;
					if(!matrix[x-1][y-1].equals("_"))
					{
						for(int i=0;i<x;i++)
						{
							for(int j=x-1;j>=0;j--)
							{
								if(matrix[i][j].equals("O"))
									counter++;
							}
						}
						if(counter==x)
							return true;
					}
				}
			}
			else{
				return false;
			}
			return false;
		}
		//@method checkColum will check fif the user win by colum
		private boolean checkColum(){
		//chech the first player
			for(int i=0;i<x;i++)
			{
				int counter = 0;
				for(int j=0;j<y;j++)
				{
					if(matrix[i][j].equals("X"))
						counter++;
					else
						break;
				}
				if(counter==x)
					return true;
				else
					counter=0;
			}
			for(int i=0;i<x;i++)
			{
				int counter = 0;
				for(int j=0;j<y;j++)
				{
					if(matrix[i][j].equals("O"))
						counter++;
					else
						break;
				}
				if(counter==x)
					return true;
				else
					counter=0;
			}
			return false;
		}
		//@param rowWithEL will find the right row with element
		private boolean checkTheRow()
		{

			int rowWithEl = 0;
			for(int i=0;i<x;i++)
			{
				
				
				if(!matrix[0][i].equals("_") && matrix[0][i].equals("X"))
				{
					
					int counter=0;
					
					for(int j=0;j<x;j++){
						if(matrix[j][rowWithEl].equals("X"))
							counter++;
						else
							break;
						
					}
					System.out.print(counter);
					if(counter==x)
						return true;
					
				}
				rowWithEl++;
			}
			rowWithEl=0;
			for(int i=0;i<x;i++)
			{
				
				
				if(!matrix[0][i].equals("_") && matrix[0][i].equals("O"))
				{
					
					int counter=0;
					
					for(int j=0;j<x;j++){
						if(matrix[j][rowWithEl].equals("O"))
							counter++;
						else
							break;
						
					}
					System.out.print(counter);
					if(counter==x)
						return true;
					
				}
				rowWithEl++;
			}
			return false;
		}
		//@method is a winner will check if the player is a winner
		public boolean isWinner(boolean player){

			return isFirst(player) && (checkDiagonaleForPlayer() || checkColum() ||checkTheRow()) ? true : false;
		
		}
		//isFirst method will check if its a first or a second player
		private boolean isFirst(boolean player){
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