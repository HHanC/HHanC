package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Start extends Application {

	@Override
	public void start(Stage start) throws Exception {
		
		Parent parent = FXMLLoader.load(getClass().getResource("/view/main.fxml"));
		Scene scene = new Scene(parent);
		start.setScene(scene);
		Image image = new Image("/img/게시판로고.jpg");
		start.getIcons().add(image);
		start.setResizable(false);
		start.setTitle("비회원 게시판");
		start.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}
