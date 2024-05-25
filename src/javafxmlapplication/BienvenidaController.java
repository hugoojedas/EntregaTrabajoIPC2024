package javafxmlapplication;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class BienvenidaController {

    @FXML private Button botonRegistrarse;
    @FXML private Button botonIniciarSesion;

    @FXML
    private void initialize() {
        botonRegistrarse.setOnAction(event -> showRegistroScreen());
        botonIniciarSesion.setOnAction(event -> showLoginScreen());
    }

    private void showRegistroScreen() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Registro.fxml"));
            Pane registroPane = loader.load();
            Scene registroScene = new Scene(registroPane);
            Stage stage = (Stage) botonRegistrarse.getScene().getWindow();
            stage.setScene(registroScene);
            stage.setTitle("Registro");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showLoginScreen() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Login.fxml"));
            Pane loginPane = loader.load();
            Scene loginScene = new Scene(loginPane);
            Stage stage = (Stage) botonIniciarSesion.getScene().getWindow();
            stage.setScene(loginScene);
            stage.setTitle("Iniciar Sesión");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
