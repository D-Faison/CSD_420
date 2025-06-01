package faison_cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/*DeJanae Faison  
 * M1 Assignment 6.1.25
 * Random Card Display
*/
public class Main extends Application {

    HBox cardDisplay = new HBox(10);


    @Override
    public void start(Stage mainStage){

        Font font = Font.font("Arial",FontWeight.BOLD,25);

        Label headerLabel = new Label("Random Cards");
        headerLabel.setFont(font);
        headerLabel.setTextFill(Color.WHITE);
        //Button
        Button refreshButton = new Button("New Cards");
        refreshButton.setOnAction(e  -> displayRandomCards());
        refreshButton.setAlignment(Pos.BOTTOM_CENTER);
        refreshButton.setStyle("-fx-background-color:rgb(124, 255, 216)");
        refreshButton.setFont(font);

        

        //Initial Card View
        displayRandomCards();

        BorderPane root = new BorderPane();

        root.setTop(headerLabel);
        root.setCenter(cardDisplay);
        root.setBottom(refreshButton);
        
        BorderPane.setAlignment(headerLabel,Pos.CENTER);
        BorderPane.setAlignment(cardDisplay, Pos.CENTER);
        BorderPane.setAlignment(refreshButton, Pos.BOTTOM_CENTER);
        root.setStyle("-fx-background-color: #094218;");
        
        BorderPane.setMargin(refreshButton,new Insets(10,10,20,0));
        BorderPane.setMargin(cardDisplay,new Insets(20));

        Scene scene = new Scene(root,700,400);
        //Prevent Resizing
        mainStage.setResizable(false);
        mainStage.setTitle("Faison M1 Random Cards");
        mainStage.setScene(scene);
        mainStage.show();
    }

    //Card Logic
    private void displayRandomCards(){
        cardDisplay.getChildren().clear();

        List<Integer> cardNumbers = new ArrayList<>();

        for (int i = 1; i <= 52; i++) {
            cardNumbers.add(i);
        }
        Collections.shuffle(cardNumbers);
        List<Integer> randomSelectedCards = cardNumbers.subList(0, 4);
        
        randomSelectedCards.forEach(cardNum -> {

            String imagePath = "/AssignmentCards/"+cardNum+".png";
            Image image = new Image(getClass().getResourceAsStream(imagePath));
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(150);
            imageView.setPreserveRatio(true);
            cardDisplay.getChildren().add(imageView);
        });
    }

    public static void main(String[] args){
        launch(args);
    }
}
