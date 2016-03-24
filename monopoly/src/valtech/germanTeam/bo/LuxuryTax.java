package valtech.germanTeam.bo;

public class LuxuryTax extends ActionSpace {


public LuxuryTax(String name, int bonus, int payment) {
super(name, bonus, payment);
// TODO Auto-generated constructor stub
}



@Override
public float calculateRules(float budget) {
budget-= this.getPayment(); 
return budget;
}


}
