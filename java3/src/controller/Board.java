package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class Board implements Initializable {

    @FXML
    private TableView<?> boardtable;

    @FXML
    private Button btnwrite;

    @FXML
    void accwrite(ActionEvent event) {
    	Main.main.loadpage("/view/boardwrite.fxml");
    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
}
