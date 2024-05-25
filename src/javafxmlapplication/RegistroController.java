package javafxmlapplication;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RegistroController {

    @FXML
    private TextField nombreField;
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField profileImageField;
    @FXML
    private Button selectImageButton;
    @FXML
    private Button registrarButton;

    @FXML
    public void initialize() {
        registrarButton.setOnAction(event -> registrarUsuario());
        // Manejar evento de selección de imagen de perfil si es necesario
    }

    private void registrarUsuario() {
        // Implementar la lógica de registro de usuario
        System.out.println("Registrando usuario: " + usernameField.getText());
    }
}
