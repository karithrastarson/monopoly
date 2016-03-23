package valtech.germanTeam.service;

import valtech.germanTeam.bo.Player;

public interface IGame {

	void startGame();
	void addPlayer(Player p);
	void removePlayer(Player p);
	void initBoard();
	void initDie();

}
