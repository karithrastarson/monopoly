package valtech.germanTeam.service;

import java.util.List;

import valtech.germanTeam.bo.Die;
import valtech.germanTeam.bo.Player;

public class Game implements IGame{
	
	private Player[] playerList;
	private Die die1;
	private Die die2;
	
	public Game (int amountOfPlayers){
		super();
		initDie();
		initBoard();
		
	}

	@Override
	public void startGame() {
		
		
		
	}
	/*
	 * do a round in the game including all players
	 */
	@Override 
	public void doRound(){
		for(Player p :playerList){
			doTurn(p);
		}
	}
	
	/*
	 * do one turn for one player
	 */
	public void doTurn(Player p){
		int throwCount = p.throwDice(die1, die2);
		p.moveToken(throwCount);
	}
	
	/*
	 * add a Player to the game
	 */
	@Override
	public void addPlayer(Player p, int position) {
		this.playerList[position] = p;
		 
	}

	/*
	 * remove a player from the game
	 */
	@Override
	public void removePlayer(int position) {
		this.playerList[position] = null;
		
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
