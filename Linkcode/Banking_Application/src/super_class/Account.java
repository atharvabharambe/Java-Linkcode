package super_class;

public class Account {
	private String accNo;
	private	String accOwner;
	private String accBalance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String accNo, String accOwner, String accBalance) {
		super();
		this.accNo = accNo;
		this.accOwner = accOwner;
		this.accBalance = accBalance;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getAccOwner() {
		return accOwner;
	}

	public void setAccOwner(String accOwner) {
		this.accOwner = accOwner;
	}

	public String getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(String accBalance) {
		this.accBalance = accBalance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accOwner=" + accOwner + ", accBalance=" + accBalance + "]";
	}
	
	
	
	
	
}
