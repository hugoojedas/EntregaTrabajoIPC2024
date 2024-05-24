package javafxmlapplication;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class DatosPersonalesController {

    @FXML private TextField nuevoNombreField;
    @FXML private TextField nuevaContraseñaField;
    @FXML private TextField nuevoCorreoField;
    @FXML private Button actualizarDatosButton;
    @FXML private Button guardarDatosButton;

    @FXML
    private void initialize() {
        // Desactivar los campos de texto y el botón de guardar al inicio
        nuevoNombreField.setDisable(true);
        nuevaContraseñaField.setDisable(true);
        nuevoCorreoField.setDisable(true);
        guardarDatosButton.setDisable(true);
    }

    @FXML
    private void handleActualizarDatos() {
        // Activar los campos de texto y el botón de guardar
        nuevoNombreField.setDisable(false);
        nuevaContraseñaField.setDisable(false);
        nuevoCorreoField.setDisable(false);
        guardarDatosButton.setDisable(false);
    }

    @FXML
    private void handleGuardarDatos() {
        // Implementar la lógica para guardar los datos introducidos
        // Desactivar los campos de texto y el botón de guardar después de guardar los datos
        nuevoNombreField.setDisable(true);
        nuevaContraseñaField.setDisable(true);
        nuevoCorreoField.setDisable(true);
        guardarDatosButton.setDisable(true);
    }

    @FXML
    private void handleVolver() {
        // Implementar la lógica para volver a la pantalla anterior
    }
}
