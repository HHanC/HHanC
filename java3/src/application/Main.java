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
		
		// 1. fxml ���� �����̳� �ۼ��� ������ ��ü�� ȣ�� 
		try { // �Ϲ������� �ܺ����� �������ų� // �ܺ� ����Ҷ� ������ ���ܹ߻�
			Parent parent = FXMLLoader.load(getClass().getResource("����.fxml") );
			
			Scene scene = new Scene(parent);
		
			primaryStage.setScene(scene);
			
			primaryStage.show();
			
			
			
		}catch( Exception e ) {} 
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
