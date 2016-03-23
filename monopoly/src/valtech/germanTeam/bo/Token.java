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

}
