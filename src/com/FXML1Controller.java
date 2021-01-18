package com;

/*

  @author Jacek Byzdra email: jacekbwwa@gmail.com
 */
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import static javafx.scene.paint.Color.YELLOW;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/*
 * FXML Controller class
 *
 * @author Jacek Byzdra email: jacekbwwa@gmail.com
 */
class FXML1Controller {

    AnchorPane anchorPaneOuter;
    private AnchorPane firstInnerAnchorPane;
    private Label label;
    private GridPane gridPaneGame;
    private Button c00;
    private ImageView ImageView00;
    private Button c01;
    private ImageView ImageView01;
    private Button c02;
    private ImageView ImageView02;
    private Button c10;
    private ImageView ImageView10;
    private Button c11;
    private ImageView ImageView11;
    private Button c12;
    private ImageView ImageView12;
    private Button c20;
    private ImageView ImageView20;
    private Button c21;
    private ImageView ImageView21;
    private Button c22;
    private ImageView ImageView22;

    private AnchorPane anchorPaneInner;
    private GridPane gridPaneOptionLabel;
    private Label label0;
    private GridPane gridPanePlayersRB;
    private RadioButton K00;
    private RadioButton K01;
    private RadioButton K02;
    private RadioButton K10;
    private RadioButton K20;
    private RadioButton K03;
    private RadioButton K11;
    private RadioButton K12;
    private RadioButton K13;
    private RadioButton K21;
    private RadioButton K22;
    private RadioButton K23;
    private GridPane gridPaneRestart;
    Button restartButton;
    private Button newGameButton;
    private GridPane gridPaneInfoMove;
    private Label label00;
    private Label label10;
    private Label label20;
    private GridPane gridPaneCounter;
    private Label labelPlayer1;
    private Label labelPlayer2;
    private Label labelComp;
    private Label labelPlayer1Stats;
    private Label labelPlayer2Stats;
    private Label labelCompStats;
    private GridPane gridPaneLabelStats;
    private Label labelGameStats;
    private Main mainApplication;
    private Model model;
    private Image image;
    private String returnPlayerSign;
    private Stage stage;

    public FXML1Controller() {
        this.model = new Model();

    }

    void setMainApp(Main mainApplication) {
        this.mainApplication = mainApplication;
    }

    private void setLabeInFirstInnerAnchorPane() {
        label = new Label();
        label.setPrefHeight(150.0);
        label.setPrefWidth(175.0);
        label.getStylesheets().add("/style/fxml1.css");
        label.setText("Game Tic-Tac-Toe creator: Jacek Byzdra jacekbwwa@gmail.com ");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#28ff00"));
        label.setWrapText(true);
    }

    private void setFirstInnerAnchorPane() {
        firstInnerAnchorPane = new AnchorPane();
        AnchorPane.setRightAnchor(firstInnerAnchorPane, 30.0);
        AnchorPane.setTopAnchor(firstInnerAnchorPane, 275.0);
        firstInnerAnchorPane.setPrefHeight(150.0);
        firstInnerAnchorPane.setPrefWidth(175.0);
        firstInnerAnchorPane.getChildren().add(label);
        AnchorPane.setBottomAnchor(label, 0.0);
        AnchorPane.setLeftAnchor(label, 0.0);
        AnchorPane.setRightAnchor(label, 0.0);
        AnchorPane.setTopAnchor(label, 0.0);
    }

    private void setImageView00() {
        ImageView00 = new ImageView();
        ImageView00.setFitHeight(50.0);
        ImageView00.setFitWidth(50.0);
        ImageView00.setNodeOrientation(javafx.geometry.NodeOrientation.INHERIT);
        ImageView00.setPickOnBounds(true);
        ImageView00.setPreserveRatio(true);
    }

    private void setC00Button() {
        c00 = new Button();
        c00.setId("c00");
        c00.setMnemonicParsing(false);
        c00.setPrefHeight(70.0);
        c00.setPrefWidth(70.0);
        c00.setGraphic(ImageView00);
    }

    private void setImageView01() {
        ImageView01 = new ImageView();
        ImageView01.setFitHeight(50.0);
        ImageView01.setFitWidth(50.0);
        ImageView01.setNodeOrientation(javafx.geometry.NodeOrientation.INHERIT);
        ImageView01.setPickOnBounds(true);
        ImageView01.setPreserveRatio(true);
    }

    private void setC01Button() {
        c01 = new Button();
        c01.setId("c01");
        c01.setLayoutX(10.0);
        c01.setLayoutY(10.0);
        c01.setMnemonicParsing(false);
        c01.setPrefHeight(70.0);
        c01.setPrefWidth(70.0);
        c01.setGraphic(ImageView01);
    }

    private void setImageView02() {
        ImageView02 = new ImageView();
        ImageView02.setFitHeight(50.0);
        ImageView02.setFitWidth(50.0);
        ImageView02.setNodeOrientation(javafx.geometry.NodeOrientation.INHERIT);
        ImageView02.setPickOnBounds(true);
        ImageView02.setPreserveRatio(true);
    }

    private void setC02Button() {
        c02 = new Button();
        c02.setId("c02");
        c02.setLayoutX(144.0);
        c02.setLayoutY(10.0);
        c02.setMnemonicParsing(false);
        c02.setPrefHeight(70.0);
        c02.setPrefWidth(70.0);
        c02.setGraphic(ImageView02);
    }

    private void setImageView10() {
        ImageView10 = new ImageView();
        ImageView10.setFitHeight(50.0);
        ImageView10.setFitWidth(50.0);
        ImageView10.setNodeOrientation(javafx.geometry.NodeOrientation.INHERIT);
        ImageView10.setPickOnBounds(true);
        ImageView10.setPreserveRatio(true);
    }

    private void setC10Button() {
        c10 = new Button();
        c10.setId("c10");
        c10.setLayoutX(277.0);
        c10.setLayoutY(10.0);
        c10.setMnemonicParsing(false);
        c10.setPrefHeight(70.0);
        c10.setPrefWidth(70.0);
        c10.setGraphic(ImageView10);
    }

    private void setImageView11() {
        ImageView11 = new ImageView();
        ImageView11.setFitHeight(50.0);
        ImageView11.setFitWidth(50.0);
        ImageView11.setNodeOrientation(javafx.geometry.NodeOrientation.INHERIT);
        ImageView11.setPickOnBounds(true);
        ImageView11.setPreserveRatio(true);
    }

    private void setC11Button() {
        c11 = new Button();
        c11.setId("c11");
        c11.setLayoutX(10.0);
        c11.setLayoutY(110.0);
        c11.setMnemonicParsing(false);
        c11.setPrefHeight(70.0);
        c11.setPrefWidth(70.0);
        c11.setGraphic(ImageView11);
    }

    private void setImageView12() {
        ImageView12 = new ImageView();
        ImageView12.setFitHeight(50.0);
        ImageView12.setFitWidth(50.0);
        ImageView12.setNodeOrientation(javafx.geometry.NodeOrientation.INHERIT);
        ImageView12.setPickOnBounds(true);
        ImageView12.setPreserveRatio(true);
    }

    private void setC12Button() {
        c12 = new Button();
        c12.setId("c12");
        c12.setLayoutX(144.0);
        c12.setLayoutY(110.0);
        c12.setMnemonicParsing(false);
        c12.setPrefHeight(70.0);
        c12.setPrefWidth(70.0);
        c12.setGraphic(ImageView12);
    }

    private void setImageView20() {
        ImageView20 = new ImageView();
        ImageView20.setFitHeight(50.0);
        ImageView20.setFitWidth(50.0);
        ImageView20.setNodeOrientation(javafx.geometry.NodeOrientation.INHERIT);
        ImageView20.setPickOnBounds(true);
        ImageView20.setPreserveRatio(true);
    }

    private void setC20Button() {
        c20 = new Button();
        c20.setId("c20");
        c20.setLayoutX(277.0);
        c20.setLayoutY(110.0);
        c20.setMnemonicParsing(false);
        c20.setPrefHeight(70.0);
        c20.setPrefWidth(70.0);
        c20.setGraphic(ImageView20);
    }

    private void setImageView21() {
        ImageView21 = new ImageView();
        ImageView21.setFitHeight(50.0);
        ImageView21.setFitWidth(50.0);
        ImageView21.setNodeOrientation(javafx.geometry.NodeOrientation.INHERIT);
        ImageView21.setPickOnBounds(true);
        ImageView21.setPreserveRatio(true);
    }

    private void setC21Button() {
        c21 = new Button();
        c21.setId("c21");
        c21.setLayoutX(10.0);
        c21.setLayoutY(210.0);
        c21.setMnemonicParsing(false);
        c21.setPrefHeight(70.0);
        c21.setPrefWidth(70.0);
        c21.setGraphic(ImageView21);
    }

