package application.Day22;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Day22_1 extends Application {

	@Override
	public void start(Stage ��������) throws Exception {
		
		// 1. �� �������� �ۼ��� ������ ��ü�� ��������
		Parent parent = FXMLLoader.load(getClass().getResource("DB�׽�Ʈ.fxml"));
		// 2. �� ��ü�� ���� 
		Scene scene = new Scene(parent);
		// 3. �� ��ü�� ���������� ����
		��������.setScene(scene);
		// 4. �������� ����
		��������.show();
		
	}
	// �޼ҵ� ����
	public static void main(String[] args) {
		launch(args);
	}
}
