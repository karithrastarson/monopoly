package valtech.germanTeam.gui;

import valtech.germanTeam.service.Game;
import valtech.germanTeam.service.IGame;

public class Window {

	public static int amountOfPlayers = 2;
	
	public static void main(String[] args) {
		//This main method is in charge of running the game
		IGame game = Game.getInstance();
		try {
			game.initGame((short)2);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		game.startGame();
		
		
	}

}