    private void setImageView22() {
        ImageView22 = new ImageView();
        ImageView22.setFitHeight(50.0);
        ImageView22.setFitWidth(50.0);
        ImageView22.setNodeOrientation(javafx.geometry.NodeOrientation.INHERIT);
        ImageView22.setPickOnBounds(true);
        ImageView22.setPreserveRatio(true);
    }

    private void setC22Button() {
        c22 = new Button();
        c22.setId("c22");
        c22.setLayoutX(144.0);
        c22.setLayoutY(210.0);
        c22.setMnemonicParsing(false);
        c22.setPrefHeight(70.0);
        c22.setPrefWidth(70.0);
        c22.setGraphic(ImageView22);
    }

    private void setGridPaneGame() {
        gridPaneGame = new GridPane();
        gridPaneGame.setMaxHeight(300.0);
        gridPaneGame.setMaxWidth(375.0);
        gridPaneGame.setPrefHeight(300.0);
        gridPaneGame.setPrefWidth(375.0);

        ColumnConstraints columnConstraints = new ColumnConstraints();
        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(70.0);

        ColumnConstraints columnConstraints0 = new ColumnConstraints();
        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(70.0);

        ColumnConstraints columnConstraints1 = new ColumnConstraints();
        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(70.0);

        RowConstraints rowConstraints = new RowConstraints();
        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(70.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        RowConstraints rowConstraints0 = new RowConstraints();
        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(70.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        RowConstraints rowConstraints1 = new RowConstraints();
        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(70.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        gridPaneGame.getColumnConstraints().add(columnConstraints);
        gridPaneGame.getColumnConstraints().add(columnConstraints0);
        gridPaneGame.getColumnConstraints().add(columnConstraints1);
        gridPaneGame.getRowConstraints().add(rowConstraints);
        gridPaneGame.getRowConstraints().add(rowConstraints0);
        gridPaneGame.getRowConstraints().add(rowConstraints1);

        gridPaneGame.getChildren().add(c00);
        gridPaneGame.getChildren().add(c01);
        gridPaneGame.getChildren().add(c02);
        gridPaneGame.getChildren().add(c10);
        gridPaneGame.getChildren().add(c11);
        gridPaneGame.getChildren().add(c12);
        gridPaneGame.getChildren().add(c20);
        gridPaneGame.getChildren().add(c21);
        gridPaneGame.getChildren().add(c22);

        GridPane.setHalignment(c00, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(c00, javafx.geometry.VPos.CENTER);
        GridPane.setMargin(c00, new Insets(3.0));

        GridPane.setColumnIndex(c01, 1);
        GridPane.setHalignment(c01, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(c01, javafx.geometry.VPos.CENTER);
        GridPane.setMargin(c01, new Insets(3.0));

        GridPane.setColumnIndex(c02, 2);
        GridPane.setHalignment(c02, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(c02, javafx.geometry.VPos.CENTER);
        GridPane.setMargin(c02, new Insets(3.0));

        GridPane.setHalignment(c10, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(c10, 1);
        GridPane.setValignment(c10, javafx.geometry.VPos.CENTER);
        GridPane.setMargin(c10, new Insets(3.0));

        GridPane.setColumnIndex(c11, 1);
        GridPane.setHalignment(c11, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(c11, 1);
        GridPane.setValignment(c11, javafx.geometry.VPos.CENTER);
        GridPane.setMargin(c11, new Insets(3.0));

        GridPane.setColumnIndex(c12, 2);
        GridPane.setHalignment(c12, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(c12, 1);
        GridPane.setValignment(c12, javafx.geometry.VPos.CENTER);
        GridPane.setMargin(c12, new Insets(3.0));

        GridPane.setHalignment(c20, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(c20, 2);
        GridPane.setValignment(c20, javafx.geometry.VPos.CENTER);
        GridPane.setMargin(c20, new Insets(3.0));

        GridPane.setColumnIndex(c21, 1);
        GridPane.setHalignment(c21, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(c21, 2);
        GridPane.setValignment(c21, javafx.geometry.VPos.CENTER);
        GridPane.setMargin(c21, new Insets(3.0));

        GridPane.setColumnIndex(c22, 2);
        GridPane.setHalignment(c22, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(c22, 2);
        GridPane.setValignment(c22, javafx.geometry.VPos.CENTER);
        GridPane.setMargin(c22, new Insets(3.0));

    }

    private void setSecondInnerAnchorPane() {
        anchorPaneInner = new AnchorPane();
        AnchorPane.setLeftAnchor(anchorPaneInner, 125.0);
        AnchorPane.setTopAnchor(anchorPaneInner, 150.0);
        anchorPaneInner.setMaxHeight(300.0);
        anchorPaneInner.setMaxWidth(375.0);
        anchorPaneInner.setPrefHeight(300.0);
        anchorPaneInner.setPrefWidth(375.0);
        anchorPaneInner.getChildren().add(gridPaneGame);
        AnchorPane.setBottomAnchor(gridPaneGame, 0.0);
        AnchorPane.setLeftAnchor(gridPaneGame, 0.0);
        AnchorPane.setRightAnchor(gridPaneGame, 0.0);
        AnchorPane.setTopAnchor(gridPaneGame, 0.0);

    }

    private void setLabeInGridPaneOptionLabel() {
        label0 = new Label();
        label0.setPrefHeight(21.0);
        label0.setPrefWidth(400.0);
        label0.setText("Tic-Tac-Toe Game.  Choose  players and the sign ..........");
        label0.setTextFill(javafx.scene.paint.Color.YELLOW);
        label0.setFont(new Font("Georgia Bold", 15.0));

    }

    private void setGridPaneOptionLabel() {
        gridPaneOptionLabel = new GridPane();
        gridPaneOptionLabel.setLayoutX(160.0);
        gridPaneOptionLabel.setLayoutY(7.0);
        gridPaneOptionLabel.setPrefHeight(15.0);
        gridPaneOptionLabel.setPrefWidth(400.0);

        ColumnConstraints columnConstraints2 = new ColumnConstraints();
        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        RowConstraints rowConstraints2 = new RowConstraints();
        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        gridPaneOptionLabel.getColumnConstraints().add(columnConstraints2);
        gridPaneOptionLabel.getRowConstraints().add(rowConstraints2);
        gridPaneOptionLabel.getChildren().add(label0);
        GridPane.setMargin(label0, new Insets(0.0, 0.0, 0.0, 10.0));

    }

    private void setK00Button() {
        K00 = new RadioButton();
        K00.setId("K00");
        K00.setMnemonicParsing(false);
        K00.setText("Player1");
        K00.setTextFill(javafx.scene.paint.Color.YELLOW);
        K00.setFont(new Font("Georgia Bold", 15.0));
    }

    private void setK01Button() {
        K01 = new RadioButton();
        K01.setId("K01");
        K01.setMnemonicParsing(false);
        K01.setPrefHeight(21.0);
        K01.setPrefWidth(99.0);
        K01.setText("X");
        K01.setTextFill(javafx.scene.paint.Color.YELLOW);
        K01.setFont(new Font("Georgia Bold", 15.0));
        K01.setId("K01");
    }

    private void setK02Button() {
        K02 = new RadioButton();
        K02.setId("K02");
        K02.setMnemonicParsing(false);
        K02.setPrefHeight(21.0);
        K02.setPrefWidth(99.0);
        K02.setText("O");
        K02.setTextFill(javafx.scene.paint.Color.YELLOW);
        K02.setFont(new Font("Georgia Bold", 15.0));
    }

    private void setK03Button() {
        K03 = new RadioButton();
        K03.setId("K03");
        K03.setMnemonicParsing(false);
        K03.setPrefHeight(21.0);
        K03.setPrefWidth(99.0);
        K03.setText("T");
        K03.setTextFill(javafx.scene.paint.Color.YELLOW);
        K03.setFont(new Font("Georgia Bold", 15.0));
    }

    private void setK10Button() {
        K10 = new RadioButton();
        K10.setId("K10");
        K10.setMnemonicParsing(false);
        K10.setText("Player2");
        K10.setTextFill(javafx.scene.paint.Color.YELLOW);
        K10.setFont(new Font("Georgia Bold", 15.0));
    }

    private void setK11Button() {
        K11 = new RadioButton();
        K11.setId("K11");
        K11.setMnemonicParsing(false);
        K11.setPrefHeight(21.0);
        K11.setPrefWidth(99.0);
        K11.setText("+");
        K11.setTextFill(javafx.scene.paint.Color.YELLOW);
        K11.setFont(new Font("Georgia Bold", 15.0));
    }

    private void setK12Button() {
        K12 = new RadioButton();
        K12.setId("K12");
        K12.setMnemonicParsing(false);
        K12.setPrefHeight(21.0);
        K12.setPrefWidth(99.0);
        K12.setText("Q");
        K12.setTextFill(javafx.scene.paint.Color.YELLOW);
        K12.setFont(new Font("Georgia Bold", 15.0));
    }

    private void setK13Button() {
        K13 = new RadioButton();
        K13.setId("K13");
        K13.setMnemonicParsing(false);
        K13.setPrefHeight(21.0);
        K13.setPrefWidth(99.0);
        K13.setText("V");
        K13.setTextFill(javafx.scene.paint.Color.YELLOW);
        K13.setFont(new Font("Georgia Bold", 15.0));
    }

    private void setK20Button() {
        K20 = new RadioButton();
        K20.setId("K20");
        K20.setMnemonicParsing(false);
        K20.setText("Comp");
        K20.setTextFill(javafx.scene.paint.Color.YELLOW);
        K20.setFont(new Font("Georgia Bold", 15.0));
    }

    private void setK21Button() {
        K21 = new RadioButton();
        K21.setId("K21");
        K21.setMnemonicParsing(false);
        K21.setPrefHeight(21.0);
        K21.setPrefWidth(99.0);
        K21.setText("#");
        K21.setTextFill(javafx.scene.paint.Color.YELLOW);
        K21.setFont(new Font("Georgia Bold", 15.0));
    }

    private void setK22Button() {
        K22 = new RadioButton();
        K22.setId("K22");
        K22.setMnemonicParsing(false);
        K22.setPrefHeight(21.0);
        K22.setPrefWidth(99.0);
        K22.setText("@");
        K22.setTextFill(javafx.scene.paint.Color.YELLOW);
        K22.setFont(new Font("Georgia Bold", 15.0));
    }

    private void setK23Button() {
        K23 = new RadioButton();
        K23.setId("K23");
        K23.setMnemonicParsing(false);
        K23.setPrefHeight(21.0);
        K23.setPrefWidth(99.0);
        K23.setText("H");
        K23.setTextFill(javafx.scene.paint.Color.YELLOW);
        K23.setFont(new Font("Georgia Bold", 15.0));
    }

    private void setgridPanePlayersRB() {
        gridPanePlayersRB = new GridPane();
        gridPanePlayersRB.setPrefHeight(75.0);
        gridPanePlayersRB.setPrefWidth(340.0);
        gridPanePlayersRB.getChildren().add(K00);
        gridPanePlayersRB.getChildren().add(K01);
        gridPanePlayersRB.getChildren().add(K02);
        gridPanePlayersRB.getChildren().add(K10);
        gridPanePlayersRB.getChildren().add(K20);
        gridPanePlayersRB.getChildren().add(K03);
        gridPanePlayersRB.getChildren().add(K11);
        gridPanePlayersRB.getChildren().add(K12);
        gridPanePlayersRB.getChildren().add(K13);
        gridPanePlayersRB.getChildren().add(K21);
        gridPanePlayersRB.getChildren().add(K22);
        gridPanePlayersRB.getChildren().add(K23);
        GridPane.setMargin(K00, new Insets(0.0, 0.0, 0.0, 5.0));
        GridPane.setColumnIndex(K01, 1);
        GridPane.setMargin(K01, new Insets(0.0, 0.0, 0.0, 5.0));
        GridPane.setColumnIndex(K02, 2);
        GridPane.setMargin(K02, new Insets(0.0, 0.0, 0.0, 5.0));
        GridPane.setRowIndex(K10, 1);
        GridPane.setMargin(K10, new Insets(0.0, 0.0, 0.0, 5.0));
        GridPane.setRowIndex(K20, 2);
        GridPane.setMargin(K20, new Insets(0.0, 0.0, 0.0, 5.0));
        GridPane.setColumnIndex(K03, 3);
        GridPane.setMargin(K03, new Insets(0.0, 0.0, 0.0, 5.0));
        GridPane.setColumnIndex(K11, 1);
        GridPane.setRowIndex(K11, 1);
        GridPane.setMargin(K11, new Insets(0.0, 0.0, 0.0, 5.0));
        GridPane.setColumnIndex(K12, 2);
        GridPane.setRowIndex(K12, 1);
        GridPane.setMargin(K12, new Insets(0.0, 0.0, 0.0, 5.0));
        GridPane.setColumnIndex(K13, 3);
        GridPane.setRowIndex(K13, 1);
        GridPane.setMargin(K13, new Insets(0.0, 0.0, 0.0, 5.0));
        GridPane.setColumnIndex(K21, 1);
        GridPane.setRowIndex(K21, 2);
        GridPane.setMargin(K21, new Insets(0.0, 0.0, 0.0, 5.0));
        GridPane.setColumnIndex(K22, 2);
        GridPane.setRowIndex(K22, 2);
        GridPane.setMargin(K22, new Insets(0.0, 0.0, 0.0, 5.0));
        GridPane.setColumnIndex(K23, 3);
        GridPane.setRowIndex(K23, 2);
        GridPane.setMargin(K23, new Insets(0.0, 0.0, 0.0, 5.0));

        ColumnConstraints columnConstraints3 = new ColumnConstraints();
        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMaxWidth(199.0);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(150.0);

        ColumnConstraints columnConstraints4 = new ColumnConstraints();
        columnConstraints4.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints4.setMaxWidth(199.0);
        columnConstraints4.setMinWidth(10.0);
        columnConstraints4.setPrefWidth(115.0);

        ColumnConstraints columnConstraints5 = new ColumnConstraints();
        columnConstraints5.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints5.setMaxWidth(199.0);
        columnConstraints5.setMinWidth(10.0);
        columnConstraints5.setPrefWidth(115.0);

        ColumnConstraints columnConstraints6 = new ColumnConstraints();
        columnConstraints6.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints6.setMaxWidth(199.0);
        columnConstraints6.setMinWidth(10.0);
        columnConstraints6.setPrefWidth(112.0);

        RowConstraints rowConstraints3 = new RowConstraints();
        rowConstraints3.setMaxHeight(25.0);
        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(25.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        RowConstraints rowConstraints4 = new RowConstraints();
        rowConstraints4.setMaxHeight(25.0);
        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(25.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        RowConstraints rowConstraints5 = new RowConstraints();
        rowConstraints5.setMaxHeight(25.0);
        rowConstraints5.setMinHeight(10.0);
        rowConstraints5.setPrefHeight(25.0);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        gridPanePlayersRB.getColumnConstraints().add(columnConstraints3);
        gridPanePlayersRB.getColumnConstraints().add(columnConstraints4);
        gridPanePlayersRB.getColumnConstraints().add(columnConstraints5);
        gridPanePlayersRB.getColumnConstraints().add(columnConstraints6);
        gridPanePlayersRB.getRowConstraints().add(rowConstraints3);
        gridPanePlayersRB.getRowConstraints().add(rowConstraints4);
        gridPanePlayersRB.getRowConstraints().add(rowConstraints5);

    }

    private void setRestartButton() {
        restartButton = new Button();
        restartButton.setId("restartButton");
        restartButton.setMnemonicParsing(false);
        restartButton.setPrefHeight(25.0);
        restartButton.getStylesheets().add("/style/fxml1.css");
        restartButton.setText("Restart");
    }

    private void setNewGameButton() {
        newGameButton = new Button();
        newGameButton.setId("newGameButton");
        newGameButton.setMnemonicParsing(false);
        newGameButton.setOnMouseClicked(mouseEvent -> buttonNewGameClick());
        newGameButton.setPrefHeight(25.0);
        newGameButton.getStylesheets().add("/style/fxml1.css");
        newGameButton.setText("New Game");
    }

    private void setGridPaneRestart() {
        gridPaneRestart = new GridPane();
        gridPaneRestart.setPrefHeight(60.0);
        gridPaneRestart.setPrefWidth(122.0);

        ColumnConstraints columnConstraints7 = new ColumnConstraints();
        columnConstraints7.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints7.setMinWidth(10.0);
        columnConstraints7.setPrefWidth(100.0);

        RowConstraints rowConstraints6 = new RowConstraints();
        rowConstraints6.setMaxHeight(25.0);
        rowConstraints6.setMinHeight(10.0);
        rowConstraints6.setPrefHeight(25.0);
        rowConstraints6.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        RowConstraints rowConstraints7 = new RowConstraints();
        rowConstraints7.setMaxHeight(10.0);
        rowConstraints7.setMinHeight(10.0);
        rowConstraints7.setPrefHeight(10.0);
        rowConstraints7.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        RowConstraints rowConstraints8 = new RowConstraints();
        rowConstraints8.setMaxHeight(25.0);
        rowConstraints8.setMinHeight(10.0);
        rowConstraints8.setPrefHeight(25.0);
        rowConstraints8.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        gridPaneRestart.getColumnConstraints().add(columnConstraints7);
        gridPaneRestart.getRowConstraints().add(rowConstraints6);
        gridPaneRestart.getRowConstraints().add(rowConstraints7);
        gridPaneRestart.getRowConstraints().add(rowConstraints8);

        gridPaneRestart.getChildren().add(restartButton);
        GridPane.setRowIndex(restartButton, 2);
        GridPane.setMargin(restartButton, new Insets(0.0, 0.0, 0.0, 15.0));

        gridPaneRestart.getChildren().add(newGameButton);
        GridPane.setMargin(newGameButton, new Insets(0.0, 0.0, 0.0, 15.0));

    }

    private void setlabel00InGridPaneInfoMove() {
        label00 = new Label();
        label00.setPrefHeight(21.0);
        label00.setPrefWidth(100.0);
        label00.setTextFill(javafx.scene.paint.Color.YELLOW);
        label00.setFont(new Font("Georgia Bold", 15.0));
    }

    private void setlabel10InGridPaneInfoMove() {
        label10 = new Label();
        label10.setPrefHeight(21.0);
        label10.setPrefWidth(100.0);
        label10.setTextFill(javafx.scene.paint.Color.YELLOW);
        label10.setFont(new Font("Georgia Bold", 15.0));
    }

    private void setlabel20InGridPaneInfoMove() {
        label20 = new Label();
        label20.setPrefHeight(21.0);
        label20.setPrefWidth(100.0);
        label20.setTextFill(javafx.scene.paint.Color.YELLOW);
        label20.setFont(new Font("Georgia Bold", 15.0));
    }

    private void setGridPaneInfoMove() {
        gridPaneInfoMove = new GridPane();
        gridPaneInfoMove.setLayoutX(41.0);
        gridPaneInfoMove.setPrefHeight(75.0);
        gridPaneInfoMove.setPrefWidth(100.0);

        ColumnConstraints columnConstraints8 = new ColumnConstraints();
        columnConstraints8.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints8.setMinWidth(10.0);
        columnConstraints8.setPrefWidth(50.0);

        RowConstraints rowConstraints9 = new RowConstraints();
        rowConstraints9.setMaxHeight(25.0);
        rowConstraints9.setMinHeight(10.0);
        rowConstraints9.setPrefHeight(25.0);
        rowConstraints9.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        RowConstraints rowConstraints10 = new RowConstraints();
        rowConstraints10.setMinHeight(10.0);
        rowConstraints10.setPrefHeight(25.0);
        rowConstraints10.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        RowConstraints rowConstraints11 = new RowConstraints();
        rowConstraints11.setMaxHeight(25.0);
        rowConstraints11.setMinHeight(10.0);
        rowConstraints11.setPrefHeight(30.0);
        rowConstraints11.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        gridPaneInfoMove.getColumnConstraints().add(columnConstraints8);
        gridPaneInfoMove.getRowConstraints().add(rowConstraints9);
        gridPaneInfoMove.getRowConstraints().add(rowConstraints10);
        gridPaneInfoMove.getRowConstraints().add(rowConstraints11);

        gridPaneInfoMove.getChildren().add(label00);
        gridPaneInfoMove.getChildren().add(label10);
        gridPaneInfoMove.getChildren().add(label20);

        GridPane.setMargin(label00, new Insets(0.0, 0.0, 0.0, 5.0));
        GridPane.setMargin(label10, new Insets(0.0, 0.0, 0.0, 5.0));
        GridPane.setMargin(label20, new Insets(0.0, 0.0, 0.0, 5.0));

    }

    private void setLabelPlayer1InGridPaneCounter() {
        labelPlayer1 = new Label();
        labelPlayer1.setPrefHeight(21.0);
        labelPlayer1.setPrefWidth(63.0);
        labelPlayer1.setText("Player 1");
        labelPlayer1.setTextFill(javafx.scene.paint.Color.YELLOW);
    }

    private void setLabelPlayer2InGridPaneCounter() {
        labelPlayer2 = new Label();
        labelPlayer2.setPrefHeight(21.0);
        labelPlayer2.setPrefWidth(63.0);
        labelPlayer2.setText("Player 2");
        labelPlayer2.setTextFill(javafx.scene.paint.Color.YELLOW);
    }

    private void setLabelCompInGridPaneCounter() {
        labelComp = new Label();
        labelComp.setPrefHeight(21.0);
        labelComp.setPrefWidth(63.0);
        labelComp.setText("Comp");
        labelComp.setTextFill(javafx.scene.paint.Color.YELLOW);
    }

    private void setLabelPlayer1StatsInGridPaneCounter() {
        labelPlayer1Stats = new Label();
        labelPlayer1Stats.setPrefWidth(63.0);
        labelPlayer1Stats.setTextFill(javafx.scene.paint.Color.YELLOW);
        labelPlayer1Stats.setFont(new Font("Georgia Bold", 15.0));
    }

    private void setLabelPlayer2StatsInGridPaneCounter() {
        labelPlayer2Stats = new Label();
        labelPlayer2Stats.setPrefWidth(63.0);
        labelPlayer2Stats.setTextFill(javafx.scene.paint.Color.YELLOW);
        labelPlayer2Stats.setFont(new Font("Georgia Bold", 15.0));
    }

    private void setLabelCompStatsStatsInGridPaneCounter() {
        labelCompStats = new Label();
        labelCompStats.setPrefWidth(63.0);
        labelCompStats.setTextFill(javafx.scene.paint.Color.YELLOW);
        labelCompStats.setFont(new Font("Georgia Bold", 15.0));
    }

    private void setGridPaneCounter() {
        gridPaneCounter = new GridPane();
        gridPaneCounter.setPrefWidth(340.0);

        ColumnConstraints columnConstraints9 = new ColumnConstraints();
        columnConstraints9.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints9.setMinWidth(10.0);
        columnConstraints9.setPrefWidth(100.0);

        ColumnConstraints columnConstraints10 = new ColumnConstraints();
        columnConstraints10.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints10.setMinWidth(10.0);
        columnConstraints10.setPrefWidth(100.0);

        ColumnConstraints columnConstraints11 = new ColumnConstraints();
        columnConstraints11.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints11.setMinWidth(10.0);
        columnConstraints11.setPrefWidth(100.0);

        RowConstraints rowConstraints12 = new RowConstraints();
        rowConstraints12.setMaxHeight(25.0);
        rowConstraints12.setMinHeight(10.0);
        rowConstraints12.setPrefHeight(25.0);
        rowConstraints12.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        RowConstraints rowConstraints13 = new RowConstraints();
        rowConstraints13.setMaxHeight(25.0);
        rowConstraints13.setMinHeight(10.0);
        rowConstraints13.setPrefHeight(25.0);
        rowConstraints13.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        gridPaneCounter.getColumnConstraints().add(columnConstraints9);
        gridPaneCounter.getColumnConstraints().add(columnConstraints10);
        gridPaneCounter.getColumnConstraints().add(columnConstraints11);
        gridPaneCounter.getRowConstraints().add(rowConstraints12);
        gridPaneCounter.getRowConstraints().add(rowConstraints13);

        gridPaneCounter.getChildren().add(labelPlayer1);
        GridPane.setHalignment(labelPlayer1, javafx.geometry.HPos.CENTER);
        GridPane.setMargin(labelPlayer1, new Insets(0.0, 0.0, 0.0, 5.0));

        gridPaneCounter.getChildren().add(labelPlayer2);
        GridPane.setColumnIndex(labelPlayer2, 1);
        GridPane.setHalignment(labelPlayer2, javafx.geometry.HPos.CENTER);
        GridPane.setMargin(labelPlayer2, new Insets(0.0, 0.0, 0.0, 5.0));

        gridPaneCounter.getChildren().add(labelComp);
        GridPane.setColumnIndex(labelComp, 2);
        GridPane.setHalignment(labelComp, javafx.geometry.HPos.CENTER);
        GridPane.setMargin(labelComp, new Insets(0.0, 0.0, 0.0, 5.0));

        gridPaneCounter.getChildren().add(labelPlayer1Stats);
        GridPane.setHalignment(labelPlayer1Stats, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(labelPlayer1Stats, 1);
        GridPane.setMargin(labelPlayer1Stats, new Insets(0.0, 0.0, 0.0, 5.0));

        gridPaneCounter.getChildren().add(labelPlayer2Stats);
        GridPane.setColumnIndex(labelPlayer2Stats, 1);
        GridPane.setHalignment(labelPlayer2Stats, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(labelPlayer2Stats, 1);
        GridPane.setMargin(labelPlayer2Stats, new Insets(0.0, 0.0, 0.0, 5.0));

        gridPaneCounter.getChildren().add(labelCompStats);
        GridPane.setColumnIndex(labelCompStats, 2);
        GridPane.setHalignment(labelCompStats, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(labelCompStats, 1);
        GridPane.setMargin(labelCompStats, new Insets(0.0, 0.0, 0.0, 5.0));

    }

    private void setlabelGameStatsInGridPaneLabelStats() {
        labelGameStats = new Label();
        labelGameStats.setPrefWidth(340.0);
        labelGameStats.setTextFill(javafx.scene.paint.Color.YELLOW);
        labelGameStats.setFont(new Font("Georgia Bold", 15.0));
    }

    private void setGridPaneLabelStats() {

        gridPaneLabelStats = new GridPane();
        gridPaneLabelStats.setPrefWidth(340.0);

        ColumnConstraints columnConstraints12 = new ColumnConstraints();
        columnConstraints12.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints12.setMinWidth(10.0);
        columnConstraints12.setPrefWidth(100.0);

        RowConstraints rowConstraints14 = new RowConstraints();
        rowConstraints14.setMaxHeight(25.0);
        rowConstraints14.setMinHeight(10.0);
        rowConstraints14.setPrefHeight(25.0);
        rowConstraints14.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        gridPaneLabelStats.getColumnConstraints().add(columnConstraints12);
        gridPaneLabelStats.getRowConstraints().add(rowConstraints14);
        gridPaneLabelStats.getChildren().add(labelGameStats);
        GridPane.setMargin(labelGameStats, new Insets(0.0, 0.0, 0.0, 5.0));

    }

    private void setanchorPaneOuter() {
        anchorPaneOuter.setId("AnchorPane");
        anchorPaneOuter.setMaxHeight(600.0);
        anchorPaneOuter.setMaxWidth(800.0);
        anchorPaneOuter.setOnMouseClicked(this::restartBut);
        anchorPaneOuter.setPrefHeight(600.0);
        anchorPaneOuter.setPrefWidth(800.0);
        anchorPaneOuter.getStylesheets().add("/style/fxml1.css");

    }

    void addControls() {
        setLabeInFirstInnerAnchorPane();
        setFirstInnerAnchorPane();
        setImageView00();
        setC00Button();
        setImageView01();
        setC01Button();
        setImageView02();
        setC02Button();
        setImageView10();
        setC10Button();
        setImageView11();
        setC11Button();
        setImageView12();
        setC12Button();
        setImageView20();
        setC20Button();
        setImageView21();
        setC21Button();
        setImageView22();
        setC22Button();
        setGridPaneGame();
        setSecondInnerAnchorPane();
        setLabeInGridPaneOptionLabel();
        setGridPaneOptionLabel();
        setK00Button();
        setK01Button();
        setK02Button();
        setK10Button();
        setK20Button();
        setK03Button();
        setK11Button();
        setK12Button();
        setK13Button();
        setK21Button();
        setK22Button();
        setK23Button();

        setgridPanePlayersRB();
        setanchorPaneOuter();

        AnchorPane.setTopAnchor(gridPaneOptionLabel, 7.0);
        anchorPaneOuter.getChildren().add(0, gridPaneOptionLabel);
        anchorPaneOuter.getChildren().add(1, firstInnerAnchorPane);
        anchorPaneOuter.getChildren().add(2, anchorPaneInner);
        anchorPaneOuter.getChildren().add(3, gridPanePlayersRB);
        AnchorPane.setLeftAnchor(gridPanePlayersRB, 145.0);
        AnchorPane.setTopAnchor(gridPanePlayersRB, 50.0);

        setRestartButton();
        setNewGameButton();
        setGridPaneRestart();

        anchorPaneOuter.getChildren().add(4, gridPaneRestart);
        AnchorPane.setLeftAnchor(gridPaneRestart, 500.0);
        AnchorPane.setTopAnchor(gridPaneRestart, 50.0);

        setlabel00InGridPaneInfoMove();
        setlabel10InGridPaneInfoMove();
        setlabel20InGridPaneInfoMove();
        setGridPaneInfoMove();

        anchorPaneOuter.getChildren().add(5, gridPaneInfoMove);
        AnchorPane.setLeftAnchor(gridPaneInfoMove, 40.0);
        AnchorPane.setTopAnchor(gridPaneInfoMove, 50.0);

        setLabelPlayer1InGridPaneCounter();
        setLabelPlayer2InGridPaneCounter();
        setLabelCompInGridPaneCounter();
        setLabelPlayer1StatsInGridPaneCounter();
        setLabelPlayer2StatsInGridPaneCounter();
        setLabelCompStatsStatsInGridPaneCounter();
        setGridPaneCounter();

        anchorPaneOuter.getChildren().add(gridPaneCounter);
        AnchorPane.setLeftAnchor(gridPaneCounter, 135.0);
        AnchorPane.setTopAnchor(gridPaneCounter, 475.0);

        setlabelGameStatsInGridPaneLabelStats();
        setGridPaneLabelStats();
        anchorPaneOuter.getChildren().add(gridPaneLabelStats);
        AnchorPane.setLeftAnchor(gridPaneLabelStats, 155.0);
        AnchorPane.setTopAnchor(gridPaneLabelStats, 540.0);
        initialize();
    }

    private void restartBut(javafx.scene.input.MouseEvent mouseEvent) {
        if (mouseEvent.getSource() == restartButton) {
            mainApplication.restart(stage);
        }
    }

    private Button getButton(int i, int j) {
        return (Button) gridPaneGame.lookup("#c" + i + j);

    }


    private void buttonNewGameClick() {
        clearGame();
    }

    private void signX(ActionEvent event) {
        if (event.getSource() == K01) {
            String sB = K01.getId();
            model.setFireSign(sB);

            if (model.checkNullGroupPlayer1Signs()) {
                model.trigglePlayer1SignButton();
                K01.setToggleGroup(model.groupPlayer1Signs);
                K02.setDisable(true);
                K03.setDisable(true);
                K02.setVisible(false);
                K03.setVisible(false);
                enableGameButtonCells();
            }
            if (model.comp.getPlayerQueue().equals(PlayerQueue.FIRST.name()) && !model.checkNullGroupCompSigns()) {
                startButtonComp();
            }
        }
    }

    private void signO(ActionEvent event) {
        if (event.getSource() == K02) {
            String sB = K02.getId();
            model.setFireSign(sB);

            if (model.checkNullGroupPlayer1Signs()) {
                model.trigglePlayer1SignButton();
                K02.setToggleGroup(model.groupPlayer1Signs);
                K03.setDisable(true);
                K01.setDisable(true);
                K01.setVisible(false);
                K03.setVisible(false);
                enableGameButtonCells();
            }

            if (model.comp.getPlayerQueue().equals(PlayerQueue.FIRST.name()) && !model.checkNullGroupCompSigns()) {
                startButtonComp();
            }

        }
    }

    private void signT(ActionEvent event) {
        if (event.getSource() == K03) {
            String sB = K03.getId();
            model.setFireSign(sB);

            if (model.checkNullGroupPlayer1Signs()) {
                model.trigglePlayer1SignButton();
                K03.setToggleGroup(model.groupPlayer1Signs);
                K02.setDisable(true);
                K01.setDisable(true);
                K01.setVisible(false);
                K02.setVisible(false);
                enableGameButtonCells();
            }

            if (model.comp.getPlayerQueue().equals(PlayerQueue.FIRST.name()) && !model.checkNullGroupCompSigns()) {
                startButtonComp();
            }
        }
    }

    private void signPlus(ActionEvent event) {
        if (event.getSource() == K11) {
            String sB = K11.getId();
            model.setFireSign(sB);

            if (model.checkNullGroupPlayer2Signs()) {
                model.trigglePlayer2SignButton();
                K11.setToggleGroup(model.groupPlayer2Signs);
                K12.setDisable(true);
                K13.setDisable(true);

                K12.setVisible(false);
                K13.setVisible(false);
                enableGameButtonCells();
            }

            if (model.comp.getPlayerQueue().equals(PlayerQueue.FIRST.name()) && !model.checkNullGroupCompSigns()) {
                startButtonComp();
            }
        }
    }

    private void signQ(ActionEvent event) {
        if (event.getSource() == K12) {
            String sB = K12.getId();
            model.setFireSign(sB);

            if (model.checkNullGroupPlayer2Signs()) {
                model.trigglePlayer2SignButton();
                K12.setToggleGroup(model.groupPlayer2Signs);
                K11.setDisable(true);
                K13.setDisable(true);
                K11.setVisible(false);
                K13.setVisible(false);
                enableGameButtonCells();
            }

            if (model.comp.getPlayerQueue().equals(PlayerQueue.FIRST.name()) && !model.checkNullGroupCompSigns()) {
                startButtonComp();
            }
        }
    }

    private void signV(ActionEvent event) {
        if (event.getSource() == K13) {
            String sB = K13.getId();
            model.setFireSign(sB);

            if (model.checkNullGroupPlayer2Signs()) {
                model.trigglePlayer2SignButton();
                K13.setToggleGroup(model.groupPlayer2Signs);
                K11.setDisable(true);
                K12.setDisable(true);
                K11.setVisible(false);
                K12.setVisible(false);
                enableGameButtonCells();
            }

            if (model.comp.getPlayerQueue().equals(PlayerQueue.FIRST.name()) && !model.checkNullGroupCompSigns()) {
                startButtonComp();
            }
        }
    }

    private void signHash(ActionEvent event) {
        if (event.getSource() == K21) {
            String sB = K21.getId();
            model.setFireSign(sB);

            if (model.checkNullGroupCompSigns()) {
                model.triggleCompSignButton();
                K21.setToggleGroup(model.groupCompSign);
                K22.setDisable(true);
                K23.setDisable(true);

                K22.setVisible(false);
                K23.setVisible(false);
                enableGameButtonCells();
            }

            if (model.comp.getPlayerQueue().equals(PlayerQueue.FIRST.name()) && !model.checkNullGroupCompSigns()) {
                startButtonComp();
            }
        }
    }

    private void signAt(ActionEvent event) {
        if (event.getSource() == K22) {
            String sB = K22.getId();
            model.setFireSign(sB);

            if (model.checkNullGroupCompSigns()) {
                model.triggleCompSignButton();
                K22.setToggleGroup(model.groupCompSign);
                K21.setDisable(true);
                K23.setDisable(true);
                K21.setVisible(false);
                K23.setVisible(false);

                enableGameButtonCells();
            }
            if (model.comp.getPlayerQueue().equals(PlayerQueue.FIRST.name()) && !model.checkNullGroupCompSigns()) {
                startButtonComp();
            }
        }
    }

    private void signH(ActionEvent event) {
        if (event.getSource() == K23) {
            String sB = K23.getId();
            model.setFireSign(sB);

            if (model.checkNullGroupCompSigns()) {
                model.triggleCompSignButton();
                K23.setToggleGroup(model.groupCompSign);
                K22.setDisable(true);
                K21.setDisable(true);
                K21.setVisible(false);
                K22.setVisible(false);
                enableGameButtonCells();

            }
            if (model.comp.getPlayerQueue().equals(PlayerQueue.FIRST.name()) && !model.checkNullGroupCompSigns()) {
                startButtonComp();
            }
        }
    }

    private void player1(ActionEvent event) {
        if (event.getSource() == K00) {
            if (model.checkNullToogleForPl1()) {
                model.initPlayer1();
                if (model.player1.getPlayerQueue().equals(PlayerQueue.FIRST.name())) {
                    label00.setText("First move");
                }
                K00.setToggleGroup(model.groupPlayer1);
                K01.setDisable(false);
                K02.setDisable(false);
                K03.setDisable(false);
                K01.setVisible(true);
                K02.setVisible(true);
                K03.setVisible(true);
                if (!model.checkNullGroupPlayer2()) {
                    K20.setDisable(true);
                    K21.setDisable(true);
                    K22.setDisable(true);
                    K23.setDisable(true);
                    K20.setVisible(false);
                }
                if (!model.checkNullGroupComp()) {
                    K10.setDisable(true);
                    K11.setDisable(true);
                    K12.setDisable(true);
                    K13.setDisable(true);
                    K10.setVisible(false);
                }
            }

        }
    }

    private void comp(ActionEvent event) {
        if (event.getSource() == K20) {
            if (model.checkNullToogleForComp()) {
                model.initComp();
                if (model.comp.getPlayerQueue().equals(PlayerQueue.FIRST.name())) {
                    label20.setText("First move");
                }
                K20.setToggleGroup(model.groupComp);
                K21.setDisable(false);
                K22.setDisable(false);
                K23.setDisable(false);
                K21.setVisible(true);
                K22.setVisible(true);
                K23.setVisible(true);
                if (!model.checkNullGroupPlayer2()) {
                    K00.setDisable(true);
                    K01.setDisable(true);
                    K02.setDisable(true);
                    K03.setDisable(true);
                    K00.setVisible(false);

                }
                if (!model.checkNullGroupPlayer1()) {
                    K10.setDisable(true);
                    K11.setDisable(true);
                    K12.setDisable(true);
                    K13.setDisable(true);
                    K10.setVisible(false);
                }
            }
        }
    }

    private void player2(ActionEvent event) {
        if (event.getSource() == K10) {
            if (model.checkNullToogleForPl2()) {
                model.initPlayer2();
                if (model.player2.getPlayerQueue().equals(PlayerQueue.FIRST.name())) {
                    label10.setText("First move");
                }
                K10.setToggleGroup(model.groupPlayer2);
                K11.setDisable(false);
                K12.setDisable(false);
                K13.setDisable(false);
                K11.setVisible(true);
                K12.setVisible(true);
                K13.setVisible(true);
                if (!model.checkNullGroupPlayer1()) {
                    K20.setDisable(true);
                    K21.setDisable(true);
                    K22.setDisable(true);
                    K23.setDisable(true);
                    K20.setVisible(false);
                }
                if (!model.checkNullGroupComp()) {
                    K00.setDisable(true);
                    K01.setDisable(true);
                    K02.setDisable(true);
                    K03.setDisable(true);
                    K00.setVisible(false);
                }
            }
        }
    }

    private Image getImageX() {
        image = new Image("/img/x.png");
        return image;

    }

    private Image getImageO() {
        image = new Image("/img/o.png");
        return image;

    }

    private Image getImageT() {
        image = new Image("/img/t.png");
        return image;

    }

    private Image getImageAT() {
        image = new Image("/img/at.png");
        return image;

    }

    private Image getImageHash() {
        image = new Image("/img/hash.png");
        return image;

    }

    private Image getImageH() {
        image = new Image("/img/h.png");
        return image;

    }

    private Image getImagePlus() {
        image = new Image("/img/plus.png");
        return image;

    }

    private Image getImageQ() {
        image = new Image("/img/q.png");
        return image;

    }

    private Image getImageV() {
        image = new Image("/img/v.png");
        return image;

    }

    private boolean checkChoosedImage() {
        return !(returnPlayerSign.equals(PlayerSign.AT_SIGN.name()) || returnPlayerSign.equals(PlayerSign.HASH_SIGN.name()) || returnPlayerSign.equals(PlayerSign.H_SIGN.name()));
    }

    private Image triggleChoosedImage() {
        switch (returnPlayerSign) {
            case "X_SIGN":
            case "O_SIGN":
            case "T_SIGN":
                if (returnPlayerSign.equals(PlayerSign.X_SIGN.name())) {
                    image = getImageX();
                    return image;

                }
                if (returnPlayerSign.equals(PlayerSign.O_SIGN.name())) {
                    image = getImageO();
                    return image;
                }
                if (returnPlayerSign.equals(PlayerSign.T_SIGN.name())) {
                    image = getImageT();
                    return image;
                }
                break;
            case "PLUS_SIGN":
            case "Q_SIGN":
            case "V_SIGN":
                if (returnPlayerSign.equals(PlayerSign.PLUS_SIGN.name())) {
                    image = getImagePlus();
                    return image;
                }
                if (returnPlayerSign.equals(PlayerSign.Q_SIGN.name())) {
                    image = getImageQ();
                    return image;
                }
                if (returnPlayerSign.equals(PlayerSign.V_SIGN.name())) {
                    image = getImageV();
                    return image;
                }
                break;
            case "AT_SIGN":
            case "HASH_SIGN":
            case "H_SIGN":
                if (returnPlayerSign.equals(PlayerSign.AT_SIGN.name())) {
                    image = getImageAT();
                    return image;
                }
                if (returnPlayerSign.equals(PlayerSign.HASH_SIGN.name())) {
                    image = getImageHash();
                    return image;
                }
                if (returnPlayerSign.equals(PlayerSign.H_SIGN.name())) {
                    image = getImageH();
                    return image;
                }
                break;
            default:
                break;
        }
        return image;
    }

    private void checkIfBoardIsFull() {
        if (model.checkIfPlayersArrayIsFull()) {
            labelGameStats.setText(PlayerResult.DRAW_GAME_OVER.name());
            disableGameButtonCellsViewTrue();
        }
    }

    private void check3InRow() {
        if (model.checkThreeInRow()) {
            model.checkWhowWins();
            if (model.winPlayer1) {
                labelGameStats.setText(PlayerResult.PLAYER1_WINS_GAME_OVER.name());
                labelPlayer1Stats.setText(Integer.toString(model.sumWinPlayer1));
                if (model.comp.getPlayerState().equals(PlayerState.IN_GAME.name())) {
                    labelCompStats.setText(Integer.toString(model.sumWinComp));
                }
                if (model.player2.getPlayerState().equals(PlayerState.IN_GAME.name())) {
                    labelPlayer2Stats.setText(Integer.toString(model.sumWinPlayer2));
                }
                disableGameButtonCellsViewTrue();
            }
            if (model.winComp) {
                labelGameStats.setText(PlayerResult.COMP_WINS_GAME_OVER.name());
                labelCompStats.setText(Integer.toString(model.sumWinComp));
                if (model.player1.getPlayerState().equals(PlayerState.IN_GAME.name())) {
                    labelPlayer1Stats.setText(Integer.toString(model.sumWinPlayer1));
                }
                if (model.player2.getPlayerState().equals(PlayerState.IN_GAME.name())) {
                    labelPlayer2Stats.setText(Integer.toString(model.sumWinPlayer2));
                }
                disableGameButtonCellsViewTrue();
            }
            if (model.winPlayer2) {
                labelGameStats.setText(PlayerResult.PLAYER2_WINS_GAME_OVER.name());
                labelPlayer2Stats.setText(Integer.toString(model.sumWinPlayer2));
                if (model.comp.getPlayerState().equals(PlayerState.IN_GAME.name())) {
                    labelCompStats.setText(Integer.toString(model.sumWinComp));
                }
                if (model.player1.getPlayerState().equals(PlayerState.IN_GAME.name())) {
                    labelPlayer1Stats.setText(Integer.toString(model.sumWinPlayer1));
                }
                disableGameButtonCellsViewTrue();
            }

        }

    }

    private void mouseActionButtonC00(ActionEvent event) {
        if (event.getSource() == c00 && model.CellArr[0][0].getCellState().equals(CellState.N.name())) {

            int mr = Integer.parseInt(c00.getId().substring(1, 2).toLowerCase());
            int mc = Integer.parseInt(c00.getId().substring(2).toLowerCase());
            this.returnPlayerSign = model.getCheckPlayersQueueAndReturnSign(mr, mc);

            c00 = (Button) event.getSource();
            image = triggleChoosedImage();
            ImageView00.setImage(image);
            check3InRow();
            checkIfBoardIsFull();
            if (!model.checkIfPlayersArrayIsFull()&& checkChoosedImage() && (model.comp.getPlayerState().equals(PlayerState.IN_GAME.name()))) {
                startButtonComp();
            }
        }
    }

    private void mouseActionButtonC01(ActionEvent event) {
        if (event.getSource() == c01 && model.CellArr[0][1].getCellState().equals(CellState.N.name())) {
            int mr = Integer.parseInt(c01.getId().substring(1, 2).toLowerCase());
            int mc = Integer.parseInt(c01.getId().substring(2).toLowerCase());
            this.returnPlayerSign = model.getCheckPlayersQueueAndReturnSign(mr, mc);

            c01 = (Button) event.getSource();
            image = triggleChoosedImage();
            ImageView01.setImage(image);
            check3InRow();
            checkIfBoardIsFull();
            if (!model.checkIfPlayersArrayIsFull() && checkChoosedImage() && (model.comp.getPlayerState().equals(PlayerState.IN_GAME.name()))) {
                startButtonComp();
            }
        }
    }

    private void mouseActionButtonC02(ActionEvent event) {
        if (event.getSource() == c02 && model.CellArr[0][2].getCellState().equals(CellState.N.name())) {
            int mr = Integer.parseInt(c02.getId().substring(1, 2).toLowerCase());
            int mc = Integer.parseInt(c02.getId().substring(2).toLowerCase());
            this.returnPlayerSign = model.getCheckPlayersQueueAndReturnSign(mr, mc);

            c02 = (Button) event.getSource();
            image = triggleChoosedImage();
            ImageView02.setImage(image);
            check3InRow();
            checkIfBoardIsFull();
            if (!model.checkIfPlayersArrayIsFull() && checkChoosedImage() && (model.comp.getPlayerState().equals(PlayerState.IN_GAME.name()))) {
                startButtonComp();
            }
        }
    }

    private void mouseActionButtonC10(ActionEvent event) {
        if (event.getSource() == c10 && model.CellArr[1][0].getCellState().equals(CellState.N.name())) {
            int mr = Integer.parseInt(c10.getId().substring(1, 2).toLowerCase());
            int mc = Integer.parseInt(c10.getId().substring(2).toLowerCase());
            this.returnPlayerSign = model.getCheckPlayersQueueAndReturnSign(mr, mc);

            c10 = (Button) event.getSource();
            image = triggleChoosedImage();
            ImageView10.setImage(image);
            check3InRow();
            checkIfBoardIsFull();
            if (!model.checkIfPlayersArrayIsFull() && checkChoosedImage() && (model.comp.getPlayerState().equals(PlayerState.IN_GAME.name()))) {
                startButtonComp();
            }
        }
    }

    private void mouseActionButtonC11(ActionEvent event) {
        if (event.getSource() == c11 && model.CellArr[1][1].getCellState().equals(CellState.N.name())) {
            int mr = Integer.parseInt(c11.getId().substring(1, 2).toLowerCase());
            int mc = Integer.parseInt(c11.getId().substring(2).toLowerCase());
            this.returnPlayerSign = model.getCheckPlayersQueueAndReturnSign(mr, mc);

            c11 = (Button) event.getSource();
            image = triggleChoosedImage();
            ImageView11.setImage(image);
            check3InRow();
            checkIfBoardIsFull();
            if (!model.checkIfPlayersArrayIsFull() && checkChoosedImage() && (model.comp.getPlayerState().equals(PlayerState.IN_GAME.name()))) {
                startButtonComp();
            }
        }

    }

    private void mouseActionButtonC12(ActionEvent event) {
        if (event.getSource() == c12 && model.CellArr[1][2].getCellState().equals(CellState.N.name())) {
            int mr = Integer.parseInt(c12.getId().substring(1, 2).toLowerCase());
            int mc = Integer.parseInt(c12.getId().substring(2).toLowerCase());
            this.returnPlayerSign = model.getCheckPlayersQueueAndReturnSign(mr, mc);

            c12 = (Button) event.getSource();
            image = triggleChoosedImage();
            ImageView12.setImage(image);
            check3InRow();
            checkIfBoardIsFull();
            if (!model.checkIfPlayersArrayIsFull() && checkChoosedImage() && (model.comp.getPlayerState().equals(PlayerState.IN_GAME.name()))) {
                startButtonComp();
            }
        }
    }

    private void mouseActionButtonC20(ActionEvent event) {
        if (event.getSource() == c20 && model.CellArr[2][0].getCellState().equals(CellState.N.name())) {
            int mr = Integer.parseInt(c20.getId().substring(1, 2).toLowerCase());
            int mc = Integer.parseInt(c20.getId().substring(2).toLowerCase());
            this.returnPlayerSign = model.getCheckPlayersQueueAndReturnSign(mr, mc);

            c20 = (Button) event.getSource();
            image = triggleChoosedImage();
            ImageView20.setImage(image);
            check3InRow();
            checkIfBoardIsFull();
            if (!model.checkIfPlayersArrayIsFull() && checkChoosedImage() && (model.comp.getPlayerState().equals(PlayerState.IN_GAME.name()))) {
                startButtonComp();
            }
        }
    }

    private void mouseActionButtonC21(ActionEvent event) {
        if (event.getSource() == c21 && model.CellArr[2][1].getCellState().equals(CellState.N.name())) {
            int mr = Integer.parseInt(c21.getId().substring(1, 2).toLowerCase());
            int mc = Integer.parseInt(c21.getId().substring(2).toLowerCase());
            this.returnPlayerSign = model.getCheckPlayersQueueAndReturnSign(mr, mc);

            c21 = (Button) event.getSource();
            image = triggleChoosedImage();
            ImageView21.setImage(image);
            check3InRow();
            checkIfBoardIsFull();
            if (!model.checkIfPlayersArrayIsFull() && checkChoosedImage() && (model.comp.getPlayerState().equals(PlayerState.IN_GAME.name()))) {
                startButtonComp();
            }
        }
    }

    private void mouseActionButtonC22(ActionEvent event) {
        if (event.getSource() == c22 && model.CellArr[2][2].getCellState().equals(CellState.N.name())) {
            int mr = Integer.parseInt(c22.getId().substring(1, 2).toLowerCase());
            int mc = Integer.parseInt(c22.getId().substring(2).toLowerCase());
            this.returnPlayerSign = model.getCheckPlayersQueueAndReturnSign(mr, mc);

            c22 = (Button) event.getSource();
            image = triggleChoosedImage();
            ImageView22.setImage(image);
            check3InRow();
            checkIfBoardIsFull();
            if (!model.checkIfPlayersArrayIsFull() && checkChoosedImage() && (model.comp.getPlayerState().equals(PlayerState.IN_GAME.name()))) {
                startButtonComp();
            }
        }
    }

    private void clickByMistake(MouseEvent event) {
        if ((event.getSource() == anchorPaneOuter) || (event.getSource() == anchorPaneInner)) {
            System.out.println("Please click precisely");
        }
    }

    private void startButtonComp() {
        model.fireButtonComp();
        int r = model.getFireRowXComp();
        int k = model.getfireColYComp();
        Button cr = getButton(r, k);
        cr.fire();

    }

    private void enableGameButtonCells() {
        if (model.checkActivePlayer1HaveSign()) {
            c00.setDisable(false);
            c01.setDisable(false);
            c02.setDisable(false);
            c10.setDisable(false);
            c11.setDisable(false);
            c12.setDisable(false);
            c20.setDisable(false);
            c21.setDisable(false);
            c22.setDisable(false);

            c00.setVisible(true);
            c01.setVisible(true);
            c02.setVisible(true);
            c10.setVisible(true);
            c11.setVisible(true);
            c12.setVisible(true);
            c20.setVisible(true);
            c21.setVisible(true);
            c22.setVisible(true);
            model.addCellAndNameToCellArr();
            model.addNtoCellsStatePlayersArray();
            model.addNtoCellSignArr();
            model.addPairToCellArr();
            model.addWeightsNumbersPlayersToCell();
        } else if (model.checkActivePlayer2HaveSign()) {
            c00.setDisable(false);
            c01.setDisable(false);
            c02.setDisable(false);
            c10.setDisable(false);
            c11.setDisable(false);
            c12.setDisable(false);
            c20.setDisable(false);
            c21.setDisable(false);
            c22.setDisable(false);

            c00.setVisible(true);
            c01.setVisible(true);
            c02.setVisible(true);
            c10.setVisible(true);
            c11.setVisible(true);
            c12.setVisible(true);
            c20.setVisible(true);
            c21.setVisible(true);
            c22.setVisible(true);
            model.addCellAndNameToCellArr();
            model.addNtoCellsStatePlayersArray();
            model.addNtoCellSignArr();
            model.addPairToCellArr();
            model.addWeightsNumbersPlayersToCell();
        }
    }

    private void disableGameButtonCellsViewTrue() {
        c00.setDisable(true);
        c01.setDisable(true);
        c02.setDisable(true);
        c10.setDisable(true);
        c11.setDisable(true);
        c12.setDisable(true);
        c20.setDisable(true);
        c21.setDisable(true);
        c22.setDisable(true);
    }

    private void disableGameButtonCells() {
        c00.setDisable(true);
        c01.setDisable(true);
        c02.setDisable(true);
        c10.setDisable(true);
        c11.setDisable(true);
        c12.setDisable(true);
        c20.setDisable(true);
        c21.setDisable(true);
        c22.setDisable(true);

        c00.setVisible(false);
        c01.setVisible(false);
        c02.setVisible(false);
        c10.setVisible(false);
        c11.setVisible(false);
        c12.setVisible(false);
        c20.setVisible(false);
        c21.setVisible(false);
        c22.setVisible(false);
    }

    private void disableRadioButtons() {
        K21.setDisable(true);
        K22.setDisable(true);
        K23.setDisable(true);
        K01.setDisable(true);
        K02.setDisable(true);
        K03.setDisable(true);
        K11.setDisable(true);
        K12.setDisable(true);
        K13.setDisable(true);
        K21.setVisible(false);
        K22.setVisible(false);
        K23.setVisible(false);
        K01.setVisible(false);
        K02.setVisible(false);
        K03.setVisible(false);
        K11.setVisible(false);
        K12.setVisible(false);
        K13.setVisible(false);
    }

    private void setButtonsOnAction() {
        c00.setOnAction(this::mouseActionButtonC00);
        c01.setOnAction(this::mouseActionButtonC01);
        c02.setOnAction(this::mouseActionButtonC02);
        c10.setOnAction(this::mouseActionButtonC10);
        c11.setOnAction(this::mouseActionButtonC11);
        c12.setOnAction(this::mouseActionButtonC12);
        c20.setOnAction(this::mouseActionButtonC20);
        c21.setOnAction(this::mouseActionButtonC21);
        c22.setOnAction(this::mouseActionButtonC22);
        K00.setOnAction(this::player1);
        K10.setOnAction(this::player2);
        K20.setOnAction(this::comp);
        K21.setOnAction(this::signHash);
        K22.setOnAction(this::signAt);
        K23.setOnAction(this::signH);
        K01.setOnAction(this::signX);
        K02.setOnAction(this::signO);
        K03.setOnAction(this::signT);
        K11.setOnAction(this::signPlus);
        K12.setOnAction(this::signQ);
        K13.setOnAction(this::signV);
        anchorPaneOuter.setOnMouseClicked(this::clickByMistake);
        anchorPaneInner.setOnMouseClicked(this::clickByMistake);

    }

    private void clearGame() {
        enableGameButtonCells();
        ImageView00 = new ImageView();
        ImageView00.setFitHeight(50);
        ImageView00.setFitWidth(50);
        c00.setGraphic(ImageView00);

        ImageView01 = new ImageView();
        ImageView01.setFitHeight(50);
        ImageView01.setFitWidth(50);
        c01.setGraphic(ImageView01);

        ImageView02 = new ImageView();
        ImageView02.setFitHeight(50);
        ImageView02.setFitWidth(50);
        c02.setGraphic(ImageView02);

        ImageView10 = new ImageView();
        ImageView10.setFitHeight(50);
        ImageView10.setFitWidth(50);
        c10.setGraphic(ImageView10);

        ImageView11 = new ImageView();
        ImageView11.setFitHeight(50);
        ImageView11.setFitWidth(50);
        c11.setGraphic(ImageView11);

        ImageView12 = new ImageView();
        ImageView12.setFitHeight(50);
        ImageView12.setFitWidth(50);
        c12.setGraphic(ImageView12);

        ImageView20 = new ImageView();
        ImageView20.setFitHeight(50);
        ImageView20.setFitWidth(50);
        c20.setGraphic(ImageView20);

        ImageView21 = new ImageView();
        ImageView21.setFitHeight(50);
        ImageView21.setFitWidth(50);
        c21.setGraphic(ImageView21);

        ImageView22 = new ImageView();
        ImageView22.setFitHeight(50);
        ImageView22.setFitWidth(50);
        c22.setGraphic(ImageView22);
        gridPaneLabelStats.getChildren().clear();
        labelGameStats = new Label();
        labelGameStats.prefWidth(340);
        labelGameStats.textFillProperty().setValue(YELLOW);
        labelGameStats.setText("");
        gridPaneLabelStats.add(labelGameStats, 0, 0);
        // Font K = new Font("Georgia",15);

        model.addNtoCellsStatePlayersArray();
        if (label20.getText().equals("First move")) {
            model.comp.setPlayerQueue(PlayerQueue.FIRST.name());
            if (!model.checkNullGroupPlayer1Signs()) {
                model.player1.setPlayerQueue(PlayerQueue.SECOND.name());
            }
            if (!model.checkNullGroupPlayer2Signs()) {
                model.player2.setPlayerQueue(PlayerQueue.SECOND.name());
            }
        } else if (label00.getText().equals("First move")) {
            model.player1.setPlayerQueue(PlayerQueue.FIRST.name());
            if (!model.checkNullGroupCompSigns()) {
                model.comp.setPlayerQueue(PlayerQueue.SECOND.name());
            }
            if (!model.checkNullGroupPlayer2Signs()) {
                model.player2.setPlayerQueue(PlayerQueue.SECOND.name());
            }
        } else if (label10.getText().equals("First move")) {
            model.player2.setPlayerQueue(PlayerQueue.FIRST.name());
            if (!model.checkNullGroupCompSigns()) {
                model.comp.setPlayerQueue(PlayerQueue.SECOND.name());
            }
            if (!model.checkNullGroupPlayer1Signs()) {
                model.player1.setPlayerQueue(PlayerQueue.SECOND.name());
            }
        }

        if (model.comp.getPlayerQueue().equals(PlayerQueue.FIRST.name()) && !model.checkNullGroupCompSigns()) {
            startButtonComp();
        }
    }

    private void initialize() {
        model.player1 = new Player();
        model.player2 = new Player();
        model.comp = new Player();

        model = new Model();
        model.addCellAndNameToCellArr();
        model.addNtoCellsStatePlayersArray();

        disableRadioButtons();
        disableGameButtonCells();
        model.player1.setPlayerTurn(PlayerTurn.N.name());
        model.player2.setPlayerTurn(PlayerTurn.N.name());
        model.comp.setPlayerTurn(PlayerTurn.N.name());
        model.player1.setPlayerName(PlayerName.N.name());
        model.player2.setPlayerName(PlayerName.N.name());
        model.comp.setPlayerName(PlayerName.N.name());
        model.player1.setPlayerState(PlayerState.OUT_GAME.name());
        model.player2.setPlayerState(PlayerState.OUT_GAME.name());
        model.comp.setPlayerState(PlayerState.OUT_GAME.name());
        model.player1.setPlayerSign(PlayerSign.N.name());
        model.player2.setPlayerSign(PlayerSign.N.name());
        model.comp.setPlayerSign(PlayerSign.N.name());
        setButtonsOnAction();

        /*

          @author Jacek Byzdra email: jacekbwwa@gmail.com
         */
    }

    /*

      @author Jacek Byzdra email: jacekbwwa@gmail.com
     */
}
