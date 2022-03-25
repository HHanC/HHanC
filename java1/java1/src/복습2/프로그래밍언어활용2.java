package 복습2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

import Day14.회원;


public class 프로그래밍언어활용2 {
	
	public static void main(String[] args) {
		// main중괄호안에 코드를 입력해야 실행이 된다.

	학생[] 학생목록 = new 학생[100];
	
	while( true ) { // 무한반복 
		Scanner scanner = new Scanner(System.in); // 입력받을 때 쓰는 객체
		
		System.out.println("---------------------------"); // 출력하고 줄 바꿈
		System.out.println("\t성\t적\t표"); // \t : 들여쓰기
		System.out.println("---------------------------");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("---------------------------");
		
			// 배열내 모든 학생(객체) 꺼내오기 
//			for( int j = 0 ; i<학생목록.length ; i++ ) {
//				
//				학생 temp = 학생목록[i];
//				if( temp != null ) {
//					System.out.println( (j)+"\t"+temp.이름+"\t"+temp.국어+"\t"+temp.영어+"\t"+temp.수학+"\t"+temp.총점+"\t"+temp.평균+"\t1");
//				}
//			}
			// 위 for 업그레이드 버전 
			int j = 0; // 인덱스용 변수 
			for( 학생 temp : 학생목록  ) { 
				// 배열내 학생이 존재할때만 출력하자
				if( temp != null ) {
					System.out.println( (j)+"\t"+temp.이름+"\t"+temp.국어+"\t"+temp.영어+"\t"+temp.수학+"\t"+temp.총점+"\t"+temp.평균+"\t1");
				}
				j++; //인덱스 증가
			}
		
		System.out.println("--------------------------");
		System.out.println("1.학생추가 2.학생삭제 3.학생저장 4.학생불러오기  :");
		int 메뉴선택 = scanner.nextInt();
		if( 메뉴선택 == 1 ) {
			System.out.print("이름 : ");	String 이름 = scanner.next();
			// 자료형 변수명 = 값
		// 문자열자료형 이름 = 입력값 가져오기
			System.out.print("국어 : ");	int 국어 = scanner.nextInt();
			System.out.print("영어 : ");	int 영어 = scanner.nextInt();
			System.out.print("수학 : ");	int 수학 = scanner.nextInt();
			int 총점 = 국어 + 영어 + 수학;	
			double 평균 = 총점 / 3.0;
			
			// 1. 객체생성 방법 : 클래스명 객체명(아무거나) = new 생성자();
			학생 s1 = new 학생(이름, 국어, 영어, 수학, 총점, 평균);
		
				
			// 2. 배열에 저장 
			for( int i = 0 ; i<100 ; i++ ) { // i는 0~99까지 반복 [ 왜? 0부터 하죠?? 배열의 인덱스용으로 사용할려고 [ 인덱스 0부터 ~ ]
		//  반복문( 시작값     ;   조건(끝나는값) ; 증감
				if( 학생목록 [i] == null  ) {
					// 만약에 i번째 인덱스 값이 null(객체가 없다=학생이없다) 
					학생목록 [i] = s1; // 학생 객체를 배열내 저장했으면
					System.out.println("*학생저장");
					break; // 멈춤
				}
			}
			
		}else if(메뉴선택 == 2 ) {
			System.out.println("삭제할 학생번호(인덱스) : "); int 삭제번호 = scanner.nextInt();
			학생목록 [삭제번호] = null;
			
		}
		else if( 메뉴선택 == 3 ) {
			// 1. 스트림:경로 Output:내보내기 file : 파일 
			try {
				// 1. 파일출력 스트림 객체 만들기 
				FileOutputStream outputStream = new FileOutputStream("D:/java/파일.txt"); // 무조건 일반예외 [ 예외처리 ]
				// 2. 모든 학생목록에서 학생 내보내기 
				for( int i = 0 ; i<학생목록.length ; i++ ) {
					String 한줄 = 
					학생목록[i].이름 + "\t" +
					학생목록[i].국어 + "\t" +
					학생목록[i].영어 + "\t" +
					학생목록[i].수학 + "\t" +
					학생목록[i].총점 + "\t" +
					학생목록[i].평균 + "\n";
					// 각 필드 구분 : \t	각 학생별로 구분 : \n
					outputStream.write( 한줄.getBytes() );
				}
			}
			catch( Exception e ) {
				System.out.println(" 파일저장 실패 ");
			}
		}
		else if( 메뉴선택 == 4 ) {
			
			// 파일 불러오기 
			// file input stream
			
			try {
				// 1. 파일 입력 객체 
				FileInputStream inputStream = new FileInputStream("d:/java/파일.txt");
				// 2. 바이트 배열 선언 
				byte[] bytes = new byte[1000];
				// 3. 바이트로 읽어온 내용을 바이트 배열 저장 
				inputStream.read(bytes);
				
				// 4. 바이트배열 -> 문자열 변환 
				String 파일내용 = new String( bytes );
				System.out.println( 파일내용 );
				// 5. 학생별 분리 = 줄마다 분리 
				String[] 회원들 = 파일내용.split("\n"); // 엔터 
				// 6. 회원내 필드 분리 
				for( int i = 0 ; i<회원들.length ; i++ ) { // 반복문
					String[] 필드 =  회원들[i].split("\t");
					// 객체화
					학생 학생 = new 학생(필드[0], 
							Integer.parseInt(  필드[1] ) , 
							Integer.parseInt(  필드[2] ),
							Integer.parseInt(  필드[3] ),
							Integer.parseInt(  필드[4] ),
							Double.parseDouble(  필드[5] ) ) ;
					// 객체 저장
					for( int x = 0 ; x<학생목록.length ; x++ ) {
						if( 학생목록[x] == null ) { // 배열내 빈공간찾아서 넣기 
							
							학생목록[x] = 학생; break;
						}
					}
					
				}
			}
			catch( Exception e ) {}
			
			
		}
		
	}
} // 

}