package valtech.germanTeam.bo;

public class OwnedSpace extends Space {
	
	private Player owner;
	private int rent;
	private int price;
	
	public OwnedSpace(String name, int price, int rent) {
		super(name);
		this.price = price;
		this.rent = rent;
		// TODO Auto-generated constructor stub
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	@Override
	public void calculateRules(int value) {
		// TODO Auto-generated method stub
		
	}
}
