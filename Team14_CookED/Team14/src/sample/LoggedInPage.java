package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;


import java.net.URL;
import java.util.ResourceBundle;

public class LoggedInPage implements Initializable {
    @FXML
    private Button button_logout;
    @FXML
    private Label welcomeMessage;
    @FXML
    private Label friendsL;
    @FXML
    private Label recipesL;
    @FXML
    private ListView friendlist;
    @FXML
    private MenuItem italian;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        button_logout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DBUtils.changeScene(actionEvent,"sample.fxml","Login",null);
            }
        });
    }
    public void setUserInformation(String username,int recipes,int friends){
        welcomeMessage.setText("Welcome "+username+"!");
        recipesL.setText("Recipes: "+ recipes);
        friendsL.setText("Friends: "+ friends);
        friendlist.getItems().add("Friends:");
    }


}
