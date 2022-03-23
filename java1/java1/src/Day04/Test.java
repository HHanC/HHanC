package Day04;

import java.util.Scanner;

public class Test {
	// 순서 : 입출력 -> 변수 -> 반복문 -> 제어문
	// 자판기 프로그램
			// 1. 메뉴판 [ 1.콜라(300) 2.환타(200) 3.사이다(100) 4.결제 ] 
			// 		// 1.메뉴판에서 제품선택하면 장바구니에 넣기 
			//		// 2.재고가 부족하면 알림( 재고부족 )
			// 2. 초기 재고 [ 제품 당 10개씩 ]
			// 3. 결제시 금액입력받아 결제액 만큼 차감후 잔돈 출력 
					// 1. 투입한 금액보다 구매액 이 더 크면 결제 취소 [ 금액부족 ]
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int 콜라재고 = 10; int 환타재고 = 10; int 사이다재고 = 10;
		int 콜라구매수 = 0; int 환타구매수 = 0; int 사이다구매수 = 0;
		
		while(true) {
			System.out.println("----------매뉴판----------");
			System.out.println(" 1. 콜라[300] 2. 환타[200] 3. 사이다[100] 4. 결제");
			System.out.println(">>>>> 선택 : "); int 선택 = scanner.nextInt();
			
			if(선택 == 1) {
				if(콜라재고 == 0) {
					System.out.println(" 재고가 없습니다. ");
				}
				else {
					System.out.println("[[콜라를 담았습니다.]]");
					콜라구매수++;
					콜라재고--;
				}
			}
			else if(선택 == 2) {
				if(환타재고 == 0) {
					System.out.println(" 재고가 없습니다. ");
				}
				else {
					System.out.println("[[환타를 담았습니다.]]");
					환타구매수++;
					환타재고--;
				}
			}
			else if(선택 == 3) {
				if(사이다재고 == 0) {
					System.out.println(" 재고가 없습니다. ");
				}
				else {
					System.out.println("[[사이다를 담았습니다.]]");
					사이다구매수++;
					사이다재고--;
				}
			}
			else if(선택 == 4) {
				System.out.println("----------결제품목---------");
				System.out.println("제품명\t수량\t금액");
				System.out.println("콜라\t" + 콜라구매수 + "\t" + (콜라구매수*300));
				System.out.println("환타\t" + 환타구매수 + "\t" + (환타구매수*200));
				System.out.println("사이다\t" + 사이다구매수 + "\t" + (사이다구매수*100));
				int 총결제액 = (콜라구매수*300)+(환타구매수*200)+(사이다구매수*100);
				System.out.println("-------------------------");
				System.out.println(" 1. 결제 2. 취소 "); int 선택2 = scanner.nextInt();
				
				
			}
		
			
		}
		
	}
	
}
