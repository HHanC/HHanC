package application.Day22;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Day22_1 extends Application {

	@Override
	public void start(Stage 스테이지) throws Exception {
		
		// 1. 씬 빌더에서 작성한 파일을 객체로 가져오기
		Parent parent = FXMLLoader.load(getClass().getResource("DB테스트.fxml"));
		// 2. 씬 객체를 만들어서 
		Scene scene = new Scene(parent);
		// 3. 씬 객체를 스테이지에 연결
		스테이지.setScene(scene);
		// 4. 스테이지 연결
		스테이지.show();
		
	}
	// 메소드 선언
	public static void main(String[] args) {
		launch(args);
	}
}
