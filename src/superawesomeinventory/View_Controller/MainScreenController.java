/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superawesomeinventory.View_Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author S
 */
public class MainScreenController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
  
 //button handler methods for the "parts" buttons
 @FXML
 private void searchParts(ActionEvent event) {
     // Button was clicked, do something...
 }
 
 @FXML
 private void addPart(ActionEvent event) {
     // Button was clicked, do something...
     //open the AddPartScreen
     System.out.println("save button clicked");
 }
 
 @FXML
 private void modifyPart(ActionEvent event) {
     // Button was clicked, do something...
     //Open the ModifyPartScreen
 }
 
 @FXML
 private void deletePart(ActionEvent event) {
     // Button was clicked, do something...
 }
 
 //button handler methods for the "products" buttons
 @FXML
 private void searchProducts(ActionEvent event) {
     // Button was clicked, do something...
 }
 
 @FXML
 private void addProduct(ActionEvent event) {
     // Button was clicked, do something...
     //open the AddProductsScreen
 }
 
 @FXML
 private void modifyProduct(ActionEvent event) {
     // Button was clicked, do something...
     //Open the ModifyProductsScreen
 }
 
 @FXML
 private void deleteProduct(ActionEvent event) {
     // Button was clicked, do something...
 }
 
 
    
}
