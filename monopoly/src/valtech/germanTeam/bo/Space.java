package valtech.germanTeam.bo;

public class Space {
	protected String spaceName;
	protected Space nextSpace;
	protected int position;
	
	public Space(String name){
		this.spaceName = name;
		this.nextSpace = null;
	}
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	public String toString(){
		return spaceName.toString();
	}


	public void setNextSpace(Space space) {
		this.nextSpace = space;
	}


	public Space getNextSpace() {
		
		return nextSpace;
	}
}
