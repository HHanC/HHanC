package application;

// javafx�� ���[ awt , swing ���� ���� X ]
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Day21_1 extends Application {
				// extends : ��� [ Application : JAVAFX ����Ŭ���� => start �޼ҵ� ���� ] 
					// ��ӹ����� ����Ŭ������ ����� ����Ҽ� �ִ�.
	@Override
	public void start( Stage �������� ) throws Exception {
		VBox �����̳� = new VBox();
			Button button = new Button();
			button.setText("�ݱ�");
			button.setOnAction( e -> Platform.exit() );
		�����̳�.getChildren().add(button);
		Scene ��� = new Scene( �����̳� , 500 , 500  );
		��������.setScene(���);
		��������.show();
	}
	
	public static void main(String[] args) { // ���ν�����
		launch(args); // start �޼ҵ� ȣ�� 
	}
	

}