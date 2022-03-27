package 과제.회원제프로그램;

import java.util.Scanner;

public class 회원제프로그램 {

	// 회원제 프로그램 [ 클래스 버전 ] 
	
			// 0. 회원 설계 => 회원 클래스 만들기 
				// 1. 필드 
					// 1. 아이디 2.비밀번호 3.이름 4.전화번호
			// 1. 초기메뉴 [ 1. 회원가입 2. 로그인 3.아이디찾기 , 4.비밀번호찾기 ]
				// 1. 회원가입시 입력받아 저장 
				// 2. 로그인시 아이디와 비밀번호가 동일하면 로그인처리 
				// 3. 아이디찾기는 이름과 전화번호가 동일하면 아이디 출력 
				// 4. 비밀번호찾기는 아이디와 전화번호가 동일하면 비밀번호 출력 

	public static void main(String[] args) { // main 중괄호 안에 코드를 입력해야 실행이 된다.
		Scanner scanner = new Scanner(System.in); // 입력 받을 때 쓰는 객체는 스캐너 객체이다.
		Member[] memberlist = new Member[100]; // 멤머 객체의 배열을 만든다.
		
		while(true) { // 반복문을 사용해 준다.
			
			System.out.println("1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호찾기");
			System.out.print("선택 : "); int ch = scanner.nextInt(); // 스캐너 객체의 정수형 변수를 ch로 만들어 준다.
			
			if(ch == 1) {
				
				System.out.println("------------회원가입 페이지------------");
				System.out.print("id : "); String id = scanner.next(); // 스캐너 객체의 문자열 변수를 id로 만들어 준다.
				System.out.print("pw : "); String pw = scanner.next(); // 스캐너 객체의 문자열 변수를 pw로 만들어 준다.
				System.out.print("name : "); String name = scanner.next(); // 스캐너 객체의 문자열 변수를 name로 만들어 준다.
				System.out.print("phone : "); String phone = scanner.next(); // 스캐너 객체의 문자열 변수를 phone로 만들어 준다.
				
				Member member = new Member(); // member객체 생성
			// 클래스명	객체명	메모리할당	생성자
				
				member.id = id; // 접근제한자를 통해서 입력값을 받은 id를 필드의 id에 저장
				member.pw = pw; // 접근제한자를 통해서 입력값을 받은 pw를 필드의 pw에 저장
				member.name = name; // 접근제한자를 통해서 입력값을 받은 name를 필드의 name에 저장
				member.phone = phone; // 접근제한자를 통해서 입력값을 받은 phone를 필드의 phone에 저장
				
				boolean 통과 = false; // boolean의 변수 통과를 초기값 false; 로 설정
				for(Member temp : memberlist) { // for반복문을 통해서 멤머클래스 호출하고 temp에 임시저장, memberlist배열이 temp에 들어감
					if(temp != null && temp.id.equals(id)) { // temp의 값이 null이 아니고 필드에 저장된 id랑 사용자가 입력한 id가 같다면
						System.err.println("중복된 id 입니다. [다시 입력]"); // 중복된 id입니다. 출력
						통과 = true; // 여기서 true는 조건이 참이여서 true로 설정
					}
				}
				if(!통과) { // !를 사용하여 true가 아니면을 괄오에 넣어줌
					int i = 0; // 정수형 변수 i에 0값을 넣어줌
					for(Member temp : memberlist) { // for반복문을 통해서 멤머클래스 호출하고 temp에 임시저장, memberlist배열이 temp에 들어감
						if(temp == null) { // temp의 임시저장공간 안에 배열의 공간이 null과 같다면
							memberlist[i] = member; // 배열의 i인덱스 안에 member객체를 저장
							System.out.println("회원가입 성공"); // 회원가입 성공 출력
							break; // 회원가입을 성공하면 break를 통해서 반복문 탈출
						}
					}
				}				
			}else if(ch == 2) {
				
				System.out.println("------------로그인 페이지-------------");
				System.out.print("id : "); String id = scanner.next(); // 스캐너 객체의 문자열 변수를 id로 만들어 준다.
				System.out.print("pw : "); String pw = scanner.next(); // 스캐너 객체의 문자열 변수를 pw로 만들어 준다.
				
				boolean 통과 = false; // boolean의 변수 통과를 초기값 false; 로 설정
				for(Member temp : memberlist) { // for반복문을 통해서 멤머클래스 호출하고 temp에 임시저장, memberlist배열이 temp에 들어감
					if(temp != null && temp.id.equals(id) && temp.pw.equals(pw)) { // temp의 값이 null이 아니고 필드에 저장된 id값과 사용자가 입력한 id값이 같고 필드에 저장된 pw값과 사용자가 입력한 pw가 같다면
						System.out.println("로그인 성공"); // 로그인 성공 출력
						통과 = true; // 조건이 맞다면 true 
					}					
				}
				if(!통과) { // true가 아니면
					System.err.println("로그인 실패"); // 로그인 실패
				}				
			}else if(ch == 3) {
				
				System.out.println("------------아이디 찾기 페이지------------");
				System.out.print("name : "); String name = scanner.next(); // 스캐너 객체의 문자열 변수를 name로 만들어 준다.
				System.out.print("phone : "); String phone = scanner.next(); // 스캐너 객체의 문자열 변수를 phone로 만들어 준다.
				
				boolean 통과 = false; // boolean의 변수 통과를 초기값 false; 로 설정
				for(Member temp : memberlist) { // for반복문을 통해서 멤머클래스 호출하고 temp에 임시저장, memberlist배열이 temp에 들어감
					if(temp != null && temp.name.equals(name) && temp.phone.equals(phone)) { // temp의 값이 null이 아니고 필드에 저장된 name값과 사용자가 입력한 name값이 같고 필드에 저장된 phone값과 사용자가 입력한 phone가 같다면
						System.out.println("id를 찾았습니다. id : " + temp.id); // 필드에 저장된 id값 출력
						통과 = true; // true
					}
				}
				if(!통과) { // true가 아니면
					System.err.println("이름과 전화번호를 다시 확인해 주세요"); // 이름과 전화번호를 다시 확인해 주세요 출력
				}				
			}else if(ch == 4) {
				System.out.println("--------------비밀번호 찾기--------------");
				System.out.print("id : "); String id = scanner.next(); // 스캐너 객체의 문자열 변수를 id로 만들어 준다.
				System.out.print("phone : "); String phone = scanner.next(); // 스캐너 객체의 문자열 변수를 phone로 만들어 준다.
				
				boolean 통과 = false; // boolean의 변수 통과를 초기값 false; 로 설정
				for(Member temp : memberlist) {  // for반복문을 통해서 멤머클래스 호출하고 temp에 임시저장, memberlist배열이 temp에 들어감
					if(temp != null && temp.id.equals(id) && temp.phone.equals(phone)) {  // temp의 값이 null이 아니고 필드에 저장된 id값과 사용자가 입력한 id값이 같고 필드에 저장된 phone값과 사용자가 입력한 phone가 같다면
						System.out.println("비밀번호를 찾았습니다. pw : " + temp.pw); // pw 출력
						통과 = true;
					}										
				}
				if(!통과) { // true가 아니면
					System.err.println("이름과 전화번호를 다시 확인해 주세요."); // 이름과 전화번호를 다시 확인해 주세요 출력
				}
				
			}else { // 1~4번 외에 다른 번호를 입력했을 시
				System.out.println("알 수 없는 번호입니다."); //알 수 없는 번호입니다. 출력
			}						
		}		
	}	
}
