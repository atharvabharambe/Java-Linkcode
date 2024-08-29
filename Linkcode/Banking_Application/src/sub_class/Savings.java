package sub_class;

import super_class.*;

public class Savings extends Account{
	private float savingROI;

	public Savings(String accNo, String accOwner, String accBalance, float savingROI) {
		super(accNo, accOwner, accBalance);
		this.savingROI = savingROI;
	}

	@Override
	public String toString() {
		return "Savings [savingROI=" + savingROI + ", toString()=" + super.toString() + "]";
	}
	
	

}
