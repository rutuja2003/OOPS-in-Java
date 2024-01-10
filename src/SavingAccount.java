
public class SavingAccount extends Account {
	
	private float intrestRate;

	public SavingAccount(int accNumber, String accType, double accBal, String ifscCode, float intrestRate) {
		super(accNumber, accType, accBal, ifscCode);
		this.intrestRate = intrestRate;
	}

	public float getIntrestRate() {
		return intrestRate;
	}

	public void setIntrestRate(float intrestRate) {
		this.intrestRate = intrestRate;
	}
	
	

}
