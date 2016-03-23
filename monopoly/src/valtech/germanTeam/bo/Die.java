package valtech.germanTeam.bo;

public class Die {

	private int value;
	
	// generate random value
	public int generateValue(){ 
		return (int)((Math.random()*6) + 1);
	}
	
	public String toString(){
		return Integer.toString(value);
	}
}
