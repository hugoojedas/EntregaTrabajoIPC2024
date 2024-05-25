package javafxmlapplication;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

public class LoginController {

    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton;

    @FXML
    public void initialize() {
        loginButton.setOnAction(event -> iniciarSesion());
    }

    private void iniciarSesion() {
        // Implementar la lógica de inicio de sesión
        System.out.println("Iniciando sesión con usuario: " + usernameField.getText());
    }
}
