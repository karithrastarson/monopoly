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
