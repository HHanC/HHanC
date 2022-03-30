package 과제.모바일뱅크계좌프로그램;

//회원 주요기능 : 1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호찾기

public class Member {

	private int mno;
	private String id;
	private String pw;
	private String name;
	private String phone;
	
	public Member() {}

	public Member(int mno, String id, String pw, String name, String phone) {
		super();
		this.mno = mno;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	}	
	
	boolean 회원가입() {
		System.out.println("--------------회원가입 페이지---------------");
		System.out.print("아이디 : "); String id = Main.scanner.next();
		System.out.print("비밀번호 : "); String pw = Main.scanner.next();
		System.out.print("이름 : "); String name = Main.scanner.next();
		System.out.print("전호번호 : "); String phone = Main.scanner.next();
		
		for(Member temp : Main.members) {
			if(temp != null && temp.id.equals(id)) {
				return false;
			}
		}
		int bno = 0;
		int j = 0;
		for(Member temp : Main.members) {
			if(temp == null) {
				if(j == 0) {
					bno = 1;
					break;
				}else {
					bno = Main.members[j-1].mno+1;
					break;
				}
			}
			j++;
		}		
		int i = 0;
		Member member = new Member(bno, id, pw, name, phone);
		for(Member temp : Main.members) {
			if(temp == null) {
				Main.members[i] = member;
				return true;
			}
			i++;
		}		
		return false;
	}
	String 로그인() {
		System.out.println("-----------------로그인 페이지-------------------");
		System.out.print("아이디 : "); String id = Main.scanner.next();
		System.out.print("비밀번호 : "); String pw = Main.scanner.next();
		
		for(Member temp : Main.members) {
			if(temp != null && temp.id.equals(id) && temp.pw.equals(pw)) {
				return temp.id;
			}
		}		
		return null;
	}
	void 아이디찾기() {
		System.out.println("-------------------아이디 찾기 페이지------------------");
		System.out.print("이름 : "); String name = Main.scanner.next();
		System.out.print("전화번호 : "); String phone = Main.scanner.next();
		
		for(Member temp : Main.members) {
			if(temp != null && temp.name.equals(name) && temp.phone.equals(phone)) {
				System.out.println("회원님의 아이디 : " + temp.id);
				return;
			}			
		}
		System.err.println("동일한 회원 정보가 없습니다.");
	}
	void 비밀번호찾기() {
		System.out.println("------------------비밀번호 찾기 페이지----------------------");
		System.out.print("아이디 : "); String id = Main.scanner.next();
		System.out.print("전화번호 : "); String phone = Main.scanner.next();
		
		for(Member temp : Main.members) {
			if(temp != null && temp.id.equals(id) && temp.phone.equals(phone)) {
				System.out.println("회원님의 비밀번호 : " + temp.pw);
				return;
			}
		}
		System.err.println("동일한 회원 정보가 없습니다.");		
	}
}

















