package test2;

public class Player {
	private String name;
	private float record;
	
	public void setname(String name) {
		this.name = name;
	}
	public void setrecord(float record) {
		this.record = record;
	}
	public float getrecord() {
		return this.record;
	}
	public String getname() {
		return this.name;
	}
	
	void show() {
		System.out.println("이름: "+name);
		System.out.println("기록: "+record+"초");
	}
}
