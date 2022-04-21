package controller.board;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import controller.Main;
import dao.BoardDao;
import dto.Replys;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Boardview implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		txtwrite.setText(Board.board.getNwrite());
		txtpassword.setText(Board.board.getNpassword());
		txttitle.setText(Board.board.getNtitle());
		txtcontent.setText(Board.board.getNcontent());
		replystableshow();
	}

    @FXML
    private Button btnrewrite;

    @FXML
    private TextField txttitle;

    @FXML
    private TextArea txtcontent;

    @FXML
    private Button btnback;

    @FXML
    private Button btndelete;

    @FXML
    private Button btnupdate;

    @FXML
    private TextArea txtrecontent;

    @FXML
    private TableView<Replys> replytable;

    public void replystableshow() {
    	int nnum = controller.board.Board.board.getNnum();
    	System.out.println(nnum);
    	ObservableList<Replys> replyslist = BoardDao.boardDao.replyslist(nnum);
    	TableColumn tc = replytable.getColumns().get(0);
    	tc.setCellValueFactory(new PropertyValueFactory<>("rnum"));
    	
    	tc = replytable.getColumns().get(1);
    	tc.setCellValueFactory(new PropertyValueFactory<>("rwrite"));
    	
    	tc = replytable.getColumns().get(2);
    	tc.setCellValueFactory(new PropertyValueFactory<>("rdate"));
    	
    	tc = replytable.getColumns().get(3);
    	tc.setCellValueFactory(new PropertyValueFactory<>("rcontent"));
    	replytable.setItems(replyslist);
    }
    
    @FXML
    private TextField txtwrite;

    @FXML
    private TextField txtpassword;

    @FXML
    void back(ActionEvent event) {
    	Main.main.loadpage("/view/board.fxml");
    }

    @FXML
    void delete(ActionEvent event) {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    		alert.setHeaderText("해당 게시물 삭제할까요?");
    	Optional<ButtonType> optional = alert.showAndWait();
    	if(optional.get() == ButtonType.OK) {
    		BoardDao.boardDao.delete(controller.board.Board.board.getNnum());
    		Main.main.loadpage("/view/board.fxml");
    	}
    }

    @FXML
    void rewrite(ActionEvent event) {
    	String rcontent = txtrecontent.getText();
    	int nnum = controller.board.Board.board.getNnum();
    	String rwrite = txtwrite.getText();
    	Replys replys = new Replys(0, rcontent, rwrite, null, nnum);
    	boolean result = BoardDao.boardDao.rwrite(replys);
    	if(result) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    			alert.setHeaderText("댓글 등록 성공");
    		alert.showAndWait();
    		replystableshow();
    	}
    }

    boolean upcheck = true;
    @FXML
    void update(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
    	if(upcheck) {
    		alert.setHeaderText("게시글 수정후 수정 완료 버튼을 눌러주세요");
    		alert.showAndWait();
    		txttitle.setEditable(true);
    		txtrecontent.setEditable(true);
    		btnupdate.setText("수정완료");
    		upcheck = false;
    	}else {
    		BoardDao.boardDao.update(
    				controller.board.Board.board.getNnum(), 
    				txttitle.getText(), 
    				txtcontent.getText());
    		
    		alert.setHeaderText("수정이 완료 되었습니다.");
    		alert.showAndWait();
    		txttitle.setEditable(false);
    		txtrecontent.setEditable(false);
    		btnupdate.setText("수정");
    		upcheck = true;
    		Main.main.loadpage("/view/board.fxml");
    	}
    }
	
    
    
}













