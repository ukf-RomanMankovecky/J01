package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Project2");
        HBox root = new HBox();
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        TextField tf1 = new TextField();
        root.getChildren().add(tf1);

        tf1.textProperty().addListener((observable, oldValue, newValue) -> {
            int samohlasky=0, spoluhlasky=0;
            for (int i=0; i<newValue.length(); i++)
            {
                String znak = newValue.substring(i, i + 1);
                if (znak.matches("[aeiouyäáéíóôúýAEIOUYÁÉÍÓÚÝ]"))
                {
                    samohlasky++;
                }
                if (znak.matches("[dtnlhkgďťňľcčžšjmbpvzsfrDTNLHKGĎŤŇĽCČŽŠJMBPVZSFR]"))
                {
                    spoluhlasky++;
                }
            }
            int r = (samohlasky*16>255) ? 255:(samohlasky*16);
            int g = (spoluhlasky*24>255) ? 255:(spoluhlasky*24);
            int b = (((newValue.length()%25)*10)>255) ? 255:((newValue.length()%25)*10);
            root.setBackground(new Background(new BackgroundFill(Color.rgb(r,g,b),null,null)));
        });
    }


    public static void main(String[] args) {
        launch(args);
    }
}
