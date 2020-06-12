package member;

import java.util.Scanner;

public class MemberServiceImpl implements MemberService{
	Scanner scanner = new Scanner(System.in);
	private int capacity;
	private Member[] membergroup;
	int nowmember;
	
	public MemberServiceImpl() { //클래스변수가 아닌 인스턴스변수로만 작동하게끔 만듬.
		capacity = 0;
		membergroup = new Member[capacity+1];
	}

	@Override
	public void signup() {	
		Member newmember = new Member();
		System.out.println("이름, 아이디, 비밀번호 입력");
		newmember.setname(scanner.next());
		newmember.setid(scanner.next());
		newmember.setpd(scanner.next());
		membergroup[capacity] = newmember;
		newmember.setusernumber(capacity);
		System.out.println("회원정보");
		capacity ++;
		Member temp[] = new Member[capacity+1];
		for(int i=0;i<temp.length-1;i++) {
			temp[i] = membergroup[i];
		}
		membergroup = temp;
		System.out.println(capacity+"번째 회원정보 : "+membergroup[capacity-1].tostring());		
	}

	@Override
	public int login() {
		System.out.println("아이디와 비밀번호를 입력해주세요");
		while(true) {
			String id = scanner.next();
			String pd = scanner.next();
			for(int i=0;i<membergroup.length-1;i++) {
				if(id.equals(membergroup[i].getid()) && pd.equals(membergroup[i].getpd())) {
					System.out.println(membergroup[i].getname()+"님 환영합니다.");
					nowmember = i;
					return i;
				}else {
					System.out.println("아이디 혹은 비밀번호가 잘못되었습니다.");
				}
			}		
		}
	}

	@Override
	public void memberlist() {
		for(int i=0; i<membergroup.length-1;i++) {
			System.out.println((i+1)+"번째 회원님 "+membergroup[i].getname());		
		}
	}

	@Override
	public int memberpage() {
		System.out.println("멤버페이지");
		while(true) {
			System.out.println("메뉴 0:돌아가기 1:개인정보확인 2:비밀번호 변경");
			int a = scanner.nextInt();
			switch(a) {
			case 0 : return 1;
			case 1 : System.out.println(membergroup[nowmember].tostring());break;
			case 2 : System.out.println("비밀번호를 입력해주세요.");pdchange();	break;
			default : break;
			}
			return 1;		
		}
		
	}

	@Override
	public void pdchange() {
		int a = 1;
		while(a==1) {
			String pd = scanner.next();
			if(pd.equals(membergroup[nowmember].getpd())) {
				System.out.println("새로운 비밀번호를 입력해주세요.");
				membergroup[nowmember].setpd(scanner.next());
				a=0;
				System.out.println("비밀번호가 변경되었습니다.");
			}else {
				System.out.println("다시 입력해주세요.");
			}		
		}
	}
	
}
