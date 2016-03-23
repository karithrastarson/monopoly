package valtech.germanTeam.bo;

public class Space {
	private String spaceName;
	private Space nextSpace;
	
	
	public Space(String name){
		this.spaceName = spaceName;
		this.nextSpace = null;
	}
	
	public String toString(){
		return spaceName.toString();
	}


	public void setNextSpace(Space space) {
		// TODO Auto-generated method stub
		
	}


	public Space getNextSpace() {
		// TODO Auto-generated method stub
		return null;
	}
}
