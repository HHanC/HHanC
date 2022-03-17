package 과제.틱택토;

import java.util.Random;
import java.util.Scanner;

public class 틱택토1 {

	/*
	 * 삼목 게임 [ 틱택토 게임 ]
			1. 게임판 9칸 생성
				1. String[] 배열 = new String[9]
		
			2. 사용자에게 0~8 인덱스번호 입력받기
				1. 해당 인덱스에 O 표시
				2. 이미 둔 자리는 재 입력 
		
			3. 컴퓨터는 0~8 사이 난수 발생 
				1. 해당 인덱스에 X 표시
				2. 이미 둔 자리는 재 난수 생성  
		
			4. 승리판단 
				가로 인덱스들의 모양이 모두 동일하면
				012 345 678
					첫번째 인덱스가 0부터 6까지 3씩증가
						두번째 : 첫번째+1
 						세번째 : 첫번째+2
				세로 인덱스들의 모양이 모두 동일하면 
				036 147 258
					첫번째 인덱스가 0부터 2까지 1씩증가 
						두번째 : 첫번째+3
						세번째 : 첫번째+6
				대각선 인덱스들의 모양이 모두 동일하면 
				048 246
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] 게임판 = {"[ ]", "[ ]", "[ ]", 
						"[ ]", "[ ]", "[ ]", 
						"[ ]", "[ ]", "[ ]"};
		String 승리알 = "";
		while(true) {
			
			for(int i=0; i<게임판.length; i++) {
				System.out.print(게임판[i]);
				if(i % 3 == 2) System.out.println();
			}
			
			for(int i=0; i<게임판.length; i++) {
				System.out.println("번호 : "); int 번호 = scanner.nextInt();
				if(게임판[번호].equals("[ ]")) {
					게임판[번호] = "[o]";
					break;
				}else {
					System.out.println("중복된 자리 입니다.[재선택]");
				}
			}
			for(int i=0; i<게임판.length; i++) {
				Random random = new Random();
				int 컴퓨터 = random.nextInt(9);
				if(게임판[컴퓨터].equals("[ ]")) {
					게임판[컴퓨터] = "[x]";
					break;
				}
			}
			for(int i=0; i<6; i+=3) {
				if(게임판[i].equals(게임판[i+1]) && 게임판[i+1].equals(게임판[i+2])){
					승리알 = 게임판[i];
					break;
				}
			}
			for(int i=0; i<2; i++) {
				if(게임판[i].equals(게임판[i+3]) && 게임판[i+3].equals(게임판[i+6])){
					승리알 = 게임판[i];
					break;
				}
			}
			if(게임판[0].equals(게임판[4]) && 게임판[4].equals(게임판[8])) {
				승리알 = 게임판[0];
			}
			if(게임판[2].equals(게임판[4]) && 게임판[4].equals(게임판[6])) {
				승리알 = 게임판[2];
			}
			if(승리알.equals("[o]")) {
				System.out.println("플레이어 승리");
				break;
			}
			if(승리알.equals("[x]")) {
				System.out.println("컴퓨터 승리");
				break;
			}
			
		}
	}
	
}
