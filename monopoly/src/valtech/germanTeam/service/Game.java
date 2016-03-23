package valtech.germanTeam.service;

import java.util.List;

import valtech.germanTeam.bo.Board;
import valtech.germanTeam.bo.Die;
import valtech.germanTeam.bo.Player;
import valtech.germanTeam.bo.TokenShape;

public class Game implements IGame{
	
	private Board board;
	private Player[] playerList;
	private Die die1;
	private Die die2;
	private final int NUMBER_OF_TURNS = 20;
	
	public Game (int amountOfPlayers){
		super();
		
			initBoard();
			initPlayers(amountOfPlayers);
			initDie();
				
			
	}

	public void initPlayers(int amountOfPlayers){
		
		if(2  < amountOfPlayers && amountOfPlayers > 9){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		playerList = new Player[amountOfPlayers];
		
		for(int i = 0; i < amountOfPlayers; i++){
			Player p = new Player(TokenShape.values()[i + 1], board.getStartSpace() );
		
			addPlayer(p, i);
		}
		
	}
	
	@Override
	public void startGame() {
		for(int i = 0; i <20; i++){
			doRound();
			System.out.println(i);
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
		System.out.println("Player " + p.getToken().toString() + " get throw count "  + throwCount);
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
