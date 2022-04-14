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
		
		Parent parent = FXMLLoader.load(getClass().getResource("/view/main.fxml")); // 5. fxml 파일[컨테이너] 불러오기
		Scene scene = new Scene(parent); // 6. 씬 객체 -> 컨테이너
		stage.setScene(scene); // 7. 씬 -> 스테이지
		
		Image image = new Image("/img/게시판로고.jpg"); // 3. 스테이지 로고 설정
		stage.getIcons().add(image); // 스테이지 아이콘 설정
		stage.setResizable(false); // 4. 스테이지 크기 변경 불가
		stage.setTitle("비회원 게시판"); // 2. 스테이지 창 이름
		stage.show(); // 1. 스테이지 열기
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
