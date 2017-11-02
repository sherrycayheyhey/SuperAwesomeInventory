package superawesomeinventory.View_Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class AddPartScreenController {

    @FXML
    private RadioButton inhouseRadio;

    @FXML
    private ToggleGroup InOut;

    @FXML
    private RadioButton outsourcedRadio;

    @FXML
    private Label companyMachineLabel;

    @FXML
    private TextField nameField;

    @FXML
    private TextField idField;

    @FXML
    private TextField invField;

    @FXML
    private TextField priceField;

    @FXML
    private TextField minField;

    @FXML
    private TextField maxField;

    @FXML
    private TextField companyMachineField;

    @FXML
    private Button saveButton;

    @FXML
    private Button cancelButton;

    @FXML
    public void cancelButtonClicked(ActionEvent e) {
        System.out.println("cancel button clicked");   
    }

    @FXML
    public void saveButtonClicked(ActionEvent f) {
        System.out.println("save button clicked");
    }
    
    
    

}
