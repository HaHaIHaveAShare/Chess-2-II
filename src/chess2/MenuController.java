package chess2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import javafx.event.ActionEvent;
import java.io.File;
import java.net.URI;

public class MenuController {

    @FXML
    private Button startBtn;

    @FXML
    private Button joinBtn;
    
    @FXML
    private Button updateBtn;

    @FXML
    private Button pediaBtn;

    @FXML
    private Button creditsBtn;

    @FXML
    private Button winLossBtn;
    
    @FXML
    private TextField ipField;

    @FXML
    private TextField nameField;

    @FXML
    private Pane background;
    
    public void initialize ()  {
	background.setStyle("-fx-background-image:url('./chess2/images/start.png')");
    }
    
}
