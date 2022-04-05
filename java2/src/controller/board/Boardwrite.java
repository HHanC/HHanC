package controller.board;


import java.net.URL;
import java.util.ResourceBundle;

import controller.home.Home;
import controller.login.Login;
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
    void back(ActionEvent event) {
    	Home.home.loadpage("/viw/board/board.fxml");
    }
    	
    @FXML
    void write(ActionEvent event) {
    	// 1. 컨트롤에 입력된 데이터 가져오기
    	String title = txttitle.getText(); // 해당 fxid객체에서 입력된 내용을 가져오기
    	String content = txtcontent.getText();
    	String write = Login.member.getMid();
    	// 2. 객체화
    	Board board = new Board(0, title, content, write, null, 0);
    	// 3. db저장
    	
    	boolean result =  BoardDao.boardDao.write(board);
    	if(result) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("게시글에 작성 되었습니다.");
    		alert.show();
    		Home.home.loadpage("/view/board/board.fxml");
    	}else {
    		
    	}
    }
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	// TODO Auto-generated method stub
    	
    }
    
    
	
}
