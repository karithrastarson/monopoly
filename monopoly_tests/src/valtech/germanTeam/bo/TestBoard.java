package valtech.germanTeam.bo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBoard {

	
	@Test
	public void testStartSpace(){
		
		//Make sure that the first space of the board is the "GO" Space
		Board testBoard = new Board();
		
		assertEquals(testBoard.getStartSpace().toString(),"GO");
		
	}
	@Test
	public void test1stSpace(){
		//Test the first non-start space is called "1" and the next "2"
		Board testBoard = new Board();
		
		Space first = testBoard.getStartSpace().getNextSpace();
		
		assertEquals(first.toString(), "1");
		assertEquals(first.getNextSpace().toString(), "2");
	}
	
	@Test
	public void testBoard() {
		
		//The board should be a collection of exactly 40 spaces, starting with GO
		
		Board testBoard = new Board();
		
		int counter = 0;
	
		Space runner = testBoard.getStartSpace();
		counter++;
		do
		{
			counter++;
			runner = runner.getNextSpace();
		}
		while(!runner.toString().equals("GO"));
		
		
		assertEquals(40, counter);
	}

}
