import junit.framework.TestCase;

public class BowlingGameTest extends TestCase {

	public void testOpenFrames() {
		 
		String throwsResults="[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]";
		BowlingGame bw = new BowlingGame(throwsResults);
		assertEquals(81,bw.getScore());
		
	}
	
	public void testOneStrike() {
		String throwsResults="[10,0][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]";
		BowlingGame bw = new BowlingGame(throwsResults);
		assertEquals(94,bw.getScore());
	}
	
	public void testMultipleStrikes() {
		String throwsResults="[10,0][10,0][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]";
		BowlingGame bw = new BowlingGame(throwsResults);
		assertEquals(112,bw.getScore());
	}
	
	public void testOneSpare() {
		String throwsResults="[1,9][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]";
		BowlingGame bw = new BowlingGame(throwsResults);
		assertEquals(88,bw.getScore());
	}
	
	public void testMultipleSpares() {
		String throwsResults="[8,2][5,5][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]";
		BowlingGame bw = new BowlingGame(throwsResults);
		assertEquals(98,bw.getScore());
	}
	
	public void testSpareAfterStrike() {
		String throwsResults="[10,0][4,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6] ";
		BowlingGame bw = new BowlingGame(throwsResults);
		assertEquals(103,bw.getScore());
	}
	
	public void testSpareInLastFrame() {
		String throwsResults="[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,8][7]";
		BowlingGame bw = new BowlingGame(throwsResults);
		assertEquals(90,bw.getScore());
	}
	
	public void testStrikeInLastFrame() {
		String throwsResults="[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,8][7]";
		BowlingGame bw = new BowlingGame(throwsResults);
		assertEquals(90,bw.getScore());
	}
	
	public void testStrikeInBonusFrame() {
		String throwsResults="[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,8][10]";
		BowlingGame bw = new BowlingGame(throwsResults);
		assertEquals(93,bw.getScore());
	}
	
	public void testPerfectGame() {
		String throwsResults="[10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,10]";
		BowlingGame bw = new BowlingGame(throwsResults);
		assertEquals(300,bw.getScore());
	}
	
	public void testErrorExists1() {
		String throwsResults="[10,2][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,10]";
		BowlingGame bw = new BowlingGame(throwsResults);
		assertEquals(-1,bw.getScore());
	}
	
	public void testErrorExists2() {
		String throwsResults="[10;2][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,10]";
		BowlingGame bw = new BowlingGame(throwsResults);
		assertEquals(-1,bw.getScore());
	}
	
	public void testErrorExists3() {
		String throwsResults="[3,2][10,4][10,0][10,0][10,0][10,0][10,0][10,0][10,0][3,2]";
		BowlingGame bw = new BowlingGame(throwsResults);
		assertEquals(-1,bw.getScore());
	}
	
	
	
	
	
	
	
	
}
