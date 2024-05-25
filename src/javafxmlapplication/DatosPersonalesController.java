package javafxmlapplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DatosPersonalesController {

    @FXML private Label nombreActualLabel;
    @FXML private Label contrasenaActualLabel;
    @FXML private Label correoActualLabel;
    
    @FXML private TextField nuevoNombreTextField;
    @FXML private TextField nuevaContrasenaTextField;
    @FXML private TextField nuevoCorreoTextField;

    @FXML private Button updateDataButton;
    @FXML private Button saveDataButton;

    @FXML
    private void initialize() {
        // Supongamos que obtienes los datos del usuario desde la base de datos o alguna fuente de datos
        String nombreActual = "Nombre de Ejemplo";
        String contrasenaActual = "********";
        String correoActual = "ejemplo@correo.com";

        nombreActualLabel.setText(nombreActual);
        contrasenaActualLabel.setText(contrasenaActual);
        correoActualLabel.setText(correoActual);
    }

    @FXML
    private void handleUpdateData() {
        nuevoNombreTextField.setDisable(false);
        nuevaContrasenaTextField.setDisable(false);
        nuevoCorreoTextField.setDisable(false);
        saveDataButton.setDisable(false);
    }

    @FXML
    private void handleSaveData() {
        String nuevoNombre = nuevoNombreTextField.getText();
        String nuevaContrasena = nuevaContrasenaTextField.getText();
        String nuevoCorreo = nuevoCorreoTextField.getText();

        // Aquí puedes añadir la lógica para guardar los nuevos datos en la base de datos
        // Después de guardar los datos, actualiza las etiquetas y desactiva los campos de texto
        nombreActualLabel.setText(nuevoNombre);
        contrasenaActualLabel.setText(nuevaContrasena);
        correoActualLabel.setText(nuevoCorreo);

        nuevoNombreTextField.setDisable(true);
        nuevaContrasenaTextField.setDisable(true);
        nuevoCorreoTextField.setDisable(true);
        saveDataButton.setDisable(true);
    }

    @FXML
    private void handleVolver() {
        // Implementa la lógica para volver a la pantalla anterior
    }
}
