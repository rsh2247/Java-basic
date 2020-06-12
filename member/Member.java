package member;

public class Member {
	//은닉화
	private String id,pd,name;
	private int usernumber,win,usercard;
	
	void setusernumber(int usernumber) {
		this.usernumber = usernumber;
	}
	
	void setid(String id) {
		this.id = id;
	}
	
	void setpd(String pd) {
		this.pd = pd;
	}
	
	void setname(String name) {
		this.name = name;
	}
	
	public void setwin(int win) {
		this.win = win;
	}
	
	public void setusercard(int usercard) {
		this.usercard = usercard;
	}
	
	int getusernumber() {
		return this.usernumber;
	}
	
	String getid() {
		return this.id;
	}
	
	String getpd() {
		return this.pd;
	}

	String getname() {
		return this.name;
	}
	
	String tostring() {
		return "아이디: "+id+" 비밀번호: "+pd+" 이름: "+name+"RPS게임 전적:"+ win+"승";
	}
	
	public int getwin() {
		return this.win;
	}
	
	public int getusercard() {
		return this.usercard;
	}
}
