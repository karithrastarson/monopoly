package valtech.germanTeam.service;



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
	
	private static Game instance = null;
	
	private Game(){
		super();
	}
	
	public static Game getInstance(){
		if(instance == null) {
	         instance = new Game();
	      }
		return instance;
	}
	
	@Override
	public void initGame(short numberOfPlayers){
		instance.initBoard();
		instance.initDie();
		instance.initPlayers(numberOfPlayers);
	}
	
	public void initPlayers(short amountOfPlayers){
		
		/*if(2  < amountOfPlayers && amountOfPlayers > 9){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} */
		playerList = new Player[amountOfPlayers];
		
		for(short i = 0; i < amountOfPlayers; i++){
			Player p = new Player(TokenShape.values()[i + 1], board.getStartSpace() );
		
			addPlayer(p, i);
		}
		
	}
	
	@Override
	public void startGame() {
		for(int i = 0; i < NUMBER_OF_TURNS; i++){
			doRound();
			System.out.println(i);
		}
		
		
	}
	/*
	 * do a round in the game including all players
	 */
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
		System.out.println("Player " + p.getToken().toString() + " get throw count "  + throwCount + " Current budget: " + p.getBudget());
		p.moveToken(throwCount);
	}
	
	/*
	 * add a Player to the game
	 */
	public void addPlayer(Player p, int position) {
		this.playerList[position] = p;
		 
	}

	/*
	 * remove a player from the game
	 */
	public void removePlayer(int position) {
		this.playerList[position] = null;
		
	}

	public void initBoard() {
		board = new Board();
		
	}
	public void initDie(){
		this.die1 = new Die();
		this.die2 = new Die();
	}
	
	public int getPlayerCount(){
		return playerList.length;
	}
	
	public Player[] getPlayers(){
		return playerList;
	}
	
	public Die[] getDie(){
		Die[] dies = {die1, die2};
		return dies;
	}
	
	public Board getBoard(){
		return board;
	}

}
