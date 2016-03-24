package valtech.germanTeam.bo;


import static org.junit.Assert.*;

import org.junit.Test;

import valtech.germanTeam.service.Game;

public class TestPlayer {
	
	/*
	 * checks if the Player moves the token in the defined way
	 */
	
	@Test
	public void TestPlayerMovement() throws Exception
	{
		Game game = Game.getInstance();
		game.initGame((short)2);
		
		Player p = game.getPlayers()[0];
		FakeDie fd1 = new FakeDie();
		FakeDie fd2 = new FakeDie();
		Space startPosition = p.getToken().getCurrentSpace();
		int throwSum = p.throwDice(fd1, fd1);
		p.moveToken(throwSum);
		
		String endPosition = p.getToken().getCurrentSpace().spaceName;
		
		/*
		 * get the reference space for the test that represents the field the 
		 * token is supposed to move to
		 * for the fake dice show allways 1, the token should move 2 spaces forward
		 */
		Space referenceEndSpace = startPosition.nextSpace.nextSpace;
		String referenceEndSpaceName= referenceEndSpace.spaceName;
		
		
		assertTrue(referenceEndSpaceName.equals(endPosition));
	}

}
