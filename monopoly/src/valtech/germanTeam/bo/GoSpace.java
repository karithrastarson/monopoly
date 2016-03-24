package valtech.germanTeam.bo;

public class GoSpace extends ActionSpace{

	public GoSpace(String name, int bonus, int payment) {
		super(name, bonus, payment);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateRules(float value) {
		//When a player lands on the GO space it gets 400 euros
		
		return value + 400;
		
	}

}
