package application;
	
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		// 1. fxml 에서 컨테이너 작성한 파일을 객체로 호출 
		try { // 일반적으로 외부파일 가져오거나 // 외부 통신할때 무조건 예외발생
			Parent parent = FXMLLoader.load(getClass().getResource("파일.fxml") );
			
			Scene scene = new Scene(parent);
		
			primaryStage.setScene(scene);
			
			primaryStage.show();
			
			
			
		}catch( Exception e ) {} 
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
