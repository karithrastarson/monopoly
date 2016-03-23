package valtech.germanTeam.service;

import valtech.germanTeam.bo.Player;

public interface IGame {

	void startGame();
	void initBoard();
	void initDie();
	void addPlayer(Player p, int position);
	void removePlayer(int position);
	void doRound();

}
