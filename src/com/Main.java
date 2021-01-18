package com;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Jacek Byzdra email: jacekbwwa@gmail.com
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        startGame(primaryStage);

    }

    private void cleanup() {
        Model model = new Model();
        //model.addCellAndNameToCellArr();
    }

    public void restart(Stage stage) {
        cleanup();
        startGame(stage);
    }

    private void startGame(Stage stage) {

        FXML1Controller fxml1Controller = new FXML1Controller();
        fxml1Controller.anchorPaneOuter = new AnchorPane();
        fxml1Controller.addControls();
        Scene scene = new Scene(fxml1Controller.anchorPaneOuter, 800, 600);
        stage.setScene(scene);
        fxml1Controller.setMainApp(this);
        fxml1Controller.restartButton.setOnAction(e -> restart(stage));
        stage.show();

    }

    public static void main(String args[]) {
        launch(args);

    }

}
