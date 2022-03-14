package Day08.bank;

import java.util.Scanner;

public class Count {
	
	static Scanner scanner = new Scanner(System.in);
	static Count [] banker = new Count[2000];
	
	// 1. 필드
	String id;
	String pw;
	String name;
	int money;
	// 2. 생성자
	public Count() {
		
	}
	
	public Count(String id, String pw, String name, int money) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.money = money;
	}
	
	// 3. 메소드
	public boolean 계좌개설() {
		// 1. 계좌만들러 왔음
		// 2. 핸드폰(비대면)
		// 3. 아이디 계좌 비밀번호 종류를 받는다.
		// 4. 직원이 만듦
		// 5. 중복체크
		// 6. 결과출력
		System.out.println(" your id : ");
		String id = scanner.next();
		System.out.println(" your pw : ");
		String pw = scanner.next();
		System.out.println(" your accounttype : ");
		String name = scanner.next();
		
		Count bankers = new Count(id, pw, name, money);
		
		for(Count temp : banker) {
			if(temp != null && temp.id.equals(id)) {
				System.out.println("알림  : 현재 사용중인 아이디가 있습니다.");
				return false;
			}
		}
		int i = 0;
		for(Count temp : banker) {
			if(temp == null) {
				banker[i] = bankers;
				System.out.println("계좌개설이 완료되었습니다.");
				return true;
			}
			i++;
		}
		return false;
	}
	public void 입금() {
		// 1. 입금하겠다는 버튼 선택
		// 2. 금액을 받는다.
		// 3. 계좌가 있는지 확인한다.
		// 4. 없으면 종료, 있으면 입금완료
		// 5. 계좌번호를 배열에 넣는다.
		// 6. 출금을 한다
		// 7. 출금한 금액이 계좌에 들어있는 금액보다 적다면 오류발생
		
		
		System.out.println("금액을 입력해주세요. 금액 :");
		int money = scanner.nextInt();
		int i = 0;
		for(Count temp : banker) {
			if(temp != null) {
				banker[i].money = money;				
				System.out.println("입금이 완료되었습니다.");
				break;
			}else {
				System.out.println("계좌번호를 다시 확인해주세요.");
				
			}
			i++;
		}					
	}
	// 1. 출금하겠다는 버튼선택
			// 2. 출금할 금액을 입력한다.
			// 3. 비밀번호를 입력한다.
			// 4. 비밀번호 같은지 확인한다.
			// 5. 만약에 계좌에 있는 금액보다 더 많은 금액을 입력할경우 오류
			// 6. 적으면 출금
			// 7. 출금하였습니다. 출력
	public void 출금() {
		System.out.println(" 출금할 금액 : ");
		int 금액 = scanner.nextInt();
		int i = 0;
		System.out.println(" 계좌의 비밀번호를 입력해 주세요 :");
		String 비번 = scanner.next();
		for(Count temp : banker) {
			if(temp != null && temp.pw.equals(비번) ) {
//				banker[i].money = money;
				System.out.println(" 접속 ");
			}else {
				System.out.println(" 비밀번호를 다시 입력해 주세요.");
				break;
			}
		}
	}
	

	// 1. 이체 버튼을 클릭한다.
	// 2. 상대방 계좌번호를 입력한다.
	// 3. 비밀번호를 입력한다.
	// 4. 비밀번호가 맞으면 이체 성공 틀리면 재입력
	// 5. 이체가 완료되었습니다.
	public void 이체() {
		System.out.println(" 계좌번호 입력 : ");
		int 계좌번호 = scanner.nextInt();
		int i = 0;
		System.out.println(" 비밀번호 : ");
		int 비번 = scanner.nextInt();
		for(Count temp : banker) {
			if(temp != null && temp.pw.equals(pw)) {
				banker[i].money = money;
				System.out.println(" 이체를 완료했습니다.");
			}else {
				System.out.println(" 비밀번호를 다시 입력해주세요");
				break;
			}
		}		
	}
	// 1. 금액을 입력한다.
	// 2. 대출을 클릭한다.
	// 3. 신용등급이 2등급 이상이면 통과 2등급 미만이면 불가
	
	public void 대출() {
		System.out.println(" 금액 : ");
		int 금액 = scanner.nextInt();
		int 신용등급 = 0;
		while(true) {
			if(신용등급 >= 2) {
				System.out.println("대출 완료");
			}else {
				System.out.println("신용등급이 2등급 미만이여서 대출이 불가합니다.");
				break;
			}
		}
	}
	// 1. 내계좌목록을 클릭한다.
	// 2. 계좌가 몇 개 있는지 확인한다.
	public void 내계좌목록() {
		System.out.print(" 1. 국민계좌 2. 우리계좌 3. ibk계좌 4. 신한계좌 선택 : ");
		int 선택 = scanner.nextInt();
	}
}
