package valtech.germanTeam.service;

import java.util.List;

import valtech.germanTeam.bo.Die;
import valtech.germanTeam.bo.Player;

public class Game implements IGame{
	
	List<Player> playerList;
	
	Die die1;
	
	Die die2;
	
	public Game (){
		super();
	}

	@Override
	public void startGame() {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * add a Player to the game
	 */
	@Override
	public void addPlayer(Player p) {
		this.playerList.add(p);
		 
	}

	/*
	 * remove a player from the game
	 */
	@Override
	public void removePlayer(Player p) {
		this.playerList.remove(p);
		
	}

	@Override
	public void initBoard() {
		// TODO Auto-generated method stub
		
	}
	public void initDie(){
		this.die1 = new Die();
		this.die2 = new Die();
	}

}
