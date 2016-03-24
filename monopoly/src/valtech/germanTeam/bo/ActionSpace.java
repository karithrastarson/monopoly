package valtech.germanTeam.bo;

public class ActionSpace extends Space{

	private int bonus;
	private int payment;
	
	public ActionSpace(String name, int bonus, int payment) {
		super(name);
		
		this.bonus = bonus;
		this.payment = payment;
		// TODO Auto-generated constructor stub
	}
	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	
}
