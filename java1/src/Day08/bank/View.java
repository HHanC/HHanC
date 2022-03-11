package Day08.bank;

import java.util.Scanner;

public class View { // c s
	
	static Scanner scanner = new Scanner(System.in);
	static Count[] counts = new Count[1000];
	
	public static void main(String[] args) { // m s
		
		View BankOpened = new View();
		BankOpened.menu();
		
	} // m e
	void menu() { // v s
		while(true) {			
			System.out.println("--------회원가입-------");
			System.out.print(" 1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호찾기 선택 : ");
			int ch = scanner.nextInt();
			Model model = new Model();
			if(ch == 1) { //if
				boolean result = model.회원가입();	
				if(result)
					System.out.println(" 회원가입 성공 ");
				else
					System.out.println(" 회원가입 실패 ");
			}
			else if(ch == 2) {
				String result = model.로그인();
				if(result == null) {
					System.out.println("동일한 회원 정보가 없습니다.");
				}else if(result.equals("admin")) {
					System.out.println(" 안녕하세요! "+result+"님"); // ?
					adminmenu(); // ?
				}else {
					System.out.println(" 안녕하세요! "+result+"님");
				}
			}
			else if(ch == 3) {
				//model.아이디찾기();
			}		
			else if(ch == 4) {
				//model.비밀번호찾기();
			}		
			else {
				System.out.println("알 수 없는 번호입니다.");
			}
		}
		void Countmenu() {
			while(true){
				System.out.println("---------회원 메뉴--------");
				System.out.print("1.계좌개설 2.입금 3.출금 4.이체 5.대출 6.내 계좌목록 7.취소 선택 : ");
				int ch = scanner.nextInt();
				Count count = new Count();
				if(ch == 1) {Count.계좌개설();}
				else if(ch == 2) {Count.입금();}
				else if(ch == 3) {Count.출금();}
				else if(ch == 4) {Count.이체();}
				else if(ch == 5) {Count.대출();}
				else if(ch == 6) {Count.계좌목록();}
				else if(ch == 7) {return;}
				else {System.out.println(" 알 수 없는 번호입니다. ");}
			}
		}
	}
		
	} // v e
	
	
} // c e
