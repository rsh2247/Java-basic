package item;

public class Item {
	private String name;
	private int price;
	
	void setname() {
		this.name = name;
	}
	void setprice() {
		this.price = price;
	}
	public String getname() {
		return this.name;
	}
	public int getprice() {
		return this.price;
	}
	public String tostring() {
		return "[상품명 : "+name+" 가격 : "+price+" ]";
	}
	

}
