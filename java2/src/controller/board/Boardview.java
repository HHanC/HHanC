package controller.board;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import controller.home.Home;
import controller.login.Login;
import dao.BoardDao;
import dto.Board;
import dto.Reply;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Boardview implements Initializable {


    @FXML
    private TextField txttitle;

    @FXML
    private TextArea txtcontent;

    @FXML
    private Button btnback;

    @FXML
    private Button btnupdate;

    @FXML
    private Button btndelete;

    @FXML
    private TextArea txtrecontent;

    @FXML
    private Button btnrewrite;

    @FXML
    private TableView<Reply> replytable;

    @FXML
    private Label lblview;

    @FXML
    private Label lbldate;

    @FXML
    private Label lblwrite;
    
    public void replytableshow() {
    	int bnum = controller.board.Board.board.getBnum();
    	ObservableList<Reply> replylist = BoardDao.boardDao.replylist(bnum);
    
    	TableColumn tc = replytable.getColumns().get(0);
    	tc.setCellValueFactory( new PropertyValueFactory<>("rnum"));
    	
    	tc = replytable.getColumns().get(1);
    	tc.setCellValueFactory( new PropertyValueFactory<>("rwrite"));
    	
    	tc = replytable.getColumns().get(2);
    	tc.setCellValueFactory( new PropertyValueFactory<>("rdate"));
    	
    	tc = replytable.getColumns().get(3);
    	tc.setCellValueFactory( new PropertyValueFactory<>("rcontent"));
    	
    	replytable.setItems(replylist);
    	
    
    }
    

    @FXML
    void rewrite(ActionEvent event) {
    	
    	String rcontent =txtrecontent.getText();       
        String rwrite = Login.member.getMid();      
        int bnum = controller.board.Board.board.getBnum();     
        Reply reply = new Reply(0, rcontent, rwrite, null, bnum);       
        boolean result=BoardDao.boardDao.rwrite(reply);        
        if(result) {        	
        	Alert alert = new Alert(AlertType.INFORMATION);
        	alert.setHeaderText("작성완료!");
        	alert.showAndWait();
        	txtrecontent.setText("");
        	replytableshow();
        }   	    	
    }       
    @FXML
    void back(ActionEvent event) {

    	Home.home.loadpage("/view/board/board.fxml");
    	
    }

    @FXML
    void delete(ActionEvent event) {

    	// 1. 경고 메시지 알림
    	Alert alert = new Alert(AlertType.CONFIRMATION); // 확인 / 취소가 있는 버튼
    		alert.setHeaderText("해당 게시물 삭제할까요?");
    	Optional<ButtonType> optional = alert.showAndWait(); // showAndWait() 메소드의 반환타입 => 선택한 버튼
    	if(optional.get() == ButtonType.OK) { // 2. 확인 버튼 눌렀을때
    		// 3. 삭제 처리
    		BoardDao.boardDao.delete(controller.board.Board.board.getBnum());
    		Home.home.loadpage("/view/board/board.fxml");
    		
    	}
    	
    }

    boolean upcheck = true; // 수정 버튼 스위치 변수
    
    @FXML
    void update(ActionEvent event) {

    	Alert alert = new Alert(AlertType.CONFIRMATION); // 1. 메시지
    	
    	if(upcheck) {
	    	alert.setHeaderText("게시글 수정후 수정 완료 버튼 눌러주세요");
	    	alert.showAndWait();
	    	txttitle.setEditable(true);
	    	txtcontent.setEditable(true);
	    	btnupdate.setText("수정완료");
	    	upcheck = false;
    	}else { 
    		
    		BoardDao.boardDao.update(
    				controller.board.Board.board.getBnum(), 
    				txttitle.getText(), 
    				txtcontent.getText());
    		
    		alert.setHeaderText("수정이 완료 되었습니다.");
	    	alert.showAndWait();
	    	txttitle.setEditable(false);
	    	txtcontent.setEditable(false);
	    	btnupdate.setText("수정");
	    	upcheck = true;
    	}
    }
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		Board board = controller.board.Board.board;
		replytableshow();
		
		lblwrite.setText("작성자 : " + board.getBwrite());
		lbldate.setText("작성일 : " + board.getBdate());
		lblview.setText("조회수 : " + board.getBview());
		txttitle.setText(board.getBtitle());
		txtcontent.setText(board.getBcontent());
			
		if(!board.getBwrite().equals(Login.member.getMid())) {
			btndelete.setVisible(false);
			btnupdate.setVisible(false);
		}
		// 수정 금지
		txttitle.setEditable(false);
		txtcontent.setEditable(false);
	}
	
}










