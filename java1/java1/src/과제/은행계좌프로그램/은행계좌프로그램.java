package 과제.은행계좌프로그램;

import java.util.Scanner;

public class 은행계좌프로그램 {
	
	// 은행계좌프로그램 [ 상속 ] 
			// 은행[super]
			// 국민은행[sub] , 신한은행[sub] , 하나은행[sub]
			// 주 기능 : 1.계좌생성 2.입금 3.출금 4.이체 5.내계좌목록 6.대출 
	public static 은행[] 계좌리스트 = new 은행[100];
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		은행컨트롤러 컨트롤 = new 은행컨트롤러();
		
		while(true) {
			
			System.out.println("1. 계좌생성 2. 입금 3. 출금 4. 이체 5. 내계좌목록 6. 대출 선택 : "); int ch = scanner.nextInt();
			
			if(ch == 1) {
				System.out.println("---------계좌생성 페이지---------");
				System.out.println("비밀번호 : "); String 비밀번호 = scanner.next();
				System.out.println("계좌주 : "); String 계좌주 = scanner.next();
				System.out.println("1. 국민은행 2. 신한은행 3. 하나은행"); int 은행번호 = scanner.nextInt();
				
				String 계좌번호 = 컨트롤.계좌생성(비밀번호, 계좌주, 은행번호);
				
				if(계좌번호 != null) {
					System.out.println("고객님의 계좌번호 : " + 계좌번호);
				}else {
					System.out.println("계좌등록 실패");
				}			
			}else if(ch == 2) {
				
				System.out.println("----입금 페이지----");
				System.out.println("계좌번호 : "); String 계좌번호 = scanner.next();
				System.out.println("입금액 : "); int 입금액 = scanner.nextInt();
				
				Boolean 입금 = 컨트롤.입금(계좌번호, 입금액);
				
				if(입금 == true) {
					System.out.println("입금완료!");
				}else {
					System.out.println("계좌번호확인..");
				}
				
			}else if(ch == 3) {
				System.out.println("-----출금 페이지----");
				System.out.println("계좌번호 : "); String 계좌번호 = scanner.next();
				System.out.println("비밀번호 : "); String 비밀번호 = scanner.next();
				System.out.println("출금액 : "); int 출금액 = scanner.nextInt();
				
				int 출금 = 컨트롤.출금(계좌번호, 비밀번호, 출금액);
				
				if(출금 == 1) {
					System.out.println("금액확인...");
				}else if(출금 == 2) {
					System.out.println("출금 성공!");
				}else if(출금 == 3) {
					System.out.println("관리자에게 문의...");
				}
				
			}else if(ch == 4) {
				System.out.println("--------이체 페이지--------");
				System.out.println("계좌번호 : "); String 계좌번호 = scanner.next();
				System.out.println("비밀번호 : "); String 비밀번호 = scanner.next();
				System.out.println("이체금액 : "); int 이체금액 = scanner.nextInt();
				System.out.println("받는계좌 : "); String 받는계좌 = scanner.next();
				
				int 이체 = 컨트롤.이체(계좌번호, 비밀번호, 이체금액, 받는계좌);
				
				if(이체 == 1) {
					System.out.println("금액확인....");
				}else if(ch == 2) {
					System.out.println("이체성공!");
				}else if(ch == 3) {
					System.out.println("관리자문의..");
				}else if(ch == 4) {
					System.out.println("관리자문의..");
				}
				
			}else if(ch == 5) {
				
				System.out.println("----계좌목록 페이지---");
				System.out.println("계좌주 : "); String 계좌주 = scanner.next();
				
				은행[] 계좌목록 = 컨트롤.계좌목록(계좌주);
				
				int i = 1;
				for(은행 temp : 계좌목록) {
					if(temp != null) {
						System.out.println(i + "번째 고객님의 " + temp.get계좌번호());
					}
					i++;
				}
				
			}else if(ch == 6) {
				System.out.println("---대출 페이지----");
			}else {
				System.out.println("알 수 없는 번호입니다.");
			}
			
			
		}
		
	}
	
}
