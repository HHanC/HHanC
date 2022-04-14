package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class Nonmember implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
    @FXML
    private static AnchorPane AnchorPane;
	
    @FXML
    private Button btnwrite;

    @FXML
    void accwrite(ActionEvent event) {
    	
    }
    
    public void loadpage(String page) {
    	try {
    		
    		Parent parent = FXMLLoader.load(getClass().getResource(page));
    		
    		
    	}catch (Exception e) {}
    }	
}
