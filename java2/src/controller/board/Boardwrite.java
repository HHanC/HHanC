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
    	// 1. ��Ʈ�ѿ� �Էµ� ������ ��������
    	String title = txttitle.getText(); // �ش� fxid��ü���� �Էµ� ������ ��������
    	String content = txtcontent.getText();
    	String write = Login.member.getMid();
    	// 2. ��üȭ
    	Board board = new Board(0, title, content, write, null, 0);
    	// 3. db����
    	
    	boolean result =  BoardDao.boardDao.write(board);
    	if(result) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("�Խñۿ� �ۼ� �Ǿ����ϴ�.");
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
