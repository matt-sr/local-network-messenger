import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("fxml_layout.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml_layout.fxml"));
        primaryStage.setTitle("Jeff Messenger");

        primaryStage.setScene(new Scene(root, 500, 350));
        primaryStage.show();

        Button sendButton = (Button) loader.getNamespace().get("send");
        sendButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });

    }
}
