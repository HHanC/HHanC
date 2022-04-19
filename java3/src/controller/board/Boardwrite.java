package controller.board;

import java.net.URL;
import java.util.ResourceBundle;

import controller.Main;
import dao.BoardDao;
import dto.Board;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Boardwrite implements Initializable {

    @FXML
    private Button btnwrite;

    @FXML
    private TextField txttitle;

    @FXML
    private TextArea txtcontent;

    @FXML
    private Button btnback;

    @FXML
    private TextField twrite;

    @FXML
    private TextField tpw;

    @FXML
    void back(ActionEvent event) {
    	Main.main.loadpage("/view/board.fxml");
    }

    @FXML
    void write(ActionEvent event) {
    	String title = txttitle.getText();
    	String content = txtcontent.getText();
    	String write = twrite.getText();
    	String pw = tpw.getText();
    	
    	Board board = new Board(0, title, content, write, null, pw);
    	
    	boolean result = BoardDao.boardDao.write(board);
    	
    	if(result) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("게시글이 작성 되었습니다.");
    		alert.showAndWait();
    		Main.main.loadpage("/view/board.fxml");
    	}else {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("게시글이 작성 실패.");
    		alert.showAndWait();
    	}
    	
    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
}
