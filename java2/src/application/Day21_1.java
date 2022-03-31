package application;

// javafx만 사용[ awt , swing 이전 버전 X ]
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Day21_1 extends Application {
				// extends : 상속 [ Application : JAVAFX 관련클래스 => start 메소드 제공 ] 
					// 상속받으면 슈퍼클래스내 멤버를 사용할수 있다.
	@Override
	public void start( Stage 스테이지 ) throws Exception {
		VBox 컨테이너 = new VBox();
			Button button = new Button();
			button.setText("닫기");
			button.setOnAction( e -> Platform.exit() );
		컨테이너.getChildren().add(button);
		Scene 장면 = new Scene( 컨테이너 , 500 , 500  );
		스테이지.setScene(장면);
		스테이지.show();
	}
	
	public static void main(String[] args) { // 메인스레드
		launch(args); // start 메소드 호출 
	}
	

}