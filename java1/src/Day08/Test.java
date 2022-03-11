package Day08;

import java.util.Scanner;

import Day08.bank.Count;
import Day08.bank.View;

public class Test {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean 회원메뉴() {
			System.out.println("-------회원 메뉴-------");
			System.out.println("1.계좌개설 2.입금 3.출금 4.이체 5.대출 6.계좌목록 선택 : ");
			int ch = scanner.nextInt();
			String name = scanner.next();
			if(ch == 1) {
				 for(Count temp : View.counts) {
					 if(temp == null && temp.이름.equals(이름)) {
						 System.out.println("계좌를 개설하였습니다.");
					 }else {
						 System.out.println("이름을 다시 한 번 확인해주세요");
						 
					 }
				 }
				 
			}
			
	}
		
}
}