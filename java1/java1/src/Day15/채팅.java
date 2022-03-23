package Day15;

public class 채팅 implements Runnable {

	@Override
	public void run() {
		// 병렬처리 실행
		while(true) {
			System.out.println("*****채팅중******");
			try {
				Thread.sleep(500);
			}catch (Exception e) {}
		}
		
		
	}
}
