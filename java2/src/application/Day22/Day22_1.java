package application.Day22;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Day22_1 extends Application{
	
	@Override
	public void start(Stage 스테이지) throws Exception {
		Parent parent = FXMLLoader.load(getClass().getResource("DB테스트.fxml"));
		Scene scene = new Scene(parent);
		스테이지.setScene(scene);
		
		스테이지.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	
}
