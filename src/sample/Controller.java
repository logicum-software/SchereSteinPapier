package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    public Button buttonSchere;
    public Button buttonStein;
    public Button buttonPapier;
    public Label labelComputer;

    private SpielLogik myLogic = new SpielLogik();

    public void handleButtonSchere(ActionEvent actionEvent) {

        labelComputer.setText(myLogic.zugComputer());
    }

    public void handleButtonStein(ActionEvent actionEvent) {
        labelComputer.setText(myLogic.zugComputer());
    }

    public void handleButtonPapier(ActionEvent actionEvent) {
        labelComputer.setText(myLogic.zugComputer());
    }
}
