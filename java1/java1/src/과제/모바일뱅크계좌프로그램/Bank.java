package 과제.모바일뱅크계좌프로그램;

import Day08.bank.Count;

public class Bank {

	String id;
	String pw;
	String name;
	int money;
	
	public Bank() {}

	public Bank(String id, String pw, String name, int money) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.money = money;
	}
	
	public boolean 계좌개설() {
		System.out.print("아이디 : "); String id = Main.scanner.next();
		System.out.print("비밀번호 : "); String pw = Main.scanner.next();
		System.out.print("계정 : "); String name = Main.scanner.next();
		
		for(Bank temp : Main.banks) {
			if(temp != null && temp.id.equals(id)) {
				System.out.println("중복된 아이디 입니다.");
				return false;
			}
		}
		Bank bank = new Bank(id, pw, name, money);
		int i = 0;
		for(Bank temp : Main.banks) {
			if(temp == null) {
				Main.banks[i] = bank;
				System.out.println("계좌개설이 완료되었습니다.");
				return true;
			}
			i++;
		}
		return false;
	}
	public void 입금() {
		int money = Main.scanner.nextInt();
		int i = 0;
		for(Bank temp : Main.banks) {
			if(temp != null) {
				Main.banks[i].money = money;	
				System.out.println("입금이 완료되었습니다.");
				break;
			}else {
				System.out.println("계좌번호를 다시 확인해주세요.");				
			}
			i++;
		}
	}
	public void 출금() {
		System.out.println(" 출금할 금액 : ");
		int 금액 = Main.scanner.nextInt();
		int i = 0;
		System.out.println(" 계좌의 비밀번호를 입력해 주세요 :");
		String 비번 = Main.scanner.next();
		for(Bank temp : Main.banks) {
			if(temp != null && temp.pw.equals(비번) ) {
				System.out.println(" 접속 ");
			}else {
				System.out.println(" 비밀번호를 다시 입력해 주세요.");
				break;
			}
		}
	}
	public void 이체() {
		System.out.println(" 계좌번호 입력 : ");
		int 계좌번호 = Main.scanner.nextInt();
		int i = 0;
		System.out.println(" 비밀번호 : ");
		int 비번 = Main.scanner.nextInt();
		for(Bank temp : Main.banks) {
			if(temp != null && temp.pw.equals(비번)) {
				Main.banks[i].money = money;
				System.out.println(" 이체를 완료했습니다.");
			}else {
				System.out.println(" 비밀번호를 다시 입력해주세요");
				break;
			}
		}		
	}
	public void 대출() {
		System.out.println(" 금액 : ");
		int 금액 = Main.scanner.nextInt();
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
	public void 내계좌목록() {
		System.out.print(" 1. 국민계좌 2. 우리계좌 3. ibk계좌 4. 신한계좌 선택 : ");
		int 선택 = Main.scanner.nextInt();
	}
	
}









