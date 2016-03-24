package valtech.germanTeam.gui;

import valtech.germanTeam.service.Game;
import valtech.germanTeam.service.IGame;

public class Window {

	public static int amountOfPlayers = 2;
	
	public static void main(String[] args) {
		//This main method is in charge of running the game
		//IGame game = new Game(2);
		IGame game = Game.getInstance();
		game.initGame((short)2);
		game.startGame();
		
		
	}

}
