import junit.framework.TestCase;

public class BowlingGameTest extends TestCase {

	public void testGetScore() {
		 
		String throwsResults="[10,0][10,0][10,0][3,6][4,4][5,3][3,3][4,5][8,1][2,6]";
		BowlingGame bw = new BowlingGame(throwsResults);
		assertEquals(129,bw.getScore());
		
	}
	
}
