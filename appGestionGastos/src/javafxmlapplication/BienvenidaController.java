package javafxmlapplication;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class BienvenidaController {

    @FXML
    private Button botonRegistrarse;

    @FXML
    private Button botonIniciarSesion;

    private JavaFXMLApplication javaFXMLApplication;

    public void setJavaFXMLApplication(JavaFXMLApplication javaFXMLApplication) {
        this.javaFXMLApplication = javaFXMLApplication;
    }

    @FXML
    private void initialize() {
        botonRegistrarse.setOnAction(e -> {
            try {
                javaFXMLApplication.mostrarPantallaRegistro();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        botonIniciarSesion.setOnAction(e -> {
            try {
                javaFXMLApplication.mostrarPantallaInicioSesion();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }
}

