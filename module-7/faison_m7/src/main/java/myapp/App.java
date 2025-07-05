package myapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/*DeJanae Faison
 * M7: Create Panel containing circles using 
 * JavaFX and CSS
 * Due: 7.6.25
 */

 public class App extends Application {

    @Override
    public void start(Stage primaryStage){
        //Set Hbox with set spacing
        HBox hbox = new HBox(5);
        //Scene with hbox as root
        Scene scene = new Scene(hbox,300,200);
        //Attach stylesheet
        scene.getStylesheets().add("mystyle.css");

        //Add circles and their resepctive panes
        Pane pane1 = new Pane();
        Circle circle1 = new Circle(50,100,30);
        pane1.getChildren().addAll(circle1);
        pane1.getStyleClass().add("border");
        circle1.getStyleClass().add("plaincircle");

        Pane pane2 = new Pane();
        Circle circle2 = new Circle(50,100,30);
        pane2.getChildren().addAll(circle2);
        circle2.getStyleClass().add("plaincircle");

        Pane pane3 = new Pane();
        Circle circle3 = new Circle(50,100,30);
        pane3.getChildren().addAll(circle3);
        circle3.setId("redcircle");

        //Add Panes to hbox
        hbox.getChildren().addAll(pane1,pane2,pane3);
        //set the stage
        primaryStage.setTitle("Faison M7 CSS Java");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    //launch 
    public static void main(String[] args) {
        launch(args);
    }
 }