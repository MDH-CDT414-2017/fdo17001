import junit.framework.TestCase;

public class BowlingGameTest extends TestCase {

	public void testGetScore() {
		 
		String throwsResults="[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,8][7]";
		BowlingGame bw = new BowlingGame(throwsResults);
		assertEquals(90,bw.getScore());
		
	}
	
}
