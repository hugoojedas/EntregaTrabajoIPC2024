package javafxmlapplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class GastosController {

    @FXML private TableView<Gasto> tablaGastos;
    @FXML private TableColumn<Gasto, Double> columnaImporte;
    @FXML private TableColumn<Gasto, String> columnaFecha;
    @FXML private TableColumn<Gasto, String> columnaNombre;
    @FXML private TableColumn<Gasto, String> columnaDescripcion;

    private ObservableList<Gasto> listaGastos;

    @FXML
    private void initialize() {
        listaGastos = FXCollections.observableArrayList();

        columnaImporte.setCellValueFactory(new PropertyValueFactory<>("importe"));
        columnaFecha.setCellValueFactory(new PropertyValueFactory<>("fecha"));
        columnaNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        columnaDescripcion.setCellValueFactory(new PropertyValueFactory<>("descripcion"));

        tablaGastos.setItems(listaGastos);
    }

    @FXML
    private void handleAñadirGasto() {
        // Lógica para añadir un nuevo gasto
    }

    @FXML
    private void handleActualizarGasto() {
        // Lógica para actualizar el gasto seleccionado
    }

    @FXML
    private void handleEliminarGasto() {
        // Lógica para eliminar el gasto seleccionado
    }

    @FXML
    private void handleImprimirEstadoCuenta() {
        // Lógica para imprimir el estado de cuenta
    }

    @FXML
    private void handleVolver() {
        // Lógica para volver a la pantalla anterior
    }

    private static class Gasto {

        public Gasto() {
        }
    }
}
