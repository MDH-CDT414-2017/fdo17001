
public class BowlingGame {

	private int score;
	
	public BowlingGame(String throwsResults) {
		// TODO Auto-generated constructor stub
		
		this.elaborateScore(throwsResults);
	}

	private void elaborateScore(String throwsResults) {
		// TODO Auto-generated method stub
		String [] arrayThrow= throwsResults.split("]");
		for (int i=0;i<10;i++)
		{
			String s=arrayThrow[i];
			
			//Call the parseThrow method in order to convert the attempt string
			//in a pair of integer that represents how many pins were knocks down 
			//in this throw
			int[] attempt = this.parseThrow(s);
			
			int firstAttempt=attempt[0];
			int secondAttempt=attempt[1];
		
			if(firstAttempt==10)
			{
				//we had a strike
				int[] nextAttempt= this.parseThrow(arrayThrow[i+1]);
				int firstNextAttempt=nextAttempt[0];
				int secondNextAttempt=nextAttempt[1];
				
				this.score+=10+firstNextAttempt+secondNextAttempt;
			}
			else
			{
				this.score+=firstAttempt+secondAttempt;
			}
			
			
			
			
		}
		
		
	}
	
	private int[] parseThrow(String s)
	{
		int[] attempt= new int[2];
		
		//get how many pins were knock down in the first attempt of this throw
		String temp=s.split(",")[0];
		temp= temp.substring(1);
		attempt[0]=Integer.parseInt(temp);
		
		//get how many pins were knock down in the second attempt of this throw
		attempt[1]=Integer.parseInt(s.split(",")[1]);
		
		return attempt;
		
	}

	public int getScore() {
		// TODO Auto-generated method stub
		
		return this.score;
	}
	
	

}
