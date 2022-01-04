package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class signup implements Initializable {
    @FXML
    private Button buttonSignUP;
    @FXML
    private Button buttonLogIn;
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        buttonSignUP.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(!username.getText().trim().isEmpty() && !password.getText().trim().isEmpty()){
                    DBUtils.signUpUser(actionEvent,username.getText(),password.getText());
                }
                else{
                    System.out.println("Please fill in all info!");
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Please fill in all information!");
                    alert.show();
                }
            }
        });
        buttonLogIn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DBUtils.changeScene(actionEvent,"sample.fxml","Log in!",null);
            }
        });

    }
}
