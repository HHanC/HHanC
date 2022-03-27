package 과제.자유주제로프로그래밍만들기;

import java.util.Scanner;

public class pc방 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // 입력객체생성
		String[][] 회원 = new String[10][4]; // id, pw, name, 금액, 2차원 배열 선언
		String[] 좌석 = {"[ ]", "[ ]", "[ ]","[ ]","[ ]", // 1차원 좌석 배열 선언
						"[ ]","[ ]","[ ]","[ ]","[ ]",
						"[ ]","[ ]","[ ]","[ ]","[ ]"};
		
		while(true) { // 반복문 생성
			
			System.out.println("1. 회원가입 2.로그인  3. 좌석선택 4. 금액투입 5. 로그아웃");
			System.out.print("선택 : ");
			int ch = scanner.nextInt(); // 입력 객체 생성
			
			if(ch == 1) {
				System.out.println("----------------회원가입 페이지-----------------");
				System.out.println("id : "); String id = scanner.next(); // id 입력 객체 생성
				System.out.println("pw : "); String pw = scanner.next(); // pw 입력 객체 생성
				System.out.println("name : "); String name = scanner.next(); // name 입력 객체 생성
				
				boolean 통과 = true; // boolean 초기값 true
				for(int i=0; i<회원.length; i++) {	// for문 배열		
					if(회원[i][0] != null && 회원[i][0].equals(id)) {	 // id가 null아니고 id가 입력받은 id가 같다면 					
						System.out.println("중복된 id입니다. 다시 입력해 주세요"); // 중복된 id입니다. 출력
						통과 = false; // 통과 = false
					}
					if(통과) { // true값
						if(회원[i][0] == null) { // 배열의id가 null이면
							회원[i][0] = id; // 배열에 id를 저장
							회원[i][1] = pw; // 배열에 pw를 저장
							회원[i][2] = name; // 배열에 name를 저장
							System.out.println("회원가입이 완료되었습니다.");
							break; // break를 통해서 반복문 탈출
						}
					}
				}													
			}else if(ch == 2) {
				while(true) { // 반복문 생성
					System.out.println("-----------------로그인 페이지-----------------");
					System.out.print("id : "); String id = scanner.next(); // id 입력 객체 생성
					System.out.print("pw : "); String pw = scanner.next(); // pw 입력 객체 생성
					
					boolean 통과 = false; // 초기값 false
					for(int i=0; i<회원.length; i++) { // for 반복문 생성
						if(회원[i][0] != null && 회원[i][0].equals(id) && 회원[i][1].equals(pw)) { // id 가 null이 아니고 입력받은 id와 pw가 같다면
							System.out.println("로그인 성공"); // 로그인 성공 출력
							통과 = true; // true 참
							break; // break를 통해서 반복문 탈출
						}
						if(!통과) { // false이면 로그인 실패
							System.out.println("로그인 실패");
						}				
					}
				}
				
			}else if(ch == 3) { 
				while(true) { // 반복문 생성
					for(int i=0; i<회원.length; i++) { // for반복문 생성
						System.out.print(좌석[i]);	// 배열에 있는 데이터 호출
						if( i % 5 == 4) System.out.println();	// 나머지가 4 9 14 일때 줄 바꿈처리		
					}
						System.out.println("--------------좌석 고르기-------------");
						System.out.print("좌석 선택 : "); int 위치 = scanner.nextInt();
						if(좌석[위치].equals("[ ]")) { // 좌석의 위치가 인덱스 번호의 "[ ]" 이라면
							좌석[위치] = "[o]"; // "[o]" 를 출력
							break; // break를 통해서 반복문 탈출
						}else {
							System.out.println("다른 좌석을 선택해 주세요.");
						}	
				}
				
			}else if(ch == 4) {
				
				System.out.println("--------------------결제--------------------");
				System.out.println("1. 결제 2. 취소");
				int ch2 = scanner.nextInt();
				
				if(ch2 == 1) {
					System.out.print("결제 금액 : "); String 결제금액 = scanner.next();
					boolean 통과 = false; // 통과 초기값 false
					for(int i=0; i<회원.length; i++) { // for문 반복문 생성
						if(회원[i][4] == null) { // 금액이 null 이라면 
							회원[i][4] = 결제금액;// 입력받은 결제금액을 배열에 저장
							System.out.println("결제 성공");
							통과 = true;
						}
						if(회원[i][4] != null) { // 금액이 null이 아니면
							회원[i][4] = 결제금액; // 입력받은 결제금액을 배열에 저장
							System.out.println("추가 결제 성공"); // 추가결제 성공
							통과 = true; // true
						}
					}				
				}else if(ch2 == 2) {
					System.out.println("결제가 취소되었습니다.");
				}else {
					System.out.println("알 수 없는 번호입니다.");
				}			
			}else if(ch == 5) {
				System.out.println("로그아웃 되었습니다.");
				break;
			}else {
				
			}
		}
	}
}
