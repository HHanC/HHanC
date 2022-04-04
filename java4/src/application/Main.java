package application;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	@Override
	public void start(Stage 스테이지) throws Exception {
		
		
		
		VBox 컨테이너 = new VBox(); // 1. 컨테이너를 만든다.
			// 2. 컨트롤 만든기
			Button button = new Button();
			button.setText("닫기");
			button.setOnAction(e -> Platform.exit()); // exit 창닫기 // 람다식?
		// 3. 컨테이너에 컨트롤 넣기
		컨테이너.getChildren().add(button);
		// 4. 씬 만들기
		Scene 장면 = new Scene(컨테이너, 500, 500);
		// 5. 스테이지에 씬 넣기
		스테이지.setScene(장면);
		스테이지.show(); // 스테이지 열기
		
	}
	
	public static void main(String[] args) {
		
		launch(args); // start를 불러내는게 launch
		
	}
	
}
