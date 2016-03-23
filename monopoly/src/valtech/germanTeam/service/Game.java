package valtech.germanTeam.service;

import java.util.List;

import valtech.germanTeam.bo.Die;
import valtech.germanTeam.bo.Player;

public class Game implements IGame{
	
	private List<Player> playerList;
	private Die die1;
	private Die die2;
	
	public Game (){
		super();
		
	}

	@Override
	public void startGame() {
		
		
		
	}
	
	public void doTurn(){
		
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
