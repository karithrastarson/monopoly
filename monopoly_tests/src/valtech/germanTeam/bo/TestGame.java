package valtech.germanTeam.bo;

import static org.junit.Assert.*;

import org.junit.Test;

import valtech.germanTeam.service.Game;

public class TestGame {
	
	
	@Test
	public void testAddPlayer() {
		Game game = Game.getInstance();
		Player p = new Player(TokenShape.values()[1], new Space("Test"));
		game.initGame((short)2);
		game.addPlayer(p, 0);
		assertTrue(game.getPlayers()[0] == p);
	}
	
	@Test
	public void testRemovePlayer() {
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
	public void testInitGame() {
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
	public void testStartGame() {
		 Game game = Game.getInstance();
		 game.initGame((short)2);
		 game.startGame();
		 assertTrue(true);
	}

}