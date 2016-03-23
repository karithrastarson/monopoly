package valtech.germanTeam.gui;

import valtech.germanTeam.service.Game;
import valtech.germanTeam.service.IGame;

public class Window {

	public static int amountOfPlayers;
	
	public static void main(String[] args) {
		//This main method is in charge of running the game
		IGame game = new Game(amountOfPlayers);
		
		
	}

}
