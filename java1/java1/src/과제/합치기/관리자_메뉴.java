package 과제.합치기;

import java.time.LocalTime;
import java.util.Scanner;

public class 관리자_메뉴 {

	public static void main(String[] args) {
		관리자_메뉴 app = new 관리자_메뉴();
		app.메뉴();
	}

void 메뉴() { // 반환값이 없는? void 생성
	Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성
	while(true) { // 반복문을 사용하여 관리자메뉴를 지속적?으로 띄어준다.
		관리자컨트롤러 admincontroller = new 관리자컨트롤러(); // 메소드의 admincontroller 객체를 생성
		
		System.out.println("관리자메뉴"); 
		System.out.println("1. 영화등록 및 영화시간등록 2. 음식등록 3. 매출확인 4. 로그아웃"); int ch = scanner.nextInt();
		
		if(ch == 1) {
			System.out.print("영화이름 : "); String 영화이름 = scanner.next();
			System.out.print("영화시간 : "); String 영화시간 = scanner.next();
			
			Boolean 통과 = admincontroller.영화등록(영화이름, 영화시간); // 영화이름과 영화시간을 입력받으면 admincontroller객체에 접근연산자를 사용하여 영화등록 생성자에 값을 등록한다.
			
			if(통과) { // 통과 = true 이면 if문 출력
				System.out.println("영화등록 및 영화시간이 등록되었습니다.");
			}else { // 통과 = false 이면 else문 출력
				System.out.println("영화 등록 실패.");
			}		
		}else if(ch == 2) {
			
		}else if(ch == 3) {
			
		}else if(ch == 4) {
			
		}else {
			
		}
			
	}
	
}


} // ce