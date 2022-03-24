package Day17;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class 코스등록 {

	public static void main(String[] args) {
		
		
	}
		// 와일트카드 : ? [모든 클래스 이름]
			// 코스< ? > : 모든 제네릭 가능
			// 코스< ? extends 클래스명 > : 해당 클래스로부터 상속받은 (자식) 제네릭 클래스 가능
			// 코스< ? super 클래스명 > : 해당 클래스로부터 상속 준 (부모) 제네릭 클래스 가능
	
	public static void 코스등록(코스<?> 코스명단) {
		
		System.out.println(코스명단.getName() + "수강생명단 : "
				+ Arrays.toString(코스명단.getStudents()));
		
	}
	
	// 2.
	public static void 학생코스명단출력(코스<? extends 학생> 코스명단) {
						// * 학생 클래스로부터 상속받은 모든 클래스만 가능
		System.out.println(코스명단.getName() + "수강생명단 : "
				+ Arrays.toString(코스명단.getStudents()));
	}
	
	
}
