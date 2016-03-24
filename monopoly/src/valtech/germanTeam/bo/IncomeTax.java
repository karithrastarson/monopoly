package valtech.germanTeam.bo;

public class IncomeTax extends ActionSpace{

	private final float PERCENT_OF_PAYMENT = (float) 0.1;
	public IncomeTax(String name, int bonus, int payment) {
	super(name, bonus, payment);
	// TODO Auto-generated constructor stub
	}


	@Override
	public float calculateRules(float budget) {
	float tenPercentPayment = budget * PERCENT_OF_PAYMENT;
	budget = Math.min(tenPercentPayment, budget - this.getPayment());
	return budget;
	}

}
