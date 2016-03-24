package valtech.germanTeam.bo;

import static org.junit.Assert.*;

import org.junit.Test;

import valtech.germanTeam.service.Game;

public class TestGame {
	
	
	@Test
	public void testAddPlayer() throws Exception {
		Game game = Game.getInstance();
		Player p = new Player(TokenShape.values()[1], new GoSpace("Test", 1, 1));
		game.initGame((short)2);
		game.addPlayer(p, 0);
		assertTrue(game.getPlayers()[0] == p);
	}
	
	@Test
	public void testRemovePlayer() throws Exception {
		Game game = Game.getInstance();
		game.initGame((short)2);
		game.removePlayer(0);
		assertTrue(game.getPlayers()[0] == null);
	}
	
	@Test
	public void testInitDie() {
		Game game = Game.getInstance();
		game.initDie();
		assertTrue(game.getDie().length == 2);
	}
	
	@Test
	public void testInitBoard() {
		Game game = Game.getInstance();
		game.initBoard();
		assertNotNull(game.getBoard());
	}

	@Test
	public void testInitGame() throws Exception {
		Game game = Game.getInstance();
		game.initGame((short)2);
		assertTrue(game.getPlayerCount() == 2);
		assertTrue(game.getDie().length == 2);
		assertNotNull(game.getBoard());
	}
	
	/*
	 * the test is successfull if the game does not crash and throws 
	 * a exception
	 */
	@Test
	public void testStartGame() throws Exception {
		 Game game = Game.getInstance();
		 game.initGame((short)2);
		 game.startGame();
		 assertTrue(true);
	}

}