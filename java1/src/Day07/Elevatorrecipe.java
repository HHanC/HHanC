package Day07;

import java.util.Scanner;

public class Elevatorrecipe {

	public static void main(String[] args) {
		
		int[] 사용자번호 = new int[10];
	
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			for(int i = 0; i < 10; i++) {
				System.out.print("1~10 사이 입력 : ");
				int 번호 = scanner.nextInt();
				
				boolean 통과 = true;
				
				if(번호 < 1 || 번호 >10) {
					System.err.println("선택할 수 없는 번호입니다. [재입력]");
					통과 = false;
				}
				
				for(int j = 0; j < 10; j++) {
					if(번호 == 사용자번호[j]) {
						System.err.println("이미 선택한 번호 입니다. [재입력]");
						통과 = false;
						break;
					}
				}
				if(통과 == true) {
					사용자번호[i] = 번호;
					System.err.println(사용자번호[i] + "층에도착했습니다. ");
				}
			}
			
		}
	}	
	
}
