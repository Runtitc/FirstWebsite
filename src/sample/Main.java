package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    private GridPane grid;

    private Text sceneTitle;
    private Label userNameLabel, passwordLabel;
    private TextField UsernameField;
    private PasswordField passwordField;
    private Button button;
    private HBox hBoxPane;
    private final Text notification = new Text();
    private String cssPath;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        primaryStage.setTitle("Hello World");

        sceneTitle = new Text("Moj pierwszy program");
        grid.add(sceneTitle, 0, 0, 2, 1);

        userNameLabel = new Label("Imie: ");
        grid.add(userNameLabel, 0, 1);

        UsernameField = new TextField();
        grid.add(UsernameField, 1, 1);

        passwordLabel = new Label("Haslo: ");
        grid.add(passwordLabel, 0, 2);

        passwordField = new PasswordField();
        grid.add(passwordField, 1, 2);

        button = new Button("Przycisnij");
        hBoxPane = new HBox(10);
        hBoxPane.setAlignment(Pos.BOTTOM_RIGHT);
        hBoxPane.getChildren().add(button);
        grid.add(hBoxPane, 1, 4);


        primaryStage.setScene(new Scene(grid, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
