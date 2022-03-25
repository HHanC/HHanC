package 복습2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class 복습0325 {
	
	public static void main(String[] args) {
		
		// * 파일입력스트림 , 파일이 들어오는 경로
			// * 경로 제한 : 바이트 만 다닐수 있다.
				// 바이트 : 기계어[0,1] -> 1010101010 -> 1byte
			// 문자열 -> 바이트열 변환 : 문자열.getBytes()
		try {
			// 1. 파일 출력클래스 객체 생성 [ 파일경로 ] 
			FileOutputStream outputStream  = new FileOutputStream("D:/java/파일.txt"); // 무조건 에러 발생[ 예외처리 ] 
		// 클래스명		변수명(아무거나) = new 생성자( 파일경로/파일명.확장자 );
			// 2. 파일에게 데이터[ 바이트만 ] 보내기
			outputStream.write( "하하하하하하".getBytes() );
			
			// 1. 파일 입력스트림 객체 
			FileInputStream inputStream = new FileInputStream("D:/java/파일.txt");
			// 2. 바이트를 저장할 배열 선언 [ 이유 : 파일에서 가지고 올때 바이트로 가져오기 때문에 ] 
			byte[] bytes = new byte[1000]; // 100바이트 => 영1글자: 1바이트 // 한1글자 : 2바이트 
			// 3. 파일에서 읽어오기 [ read( 바이트배열 ) 메소드  : 해당 바이트배열에 읽어온 바이트를 저장 ]  
			inputStream.read( bytes );
			// 4. 바이트열 -> 문자열 변환 
			String 문자열 =  new String(bytes);
			System.out.println("파일에 읽어온 내용 : " + 문자열  );
			
		}catch( Exception e ) {
			System.out.println("파일처리중 오류");
		}
		
	}

}