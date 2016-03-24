package valtech.germanTeam.bo;

public class Token {
	
	private Space currentSpace;
	private TokenShape shape;

	public Token(TokenShape shape, Space startingPosition) {
		this.shape = shape;
		this.currentSpace = startingPosition;
	}
	/*
	 * sets the Token forward by one Space
	 */
	public void stepOneForward(){
		
		this.currentSpace = currentSpace.getNextSpace();
		if(currentSpace.spaceName == "GO"){
			System.out.println("  - Player pass " + currentSpace.toString()+ "   "+ shape.toString());
		}
		System.out.println(currentSpace.toString()+ "   "+ shape.toString());
	}

	public Space getCurrentSpace() {
		return currentSpace;
	}

	public void setCurrentSpace(Space currentSpace) {
		this.currentSpace = currentSpace;
	}
	
	@Override
	public String toString(){
		return shape.toString();
	}
	
	public float updateBudget(float budget) {
		
		return currentSpace.calculateRules(budget);
	}
	public float budgetIfPassGo(float budget) {
		
		if(currentSpace.spaceName == "GO"){
			budget+= 200;
		}	
		return budget;
	}

}
