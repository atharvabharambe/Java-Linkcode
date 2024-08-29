package Inheritance;

public class Company extends Vehicle {
	private String companyName;
	private String companyLocation;
	private String companyMob;
	private String companyRegDate;
	private String companyRegNo;
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(int no, String color, int seats, String fuel, float price, float milege, String companyName,
			String companyLocation, String companyMob, String companyRegDate, String companyRegNo) {
		super(no, color, seats, fuel, price, milege);
		this.companyName = companyName;
		this.companyLocation = companyLocation;
		this.companyMob = companyMob;
		this.companyRegDate = companyRegDate;
		this.companyRegNo = companyRegNo;
	}
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companyLocation=" + companyLocation + ", companyMob="
				+ companyMob + ", companyRegDate=" + companyRegDate + ", companyRegNo=" + companyRegNo + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
}
