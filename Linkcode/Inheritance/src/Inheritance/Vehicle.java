package Inheritance;

public class Vehicle {
	private int no;
	private String color;
	private int seats;
	private String fuel;
	private float price;
	private float milege;
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int no, String color, int seats, String fuel, float price, float milege) {
		super();
		this.no = no;
		this.color = color;
		this.seats = seats;
		this.fuel = fuel;
		this.price = price;
		this.milege = milege;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getMilege() {
		return milege;
	}

	public void setMilege(float milege) {
		this.milege = milege;
	}

	@Override
	public String toString() {
		return "Vehicle [no=" + no + ", color=" + color + ", seats=" + seats + ", fuel=" + fuel + ", price=" + price
				+ ", milege=" + milege + "]";
	}
	
	
	
	
	
}
