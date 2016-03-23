package valtech.germanTeam.bo;

public class Space {
	private String spaceName;
	private Space nextSpace;
	
	
	public Space(String name){
		this.spaceName = name;
		this.nextSpace = null;
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
