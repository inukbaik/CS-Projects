package Assignment_6;

public class Clients extends Users{
	int fee;
	public Clients(String name, int id, String campus, String email) {
		super(name, id, campus, email);
		fee = 0;
	}
	public void addFee(int fee) {
		this.fee = fee;
	}
	public int getFee() {
		return this.fee;
	}
	
}
