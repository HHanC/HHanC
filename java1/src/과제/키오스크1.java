package 과제;

import java.util.Scanner;

public class 키오스크1 {

				// 자판기 프로그램
				// 1. 메뉴판 [ 1.콜라(300) 2.환타(200) 3.사이다(100) 4.결제 ] 
				// 		// 1.메뉴판에서 제품선택하면 장바구니에 넣기 
				//		// 2.재고가 부족하면 알림( 재고부족 )
				// 2. 초기 재고 [ 제품 당 10개씩 ]
				// 3. 결제시 금액입력받아 결제액 만큼 차감후 잔돈 출력 
						// 1. 투입한 금액보다 구매액 이 더 크면 결제 취소 [ 금액부족 ]
	
	public static void main(String[] args) { // 메인 안에 코드를 입력해야 출력이 되므로 메인 메소드를 만들어 준다.
		
		Scanner scanner = new Scanner(System.in); // 이후에 스캐너 객채를 사용하기 위해 스캐너를 불러들여 객체를 생성해준다.
		int 콜라재고 = 10; int 환타재고 = 10; int 사이다재고 = 10; // 각 품목의 재고와 구매수의 초기값을 설정해 준다.
		int 콜라구매수 = 0; int 환타구매수 = 0; int 사이다구매수 = 0;
		
		while(true) { // 반복문을 실행하여 메뉴판을 만들고 조건문의 실행이 끝났을 때 다시 메뉴판을 볼 수 있게 해준다.
		System.out.println("------------메뉴판------------"); // 메뉴판을 만들어준다.
		System.out.print("1. 콜라[300] 2. 환타[200] 3. 사이다[100] 4. 결제 선택 : "); // 사용자가 번호를 입력하면 각 품목을 장바구니에 담게 해준다.
		int 선택 = scanner.nextInt(); // 사용자가 번호를 입력하고 저장할 수 있게 선택이라는 변수의 스캐너 객체를 만들어준다.
		
			if(선택 == 1) { // if문의 조건을 걸어놓고 비교연산자를 통해 1번을 입력하면 콜라를 선택했다는 것을 입력한다.
				if(콜라재고 == 0) { // 비교연산자를 통해 콜라 재고가 없다면 콜라가 없습니다 를 출력해준다.
					System.out.println("콜라 재고가 없습니다.");
				}else { // 위에 있는 if문의 조건이 아니라면 else를 사용하면 장바구니에 콜라를 담았습니다. 를 출력해준다.
					System.out.println("콜라를 담았습니다.");
					콜라구매수++; // 장바구니에 콜라를 담았으면 int자료형의 콜라구매수를 증가해준다.
					콜라재고--;
				}
			}
			else if(선택 == 2) { // else if문의 조건을 걸어놓고 비교연산자를 통해 2번을 입력하면 환타를 선택했다는 것을 입력한다.
				if(환타재고 == 0) { // 비교연산자를 통해 환타 재고가 없다면 환타가 없습니다 를 출력해준다.
					System.out.println("환타 재고가 없습니다.");
				}else { // 위에 있는 if문의 조건이 아니라면 else를 사용하면 장바구니에 환타를 담았습니다. 를 출력해준다.
					System.out.println("환타를 담았습니다.");
					환타구매수++; // 장바구니에 콜라를 담았으면 int자료형의 콜라구매수를 증가해준다.
					환타재고--;
				}
			}
			else if(선택 == 3) { // else if문의 조건을 걸어놓고 비교연산자를 통해 3번을 입력하면 사이다를 선택했다는 것을 입력한다.
				if(사이다재고 == 0) { // 비교연산자를 통해 사이다 재고가 없다면 사이다가 없습니다 를 출력해준다.
					System.out.println("사이다 재고가 없습니다.");
				}else { // 위에 있는 if문의 조건이 아니라면 else를 사용하면 장바구니에 사이다를 담았습니다. 를 출력해준다.
					System.out.println("사이다를 담았습니다.");
					사이다구매수++; // 장바구니에 사이다를 담았으면 int자료형의 사이다구매수를 증가해준다.
					사이다재고--;
				}
			}
			else if(선택 == 4) { // if문의 조건을 걸어놓고 비교연산자를 통해 4번을 입력하면 취소를 선택했다는 것을 입력한다.
				System.out.println("--------결제 품목---------");
				System.out.println("제품명\t수량\t금액"); // \t를 사용해서 들여쓰기를 해준다.
				if(콜라구매수 != 0) System.out.println("콜라\t" + 콜라구매수 + "\t" + (콜라구매수*300) ); // if조건문에 비교연산자를 사용하여 콜라구매수가 0이 아닐경우 콜라구매수와 콜라구매수 * 300을 한 금액을 조건문에 담는다.
				if(환타구매수 != 0) System.out.println("환타\t" + 환타구매수 + "\t" + (환타구매수*200) ); // if조건문에 비교연산자를 사용하여 환타구매수가 0이 아닐경우 환타구매수와 환타구매수 * 200을 한 금액을 조건문에 담는다.
				if(사이다구매수 != 0) System.out.println("사이다\t" + 사이다구매수 + "\t" + (사이다구매수*100) ); // if조건문에 비교연산자를 사용하여 사이다구매수가 0이 아닐경우 사이다구매수와 사이다구매수 * 100을 한 금액을 조건문에 담는다.
				int 총금액 = (콜라구매수*300) + (환타구매수*200) + (사이다구매수*100); // int자료형에 총금액이라는 변수를 사용하여 각 품목의 금액을 변수에 담는다.
				System.out.println("총금액 : " + 총금액); // 총 금액을 출력할 때  총금액 변수를 입력하여 총금액을 출력해준다.
				System.out.println("-------------------------");
				System.out.print("1. 결제 2. 취소 선택 : "); int 선택2 = scanner.nextInt(); // 선택2라는 정수 자료형의 변수를 선언하고 스캐너 객체를 사용하여 사용자가 입력한 값을 저장해준다.
				
				if(선택2 == 1) { // if조건문에 비교연산자를 사용하여 사용자가 입력한 값이 1과 같다면 금액을 입력할 수 있게 코드를 작성한다.
					while(true) { // 반복문을 통해서 잔액이 부족하면 다시 금액을 입력할 수 있도록 해준다.
						System.out.println("금액 : "); int 금액 = scanner.nextInt(); // 금액이라는 변수에 int자료형 정수값이 들어갈 수 있도록 해주고 스캐너 객체를 사용하여 입력값을 저장할 수 있도록 해준다.
						
						if(금액 < 총금액) { // 사용자가 입력한 금액보다 총금액이 더 크다면 잔액이 부족합니다. 를 출력해준다.
							System.out.println(" 잔액이 부족합니다.");
						}
						else { // 위에 if문의 조건이 틀리다면 else를 사용하여 결제를 완료했습니다. 를 출력해준다.
							System.out.println("결제를 완료했습니다. ");
							System.out.println("잔돈 출력 : " + (금액 - 총금액) + "원"); // 사용자가 입력한 금액이 총금액보다 크다면 금액 - 총금액을 계산하여 잔돈을 출력해준다.
							콜라구매수 = 0; 환타구매수 = 0; 사이다구매수 = 0; // 결제가 완료되었다면 각 품목의 구매수를 초기값으로 변경해준다. (각 품목의 재고는 줄어들었음)
							break; // 결제가 완료되었다면 브레이크를 통해 와일문을 빠져나가서 제일 가까운 와일문으로 이동한다.
						}						
					}
					
				}else if(선택2 == 2) { // else if조건문에 비교연산자를 사용하여 사용자가 입력한 2번과 취소의 2번이 같다면 결제가 취소되었습니다. 를 출력
					System.out.println("결제가 취소되었습니다.");
					콜라재고 += 콜라구매수; 환타재고 += 환타구매수; 사이다재고 += 사이다구매수; // 결제가 취소되었다면 증감연산자를 사용하여 각 품목 구매수를 다시 재고로 옮겨주는 작업을 한다.
					콜라구매수 = 0; 환타구매수 = 0; 사이다구매수 = 0; // 결제가 취소되었으면 각 품목의 장바구니에 담긴 수량을 0으로 바꿔준다.
					 
				}
				else { // 1번과 2번이 아닌 다른 번호를 입력했다면 알 수 없는 행동입니다.를 출력한다.
					System.out.println("알 수 없는 행동입니다.");
				}				
				
			}
			else { // 1번, 2번, 3번 4번 외에 다른 번호를 입력했다면 알 수 없는 행동입니다.를 출력한다.
				System.out.println("알 수 없는 행동입니다.");
			}
		}
	}
	
}
