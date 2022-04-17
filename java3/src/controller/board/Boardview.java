package controller.board;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import controller.Main;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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

    }

    @FXML
    void rewrite(ActionEvent event) {

    }

    @FXML
    void update(ActionEvent event) {

    }
	
    public void replytableshow() {
    	int nnum = controller.board.Board.board.getNnum();
    	
    }
    
}













