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
	public void start(Stage ��������) throws Exception {
		
		
		
		VBox �����̳� = new VBox(); // 1. �����̳ʸ� �����.
			// 2. ��Ʈ�� �����
			Button button = new Button();
			button.setText("�ݱ�");
			button.setOnAction(e -> Platform.exit()); // exit â�ݱ� // ���ٽ�?
		// 3. �����̳ʿ� ��Ʈ�� �ֱ�
		�����̳�.getChildren().add(button);
		// 4. �� �����
		Scene ��� = new Scene(�����̳�, 500, 500);
		// 5. ���������� �� �ֱ�
		��������.setScene(���);
		��������.show(); // �������� ����
		
	}
	
	public static void main(String[] args) {
		
		launch(args); // start�� �ҷ����°� launch
		
	}
	
}
