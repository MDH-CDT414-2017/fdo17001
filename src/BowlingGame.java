
public class BowlingGame {

	private int score;
	
	public BowlingGame(String throwsResults) {
		// TODO Auto-generated constructor stub
		
		this.elaborateScore(throwsResults);
	}

	private void elaborateScore(String throwsResults) {
		// TODO Auto-generated method stub
		
	try {
		throwsResults=throwsResults.replaceAll("\\s+","");
		String [] arrayAttempts= throwsResults.split("]");
		if(arrayAttempts.length>10)
		{
			String s=arrayAttempts[9];
			int[] attempt = this.parseAttempt(s);
			
			int firstAttempt=attempt[0];
			int secondAttempt=attempt[1];
			if(firstAttempt!=10 && firstAttempt+secondAttempt!=10)
			{
				throw new Exception();
			}
			
		}
		
		for (int i=0;i<10;i++)
		{
			String s=arrayAttempts[i];
			
			
			//Call the parseThrow method in order to convert the attempt string
			//in a pair of integer that represents how many pins were knocks down 
			//in this throw
			int[] attempt = this.parseAttempt(s);
			
			int firstAttempt=attempt[0];
			int secondAttempt=attempt[1];
			
			if (firstAttempt<0 | secondAttempt<0 | firstAttempt>10 | secondAttempt>10 | firstAttempt+secondAttempt>10)  
			{
				throw new Exception();
			}
			
			
			if(firstAttempt==10)
			{
				/*if(secondAttempt==0)
				{*/

					//this attempt is a strike
					int[] nextAttempt= this.parseAttempt(arrayAttempts[i+1]);
					int firstNextAttempt=nextAttempt[0];
					int secondNextAttempt=nextAttempt[1];
					
					if (firstNextAttempt==10)
					{
						//also the next attempt is a strike
						if(i==9)
						{
							//is the last attempt
							int[] nextNextAttempt = this.parseAttempt(arrayAttempts[i+1]);
							int firstNextNextAttempt= nextNextAttempt[0];
							int secondNextNextAttempt=nextNextAttempt[1];
							
							this.score+= 10+firstNextNextAttempt+secondNextNextAttempt;
						}
						else
						{
							int[] nextNextAttempt = this.parseAttempt(arrayAttempts[i+2]);
							int firstNextNextAttempt= nextNextAttempt[0];
							
							this.score+= 10+10+firstNextNextAttempt;
						}
						
					}
					else
						this.score+=10+firstNextAttempt+secondNextAttempt;
				
				/*}
				else
				{
					//if the second attempt after a strike ain't 0 then 
					//there's an error in the string
					this.score=-1;
					break;
				}*/
			}
			else
			{
				int sumAttempt=firstAttempt+secondAttempt;
				if(sumAttempt==10)
				{
					//this attempt is a spare
					
					if(i==9)
					{
						//last attempt
						int lastAttempt=this.parseLastAttempt(arrayAttempts[i+1]);
						this.score+=10+lastAttempt;
					}
					else
					{
						int[] nextAttempt=this.parseAttempt(arrayAttempts[i+1]);
						int firstNextAttempt= nextAttempt[0];
						this.score+=10+firstNextAttempt;
					}
					
					
				}
				else
					this.score+=sumAttempt;
			}
			
			
			
			
		}
	}catch(Exception e)
	{

		this.score=-1;
	}
	
	
		
		
	}
	
	private int parseLastAttempt(String s) {
		
		return Integer.parseInt(s.substring(1));
		
	}

	private int[] parseAttempt(String s)
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
