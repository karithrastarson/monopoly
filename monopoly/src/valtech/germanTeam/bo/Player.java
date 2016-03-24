package valtech.germanTeam.bo;

/*
 * 
 */

public class Player {
	
	private Token token;
	private float budget;
	
	public Player(TokenShape name, Space startingPosition) {
		
		token = new Token(name, startingPosition);
		this.budget = 1500;
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
	
	public float getBudget() {
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
