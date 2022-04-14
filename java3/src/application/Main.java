package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;


public class Main extends Application {
	
	public static Main main;
	
	public Main() {main = this;}
	
	@Override
	public void start(Stage stage) throws Exception {
		
		Parent parent = FXMLLoader.load(getClass().getResource("/view/main.fxml")); // 5. fxml ����[�����̳�] �ҷ�����
		Scene scene = new Scene(parent); // 6. �� ��ü -> �����̳�
		stage.setScene(scene); // 7. �� -> ��������
		
		Image image = new Image("/img/�Խ��Ƿΰ�.jpg"); // 3. �������� �ΰ� ����
		stage.getIcons().add(image); // �������� ������ ����
		stage.setResizable(false); // 4. �������� ũ�� ���� �Ұ�
		stage.setTitle("��ȸ�� �Խ���"); // 2. �������� â �̸�
		stage.show(); // 1. �������� ����
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
