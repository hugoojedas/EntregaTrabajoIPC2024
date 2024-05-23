package javafxmlapplication;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JavaFXMLApplication extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        showWelcomeScreen();
    }

    private void showWelcomeScreen() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Bienvenida.fxml"));
        Pane root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Pantalla de Bienvenida");
        primaryStage.show();

        // Obtén los botones y define sus acciones
        root.lookup("#botonRegistrarse").setOnMouseClicked(event -> showRegistroScreen());
        root.lookup("#botonIniciarSesion").setOnMouseClicked(event -> showLoginScreen());
    }

    private void showRegistroScreen() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Registro.fxml"));
            Pane registroPane = loader.load();
            Scene registroScene = new Scene(registroPane);
            primaryStage.setScene(registroScene);
            primaryStage.setTitle("Registro");
        } catch (IOException e) {
        }
    }

    private void showLoginScreen() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Login.fxml"));
            Pane loginPane = loader.load();
            Scene loginScene = new Scene(loginPane);
            primaryStage.setScene(loginScene);
            primaryStage.setTitle("Iniciar Sesión");
        } catch (IOException e) {
        }
    }

    private void showOpcionesScreen() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/opciones.fxml"));
            Pane opcionesPane = loader.load();
            Scene opcionesScene = new Scene(opcionesPane);
            primaryStage.setScene(opcionesScene);
            primaryStage.setTitle("¿Qué quieres hacer?");
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
