package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Start extends Application {


	@Override
	public void start(Stage stage) throws Exception {
		
		// 5. 컨테이너 불러오기
		Parent parent = FXMLLoader.load(getClass().getResource("/view/main.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		
		// 3. 스테이지 로고 설정
			// 1. 이미지불러오기
			Image image = new Image("/img/stagelogo.jpg");
				// 절대경로 vs 상대경로
				// 절대경로 : 모든경로
				// 상대경로 : 현 위치 기준 경로
			// 2. 스테이지 설정
			
		stage.getIcons().add(image);
		stage.setResizable(false); // 크기변경 안됌
		stage.setTitle("이젠마켓"); // 2. 스테이지 창 이름
		stage.show(); // 1. 스테이지 열기
		
	}
	
	public static void main(String[] args) {
		
		launch(args);
		
	}
	
}
