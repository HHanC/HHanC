package Day08.bank;

import java.util.Scanner;

public class Count {
	Scanner scanner = new Scanner(System.in);
	// 1. 필드
	String 계좌개설;
	int 입금;
	int 출금;
	int 이체;
	int 대출;
	String 계좌목록;
	String 이름;
	int 비밀번호;

	// 2. 생성자
	public Count() {}
	
	public Count(String 계좌개설, int 입금, int 출금, int 이체, int 대출, String 계좌목록, String 이름, int 비밀번호) {
		this.계좌개설 = 계좌개설; // ?
		this.입금 = 입금;
		this.출금 = 출금;
		this.이체 = 이체;
		this.대출 = 대출;
		this.계좌목록 = 계좌목록;
		this.이름 = 이름;
		this.비밀번호 = 비밀번호;
	}
	
	// 3. 메소드
	boolean 회원메뉴() {
		System.out.println("-------회원 메뉴-------");
		System.out.println("1.계좌개설 2.입금 3.출금 4.이체 5.대출 6.계좌목록 선택 : ");
		int ch = scanner.nextInt();
		String name = scanner.next();
		if(ch == 1) {
			 for(View temp : View.counts) {
				 if(temp == null && temp.이름.equals(이름)) {
					 System.out.println("계좌를 개설하였습니다.");
				 }else {
					 System.out.println("이름을 다시 한 번 확인해주세요");
					 
				 }
			 }			 
		}
		else if(ch == 2) {
			 for(Count temp : Count.counts) {
				 if(temp == null && temp.비밀번호 == 비밀번호) {
					 System.out.println("금액을 넣어주세요. 액수 : ");
					 int 금액 = scanner.nextInt();
				 }else {
					 
					 
				 }
			 }
		}
		else if(ch == 3) {}
		else if(ch == 4) {}
		else if(ch == 5) {}
		else if(ch == 6) {}
		else {}
		return true;
		
	}
	
}
