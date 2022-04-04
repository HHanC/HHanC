package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Day21_2 extends Application { // 어플리게이션 클래스로부터 상속

	@Override
	public void start(Stage stage) throws Exception { // start 메소드 구현
		
		// 1. FXML 파일 불러오기
		Parent parent = FXMLLoader.load(getClass().getResource("test.fxml"));
		// 2. 씬 객체 생성
		Scene scene = new Scene(parent);
		// 3. 스테이지에 씬 넣기
		stage.setScene(scene);
		// 4. 스테이지 시작
		stage.show(); // 스테이지 열기
		
	}
	
	public static void main(String[] args) { // 3. 메인스레드 -> start메소드 호출
		launch(args); // state메소드 호출
	}
	
}
