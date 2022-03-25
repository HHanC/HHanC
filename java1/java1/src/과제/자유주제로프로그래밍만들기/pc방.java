package 과제.자유주제로프로그래밍만들기;

import java.util.Scanner;

public class pc방 {

	// 1. 회원가입 (회원가입시 중복체크 및 로그인 id pw동일해야함)
	// 2. 로그인 성공 했을 시 후불로
	// 3. 좌석에서 pc를 하고 있다면 [x] 시간이 끝났다면 [o]
	// 4. 
	// 5. 
	// 6. 
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[][] 회원가입 = new String[10][4];
		String[] 좌석 = {"[ ]", "[ ]", "[ ]","[ ]","[ ]",
						"[ ]","[ ]","[ ]","[ ]","[ ]",
						"[ ]","[ ]","[ ]","[ ]","[ ]"};
		
		while(true) {
			
			System.out.println("1. 회원가입 2. 로그인 3. 금액투입");
			System.out.print("선택 : ");
			int ch = scanner.nextInt();
			
			if(ch == 1) {
				System.out.println("----------------회원가입 페이지-----------------");
				System.out.println("id : "); String id = scanner.next();
				System.out.println("pw : "); String pw = scanner.next();
				System.out.println("name : "); String name = scanner.next();
				
				boolean 통과 = true;
				for(int i=0; i<회원가입.length; i++) {					
					if(회원가입[i][0] != null && 회원가입[i][0].equals(id)) {						
						System.out.println("중복된 id입니다. 다시 입력해 주세요");
						통과 = false;
					}
					if(통과) {
						if(회원가입[i][0] == null) {
							회원가입[i][0] = id;
							회원가입[i][1] = pw;
							회원가입[i][2] = name;
							System.out.println("회원가입이 완료되었습니다.");
						}
					}
				}
													
			}else if(ch == 2) {
				System.out.println("-----------------로그인 페이지----------------");
				System.out.println("id : "); String id = scanner.next();
				System.out.println("pw : "); String pw = scanner.next();
				
				boolean 통과 = false; // 선언
				회원가입[0][3] = "123";
				for(int i=0; i<회원가입.length; i++) { //로그인 -> 시간체크 = 통과 true => 로그인성공페이지 // f s
					if(회원가입[i][0] != null && 회원가입[i][0].equals(id)) { // if s
						if(회원가입[i][1].equals(pw)) { // pw if s						
							if(회원가입[i][3] != null && Integer.parseInt(회원가입[i][3]) > 0) { // time if s "123" = 123 "123s" = err
								통과 = true; // 초기화
							} // time if e							
						} // pw if e						
					} // if e
				} // f e
				if(!통과) {
					System.out.println("로그인 실패하였습니다.");
				}
				
				if(통과) {
					
					System.out.println("로그인 성공");
					
					
					
					
				}
				
				
				
				
			}else {
				System.out.println("알 수 없는 번호입니다.");
			}						
		}				
	}	
}
