import junit.framework.TestCase;

public class BowlingGameTest extends TestCase {

	public void testGetScore() {
		 
		String throwsResults="[10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,10]";
		BowlingGame bw = new BowlingGame(throwsResults);
		assertEquals(300,bw.getScore());
		
	}
	
}
