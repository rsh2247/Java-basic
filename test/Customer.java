package test;

public class Customer {
	
	private String name;
	private int phone,tv,computer;
	
	public void setname(String name) {
		this.name = name;
	}
	public void setphone(int phone) {
		this.phone = phone;
	}
	public void settv(int tv) {
		this.tv = tv;
	}
	public void setcomputer(int computer) {
		this.computer = computer;
	}
	int getsum() {
		return  phone+tv+computer;
	}
	String getname() {
		return this.name;
	}
	

}
