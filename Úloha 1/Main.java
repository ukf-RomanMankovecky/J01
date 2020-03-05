package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Project1");
        Group root = new Group();
        Scene scene = new Scene(root,720,406, Color.BLACK);
        primaryStage.setScene(scene);

        Polyline YrdenCore = new Polyline(new double[] {110,215,100,225,140,225,100,175,140,175,130,185});
        Polyline Yrden = new Polyline(new double[] {110,215,100,225,140,225,100,175,140,175,130,185});
        YrdenCore.setStroke(Color.WHITE);
        YrdenCore.setStrokeWidth(3);
        Yrden.setStroke(Color.PURPLE);
        Yrden.setStrokeWidth(7);
        DropShadow Light = new DropShadow(60,Color.PURPLE);
        Light.setSpread(0.7);
        Yrden.setEffect(Light);

        Polyline QuenCore = new Polyline(new double[] {250,205,240,225,215,175,270,175,260,190,245,190});
        Polyline Quen = new Polyline(new double[] {250,205,240,225,215,175,270,175,260,190,245,190});
        QuenCore.setStroke(Color.WHITE);
        QuenCore.setStrokeWidth(3);
        Quen.setStroke(Color.YELLOW);
        Quen.setStrokeWidth(7);
        DropShadow Light2 = new DropShadow(50,Color.YELLOW);
        Light2.setSpread(0.5);
        Quen.setEffect(Light2);

        Polyline IgnyCore = new Polyline(new double[] {365,170,340,225,390,225,375,195});
        Polyline Igny = new Polyline(new double[] {365,170,340,225,390,225,375,195});
        IgnyCore.setStroke(Color.WHITE);
        IgnyCore.setStrokeWidth(3);
        Igny.setStroke(Color.RED);
        Igny.setStrokeWidth(7);
        DropShadow Light3 = new DropShadow(60,Color.RED);
        Light3.setSpread(0.7);
        Igny.setEffect(Light3);

        Polyline AxiiCore = new Polyline(new double[] {505,190,485,225,455,175,515,175});
        Polyline Axii = new Polyline(new double[] {505,190,485,225,455,175,515,175});
        AxiiCore.setStroke(Color.WHITE);
        AxiiCore.setStrokeWidth(3);
        Axii.setStroke(Color.GREEN);
        Axii.setStrokeWidth(7);
        DropShadow Light4 = new DropShadow(60,Color.GREEN);
        Light4.setSpread(0.7);
        Axii.setEffect(Light4);

        Polyline AardCore = new Polyline(new double[] {598,190,605,175,635,225,580,225,590,205,605,205});
        Polyline Aard = new Polyline(new double[] {598,190,605,175,635,225,580,225,590,205,605,205});
        AardCore.setStroke(Color.WHITE);
        AardCore.setStrokeWidth(3);
        Aard.setStroke(Color.TEAL);
        Aard.setStrokeWidth(7);
        DropShadow Light5 = new DropShadow(60,Color.TEAL);
        Light5.setSpread(0.7);
        Aard.setEffect(Light5);

        root.getChildren().addAll(Yrden,YrdenCore,Quen,QuenCore,Igny,IgnyCore,Axii,AxiiCore,Aard,AardCore);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
