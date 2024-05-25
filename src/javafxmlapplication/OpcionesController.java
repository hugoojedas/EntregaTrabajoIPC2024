package javafxmlapplication;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;


public class OpcionesController {

    @FXML private ImageView monedasIcon;
    @FXML private ImageView perfilIcon;
    @FXML private ImageView cerrarSesionIcon;

    @FXML
    public void initialize() {
        monedasIcon.setImage(new Image(getClass().getResourceAsStream("/icons/coins.png")));
        perfilIcon.setImage(new Image(getClass().getResourceAsStream("/icons/user.png")));
        cerrarSesionIcon.setImage(new Image(getClass().getResourceAsStream("/icons/logout.png")));
    }
}
