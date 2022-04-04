package 과제.은행계좌프로그램;

import java.util.Random;

public class 은행컨트롤러 {

	// 입출력 기능X
		// V[ 입출력 ] <-----> C[ 코드 ]
		// 해당 클래스는 은행 관련 컨트롤러
		// M : 모델 [ 데이터 ]
		// V : 뷰 [ 입출력 ]
		// C : 모델[M] 과 뷰[V] 연결 역할
	
	// 은행계좌프로그램 [ 상속 ] 
				// 은행[super]
				// 국민은행[sub] , 신한은행[sub] , 하나은행[sub]
				// 주 기능 : 1.계좌생성 2.입금 3.출금 4.이체 5.내계좌목록 6.대출 
	
	public String 계좌생성(String 비밀번호, String 계좌주, int 은행번호) {
		
		String 계좌번호 = null;
		while(true) {
			
			Random random = new Random();
			int 난수 = random.nextInt(10000);
			계좌번호 = String.format("%04d", 난수);
			
			Boolean 중복계좌 = false;
			for(은행 temp : 은행계좌프로그램.계좌리스트) {
				if(temp != null && temp.get계좌번호().equals(계좌번호)) {
					중복계좌 = true;
				}
			}
			if(!중복계좌) {
				break;
			}
		}	
		
		은행 temp = null;
		if(은행번호 == 1) {
			temp = new 국민은행(계좌번호, 비밀번호, 계좌주, 은행번호);
		}else if(은행번호 == 2) {
			temp = new 신한은행(계좌번호, 비밀번호, 계좌주, 은행번호);
		}else if(은행번호 == 3) {
			temp = new 하나은행(계좌번호, 비밀번호, 계좌주, 은행번호);
		}
		
		int i = 0;
		for(은행 temp2 : 은행계좌프로그램.계좌리스트) {
			if(temp2 == null) {
				은행계좌프로그램.계좌리스트[i] = temp;
				return 계좌번호;
			}
		}		
		return null;
	}
	
	public boolean 입금(String 계좌번호, int 입금액) {
		
		int i = 0;
		for(은행 temp : 은행계좌프로그램.계좌리스트) {
			if(temp != null && temp.get계좌번호().equals(계좌번호)) {
				은행계좌프로그램.계좌리스트[i].set예금액(temp.get예금액()+입금액);
				return true;
			}
			i++;
		}	
		return false;
	}
	
	public int 출금(String 계좌번호, String 비밀번호, int 출금액) {
		
		int i = 0;
		for(은행 temp : 은행계좌프로그램.계좌리스트) {
			if(temp != null && temp.get계좌번호().equals(계좌번호)
					&& temp.get비밀번호().equals(비밀번호)) {
				if(temp.get예금액() < 출금액) {
					return 1;
				}else {
					은행계좌프로그램.계좌리스트[i].set예금액(temp.get예금액()-출금액);
					return 2;
				}
			}
			i++;
		}
		
		return 3;
	}
	public int 이체(String 계좌번호, String 비밀번호, int 이체금액, String 받는계좌) {
		
		int i = 0;
		for(은행 temp : 은행계좌프로그램.계좌리스트) {
			if(temp != null && temp.get계좌번호().equals(계좌번호)
					&& temp.get비밀번호().equals(비밀번호)) {
				int j = 0;
				for(은행 temp2 : 은행계좌프로그램.계좌리스트) {
					if(temp2 != null && temp2.get계좌번호().equals(받는계좌)) {
						if(temp.get예금액() < 이체금액) {
							return 1;
						}else {
							은행계좌프로그램.계좌리스트[i].set예금액(temp.get예금액()-이체금액);
							은행계좌프로그램.계좌리스트[j].set예금액(temp2.get예금액()+이체금액);
							return 2;
						}
					}
					j++;
				}
			}
			i++;
		}				
		return 4;
	}
	public 은행[] 계좌목록(String 계좌주) {
		
		은행[] 내계좌목록 = new 은행[100];
		for(은행 temp : 은행계좌프로그램.계좌리스트) {
			if(temp != null && temp.get계좌주().equals(계좌주)) {
				
				int i = 0;
				for(은행 temp2 : 내계좌목록) {
					if(temp2 == null) {
						내계좌목록[i] = temp;
						break;
					}
					i++;
				}
			}
		}	
		return 내계좌목록;
	}
	public boolean 대출() {
		return false;
	}
}

















