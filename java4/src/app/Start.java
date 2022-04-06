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
		
		// 5. �����̳� �ҷ�����
		Parent parent = FXMLLoader.load(getClass().getResource("/view/main.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		
		// 3. �������� �ΰ� ����
			// 1. �̹����ҷ�����
			Image image = new Image("/img/stagelogo.jpg");
				// ������ vs �����
				// ������ : �����
				// ����� : �� ��ġ ���� ���
			// 2. �������� ����
			
		stage.getIcons().add(image);
		stage.setResizable(false); // ũ�⺯�� �ȉ�
		stage.setTitle("��������"); // 2. �������� â �̸�
		stage.show(); // 1. �������� ����
		
	}
	
	public static void main(String[] args) {
		
		launch(args);
		
	}
	
}
