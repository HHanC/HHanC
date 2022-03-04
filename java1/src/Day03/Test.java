package Day03;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" 국어점수 : "); int 국어 = scanner.nextInt();
		System.out.println(" 영어점수 : "); int 영어 = scanner.nextInt();
		System.err.println(" 수학점수 : "); int 수학 = scanner.nextInt();
		int 평균 = (국어+영어+수학)/3;
		
		if (평균 >= 90) {
			if (국어 == 100) System.out.println(" 국어점수 : ");
			if (영어 == 100) System.out.println();
		}
	}
}

