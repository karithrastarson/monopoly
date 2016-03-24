package valtech.germanTeam.bo;

public class EmptySpace extends ActionSpace{

	public EmptySpace(String name, int bonus, int payment) {
		super(name, bonus, payment);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateRules(float value) {
		return value;
		
	}

}
