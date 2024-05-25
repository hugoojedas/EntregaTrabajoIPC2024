package javafxmlapplication;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.event.ActionEvent;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.Modality;

public class GastosController {

    @FXML private TableView<Gasto> gastosTable;
    @FXML private TableColumn<Gasto, Double> importeColumn;
    @FXML private TableColumn<Gasto, String> fechaColumn;
    @FXML private TableColumn<Gasto, String> nombreColumn;
    @FXML private TableColumn<Gasto, String> descripcionColumn;
    @FXML
    private Button addGastoButton;
    @FXML
    private Button updateGastoButton;
    @FXML
    private Button deleteGastoButton;
    @FXML
    private Button printReportButton;
    @FXML
    private Button volverButton;
    
    private void initialize() {
        // Configurar las columnas de la tabla
        importeColumn.setCellValueFactory(new PropertyValueFactory<>("importe"));
        fechaColumn.setCellValueFactory(new PropertyValueFactory<>("fecha"));
        nombreColumn.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        descripcionColumn.setCellValueFactory(new PropertyValueFactory<>("descripcion"));
        
        // Añadir datos de ejemplo (puedes eliminar esto después)
        gastosTable.setItems(getGastosDeEjemplo());
    }

    // Método para obtener una lista de gastos de ejemplo
    private ObservableList<Gasto> getGastosDeEjemplo() {
        ObservableList<Gasto> gastos = FXCollections.observableArrayList();
        gastos.add(new Gasto(50.0, "2024-05-01", "Compra supermercado", "Compra semanal en el supermercado"));
        gastos.add(new Gasto(20.0, "2024-05-02", "Cena restaurante", "Cena en un restaurante italiano"));
        return gastos;
    }

    @FXML
    private void handleAddGasto(ActionEvent event)throws IOException {
        // Implementa la lógica para añadir un gasto
        FXMLLoader miCargador = new FXMLLoader(getClass().getResource("/AñadirGasto.fxml"));
        Stage stage = miCargador.load();  // el fxml contiene como raíz a un stage, lo puedes ver en el Scene Builder
        stage.setTitle("Añadir gasto");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
       
    }

    @FXML
    private void handleUpdateGasto() {
        // Implementa la lógica para actualizar un gasto
    }

    @FXML
    private void handleDeleteGasto() {
        // Implementa la lógica para eliminar un gasto
    }

    @FXML
    private void handlePrintReport() {
        // Implementa la lógica para imprimir el estado de cuenta
    }

    @FXML
    private void handleVolver() {
        // Implementa la lógica para volver a la pantalla anterior
    }

    // Clase interna para representar los datos de un gasto
    public static class Gasto {
        private Double importe;
        private String fecha;
        private String nombre;
        private String descripcion;

        public Gasto(Double importe, String fecha, String nombre, String descripcion) {
            this.importe = importe;
            this.fecha = fecha;
            this.nombre = nombre;
            this.descripcion = descripcion;
        }

        public Double getImporte() { return importe; }
        public void setImporte(Double importe) { this.importe = importe; }

        public String getFecha() { return fecha; }
        public void setFecha(String fecha) { this.fecha = fecha; }

        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }

        public String getDescripcion() { return descripcion; }
        public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    }
}
