package valtech.germanTeam.bo;

public class Token {
	
	private Space currentSpace;
	private TokenShape shape;

	public Token(TokenShape shape) {
		this.shape = shape;
	}
	/*
	 * sets the Token forward by one Space
	 */
	public void stepOneForward(){
		this.currentSpace = currentSpace.getNextSpace();
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
