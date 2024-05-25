/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafxmlapplication;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author 34622
 */
public class AñadirGastoController implements Initializable {

    @FXML
    private Stage stage;
    @FXML
    private TextField importeField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField descripciónField;
    @FXML
    private DatePicker dateField;
    
    private boolean pulsadoOK = false;

    /**
     * Initializes the controller class.
     */
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

        public boolean isOKPressed( ){
        return pulsadoOK;
    }
    @FXML
    private void aceptar(ActionEvent event) {
        
        pulsadoOK = true;
        importeField.getScene().getWindow().hide();
       
       
               
    }

    @FXML
    private void cancelar(ActionEvent event) {
        importeField.getScene().getWindow().hide();
    }
    
}
