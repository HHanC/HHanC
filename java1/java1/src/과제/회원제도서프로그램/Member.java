package 과제.회원제도서프로그램;

public class Member { // c s
	
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
	boolean 회원가입() { // boolean 타입의 메소드 // 회원가입 s
		System.out.println("--------회원가입 페이지---------");
		System.out.println("아이디 : "); String id = 회원제도서프로그램.scanner.next(); // main클래스의 scanner객체 사용
		System.out.println("비밀번호 : "); String pw = 회원제도서프로그램.scanner.next(); // main클래스의 scanner객체 사용
		System.out.println("이름 : "); String name = 회원제도서프로그램.scanner.next(); // main클래스의 scanner객체 사용
		System.out.println("연락처 : "); String phone = 회원제도서프로그램.scanner.next(); // main클래스의 scanner객체 사용
		
		for(Member temp : 회원제도서프로그램.members) { // main클래스의 members배열을 Member temp에 담음
			if(temp != null && temp.id.equals(id)) { // temp가 null이 아니고 temp의 id와 사용자가 입력한 id가 같다면
				System.out.println("현재 사용중인 아이디 입니다."); // 중복된 아이디 출력
				return false; // false를 반환하여 가입실패
			}
		}
		int bno = 0; // 회원번호를 저장하는 변수
		int j = 0; // 인덱스
		for(Member temp : 회원제도서프로그램.members) { // for s // main클래스의 members 배열을 Member temp 에 담는다.
			if(temp == null) { // temp에 담긴 members배열의 데이터가 null 이라면
				if(j == 0) { // if e // 첫번째 인덱스[0번 인덱스]가 null이라면 
					bno = 1; // 첫 회원 번호 는 1
					break;
				}else {
					bno = 회원제도서프로그램.members[j-1].mno +1; // null 앞 [마지막회원] 번호에 +1 // 절대 까먹지 말자
						// 전 members 인덱스의 회원번호를 호출해서 + 1
					break;
				}				
			} // if e
			j++;
		} // for e
		Member member = new Member(bno, id, pw, name, phone); // 생성자 호출하여 member변수에 담는다.
		int i = 0;
		for(Member temp : 회원제도서프로그램.members) { // for s // Member temp에 main의 members배열을 담는다
			if(temp == null) { // temp 가 null이라면
				회원제도서프로그램.members[i] = member; // member변수를 members[i]의 인덱스 번호에 담는다.
				System.out.println("회원님의 회원번호 : " + bno); // 회원 번호
				return true; // 리턴 true
			}
			i++;
		} // for e		
		return false; // false반환
	} // 회원가입 e
	String 로그인() { // String s
		System.out.println("----------로그인 페이지----------");
		System.out.println("아이디 : "); String id = 회원제도서프로그램.scanner.next();
		System.out.println("비밀번호 : "); String pw = 회원제도서프로그램.scanner.next();
		for(Member temp : 회원제도서프로그램.members) { // for s
			if(temp != null && temp.id.equals(id) && temp.password.equals(pw)) { // temp가 null이 아니고 temp저장된 id와 사용자가 입력 id가 같다면
				return temp.id; // 성공한 id 반환
			}
		} // for e		
		return null;		
	} // String e
	void 아이디찾기() { // void s
		System.out.println("---------아이디찾기 페이지----------");
		System.out.println("이름 : "); String name = 회원제도서프로그램.scanner.next();
		System.out.println("연락처 : "); String phone = 회원제도서프로그램.scanner.next();
 		
		for(Member temp : 회원제도서프로그램)
		
	} // void e
} // c e

















