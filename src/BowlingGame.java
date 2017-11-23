
public class BowlingGame {

	private int score;
	
	public BowlingGame(String throwsResults) {
		// TODO Auto-generated constructor stub
		
		this.elaborateScore(throwsResults);
	}

	private void elaborateScore(String throwsResults) {
		// TODO Auto-generated method stub
		String [] arrayThrow= throwsResults.split("]");
		for (String s : arrayThrow)
		{
			
			
			//get how many pins were knock down in the first attempt of this throw
			String temp=s.split(",")[0];
			temp= temp.substring(1);
			int firstAttempt=Integer.parseInt(temp);
			
			//get how many pins were knock down in the second attempt of this throw
			int secondAttempt=Integer.parseInt(s.split(",")[1]);
			
			
			
			this.score+=firstAttempt+secondAttempt;
			
			
		}
		
		
	}

	public int getScore() {
		// TODO Auto-generated method stub
		
		return this.score;
	}
	
	

}
