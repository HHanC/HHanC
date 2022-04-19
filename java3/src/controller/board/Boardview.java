package controller.board;

import java.net.URL;
import java.sql.ResultSet;
import java.util.Optional;
import java.util.ResourceBundle;

import controller.Main;
import dao.BoardDao;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Boardview implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

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
    private TableView<?> replytable;

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
    		alert.setHeaderText("�ش� �Խù� �����ұ��?");
    	Optional<ButtonType> optional = alert.showAndWait();
    	if(optional.get() == ButtonType.OK) {
    		BoardDao.boardDao.delete(controller.board.Board.board.getNnum());
    		Main.main.loadpage("/view/board.fxml");
    	}
    }

    @FXML
    void rewrite(ActionEvent event) {

    }

    boolean upcheck = true;
    @FXML
    void update(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
    	if(upcheck) {
    		alert.setHeaderText("�Խñ� ������ ���� �Ϸ� ��ư�� �����ּ���");
    		alert.showAndWait();
    		txttitle.setEditable(true);
    		txtrecontent.setEditable(true);
    		btnupdate.setText("�����Ϸ�");
    		upcheck = false;
    	}else {
    		BoardDao.boardDao.update(
    				controller.board.Board.board.getNnum(), 
    				txttitle.getText(), 
    				txtcontent.getText());
    		
    		alert.setHeaderText("������ �Ϸ� �Ǿ����ϴ�.");
    		alert.showAndWait();
    		txttitle.setEditable(false);
    		txtrecontent.setEditable(false);
    		btnupdate.setText("����");
    		upcheck = true;
    	}
    }
	
    
    
}













