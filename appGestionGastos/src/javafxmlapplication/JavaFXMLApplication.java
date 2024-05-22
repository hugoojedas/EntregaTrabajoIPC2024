package javafxmlapplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXMLApplication extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        mostrarPantallaBienvenida();
    }

    public void mostrarPantallaBienvenida() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Bienvenida.fxml"));
        VBox root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Pantalla de Bienvenida");
        primaryStage.show();
    }

    public void mostrarPantallaRegistro() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Registro.fxml"));
        VBox root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Pantalla de Registro");
    }

    public void mostrarPantallaInicioSesion() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Login.fxml"));
        VBox root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Pantalla de Inicio de Sesión");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
