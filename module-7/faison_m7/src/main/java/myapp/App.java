package myapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
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
        Scene scene = new Scene(hbox,500,450);


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