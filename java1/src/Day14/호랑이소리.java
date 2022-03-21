package Day14;

public class 호랑이소리 extends Thread {
	
	@Override
	public void run() {
		for( int i = 0 ; i<5;i++) {
			System.out.println("À¸¸£··"+i);
			try { Thread.sleep(500); }
			catch( Exception e ) {}
		}
		
	}
	

}