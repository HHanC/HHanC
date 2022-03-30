package 과제.회원제도서프로그램;

public class Member { // c s
	
	// 2. member
	// 필드 : 번호,아이디,비밀번호,이름,연락처
	// 메소드 : 1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
	
	// 1. 필드
	int mno; // 회원번호
	String id; // 아이디
	String password; // 비밀번호
	String name; // 이름
	String phone; // 연락처
	
	// 2. 생성자
	public Member() {} // 깡통

	public Member(int mno, String id, String password, String name, String phone) { // 생성자
		this.mno = mno;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}			
	// 3. 메소드
	
	boolean 회원가입() {
		while(true) {
			
			System.out.println("아이디 : "); String id = 회원제도서프로그램.scanner.next();
			System.out.println("비밀번호 : "); String pw = 회원제도서프로그램.scanner.next();
			System.out.println("이름 : "); String name = 회원제도서프로그램.scanner.next();
			System.out.println("전화번호 : "); String phone = 회원제도서프로그램.scanner.next();
			
			for(Member temp : 회원제도서프로그램.member) {
				if(temp != null && temp.id.equals(id)) {
					return false;
				}
			}
			
			int bno = 0;
			int j = 0;
			for(Member temp : 회원제도서프로그램.member) {
				if(temp == null) {
					if(j == 0) {
						bno = 1;
						break;
					}else {
						bno = 회원제도서프로그램.member[j-1].mno+1;
					}
				}
				j++;
			}
			
			int i = 0;
			Member member = new Member();
			for(Member temp : 회원제도서프로그램.member) {
				if(temp == null) {
					회원제도서프로그램.member[i] = member;
					return true;
				}
				i++;
			}			
		}		
	}
	String 로그인() {
		while(true) {
			System.out.println("아이디 : "); String id = 회원제도서프로그램.scanner.next();
			System.out.println("비밀번호 : "); String pw = 회원제도서프로그램.scanner.next();
			
			for(Member temp : 회원제도서프로그램.member) {
				if(temp != null && temp.id.equals(id) && temp.password.equals(pw)) {
					return temp.id;
				}
			}
		}				
	}
	void 아이디찾기() {
		while(true) {
			System.out.println("이름 : "); String name = 회원제도서프로그램.scanner.next();
			System.out.println("전화번호 : "); String phone = 회원제도서프로그램.scanner.next();
			
			for(Member temp : 회원제도서프로그램.member) {
				if(temp != null && temp.name.equals(name) && temp.phone.equals(phone)) {
					System.out.println("회원님의 아이디 : " + temp.id);
					return;
				}
			}
			System.out.println("알 수 없는 회원 정보 입니다.");
		}		
	}
	void 비밀번호찾기() {
		while(true) {
			System.out.println("아이디 : "); String id = 회원제도서프로그램.scanner.next();
			System.out.println("전화번호 : "); String phone = 회원제도서프로그램.scanner.next();
			
			for(Member temp : 회원제도서프로그램.member) {
				if(temp != null && temp.id.equals(id) && temp.phone.equals(phone)) {
					System.out.println("회원님의 아이디 : " + temp.password);
					return;
				}
			}
			System.out.println("알 수 없는 회원 정보 입니다.");
		}			
	}
	
} // c e

















