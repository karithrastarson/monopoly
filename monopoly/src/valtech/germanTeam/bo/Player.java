package valtech.germanTeam.bo;

/*
 * 
 */

public class Player {
	
	Token token;
	
	int Budget;
	
	public Player(Token token) {
		this.token = token;
	}
	/*
	 * sets the token forward step by step
	 */
	public void moveToken(int numberOfSteps){
		for(int i = 0; i < numberOfSteps; i++){
			token.stepOneForward();
		}
	}

	public int getBudget() {
		return Budget;
	}

	public void setBudget(int budget) {
		Budget = budget;
	}
	
	public int throwDice(Die die){
		return die.generateValue();
	}
	
	@Override
	public String toString(){
		return token.toString();
		
	}

}
