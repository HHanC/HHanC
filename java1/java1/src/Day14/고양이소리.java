package Day14;

public class 고양이소리 extends Thread {
	@Override
	public void run() {
		for( int i = 0 ; i<5;i++) {
			System.out.println("고양이소리"+i);
			try { Thread.sleep(500); }
			catch( Exception e ) {}
		}
	}
}