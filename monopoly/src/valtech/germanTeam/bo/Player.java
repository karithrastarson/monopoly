package valtech.germanTeam.bo;

/*
 * 
 */

public class Player {
	
	private Token token;
	private int budget;
	
	public Player(TokenShape name, Space startingPosition) {
		
		token = new Token(name, startingPosition);
	}
	/*
	 * sets the token forward step by step
	 */
	public void moveToken(int numberOfSteps){
		for(int i = 0; i < numberOfSteps; i++){
			token.stepOneForward();
		}
	}
	
	public Token getToken(){
		return token;
	}
	
	
	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}
	
	public int throwDice(Die dice1, Die dice2){
		return dice1.generateValue() + dice2.generateValue();
	}
	
	@Override
	public String toString(){
		return token.toString();
		
	}

}
