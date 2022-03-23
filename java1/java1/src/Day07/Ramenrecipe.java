package Day07;

import java.util.Scanner;

public class Ramenrecipe {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in); 
	int 물 = 1; int 분말스프 = 1; int 야채 = 1; int 라면 = 1; int 완성 = 1;
		
	while(true) {	
		System.out.println("--------라면레시피--------");
		System.out.print("1. 물 2. 분말스프 3. 야채 4. 라면 5. 완성 6. 취소 선택 : "); int 선택 = scanner.nextInt();
		
		if(선택 == 1) {
			if(물 == 0) {
				System.err.println("물이 없습니다.");
			}else {
				System.err.println("물 500ml 넣었습니다");
				물--;
			}
		}else if(선택 == 2) {
			if(분말스프 == 0) {
				System.err.println("분말스프가 없습니다.");
			}else {
				System.err.println("분말스프를 넣었습니다.");
				분말스프--;
			}
			
		}else if(선택 == 3) {
			if(야채 == 0) {
				System.err.println("야채가 없습니다.");
			}else {
				System.err.println("야채를 넣었습니다.");
				야채--;
			}
		}else if(선택 == 4) {
			if(라면 == 0) {
				System.err.println("라면이 없습니다.");
			}else {
				System.err.println("라면을 넣었습니다.");
				라면--;
			}
		}else if(선택 == 5) {
			if(완성 == 0) {
				System.err.println("라면이 아직 완성되지 않았습니다.");
			}else{
				System.err.println("라면이 완성되었습니다.");
				완성--;
			}
			
		}else if(선택 == 6) {
			System.err.println("취소되었습니다.");
		}else {
			System.err.println("알 수 없는 행동입니다.");
			break;
		}
	}
	
	}	
	
}
