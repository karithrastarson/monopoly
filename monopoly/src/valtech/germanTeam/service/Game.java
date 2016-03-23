package valtech.germanTeam.service;

import java.util.List;

import valtech.germanTeam.bo.Board;
import valtech.germanTeam.bo.Die;
import valtech.germanTeam.bo.Player;

public class Game implements IGame{
	
	private Board board;
	private Player[] playerList;
	private Die die1;
	private Die die2;
	private final int NUMBER_OF_TURNS = 20;
	
	public Game (int amountOfPlayers){
		super();
		playerList = new Player[amountOfPlayers];
		initDie();
		initBoard();
		
	}

	@Override
	public void startGame() {
		for(int i = 0; i <20; i++){
			doRound();
		}
		
		
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
		board = new Board();
		
	}
	public void initDie(){
		this.die1 = new Die();
		this.die2 = new Die();
	}

}
