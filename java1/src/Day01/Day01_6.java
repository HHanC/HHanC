package Day01;

import java.util.Scanner;

public class Day01_6 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println(" 순번 : "); String 순번 = scanner.next();
		System.out.println(" 작성자 : "); String 작성자 = scanner.next();
		System.out.println(" 내용 : "); String 내용 = scanner.next();
		System.out.println(" 날짜 : "); String 날짜 = scanner.next();
		
		System.out.println("* --------------------방문록--------------------");
		System.out.println("* |순번|작성자|내용\t    |날짜  |");
		System.out.println("* |"+순번+"  |"+작성자+"|"+내용+"|"+날짜+"|");
		System.out.println("* ---------------------------------------------");
		
	}
}
