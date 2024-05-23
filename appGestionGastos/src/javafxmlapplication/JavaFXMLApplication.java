package javafxmlapplication;

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

    private void showWelcomeScreen() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Bienvenida.fxml"));
            Pane root = loader.load();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Pantalla de Bienvenida");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showRegistroScreen() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Registro.fxml"));
            Pane registroPane = loader.load();
            Scene registroScene = new Scene(registroPane);
            primaryStage.setScene(registroScene);
            primaryStage.setTitle("Registro");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showLoginScreen() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Login.fxml"));
            Pane loginPane = loader.load();
            Scene loginScene = new Scene(loginPane);
            primaryStage.setScene(loginScene);
            primaryStage.setTitle("Iniciar Sesión");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showMainMenuScreen() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/opciones.fxml"));
            Pane mainMenuPane = loader.load();
            Scene mainMenuScene = new Scene(mainMenuPane);
            primaryStage.setScene(mainMenuScene);
            primaryStage.setTitle("¿Qué quieres hacer?");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showGastosScreen() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gastos.fxml"));
            Pane gastosPane = loader.load();
            Scene gastosScene = new Scene(gastosPane);
            primaryStage.setScene(gastosScene);
            primaryStage.setTitle("Gastos");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
