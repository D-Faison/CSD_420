
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/*M12 Redo Assignment
 * DeJanae Faison
 * Create using JavaFX a program that displays four random cards from the images in the resources folder.
 * The program should display the cards in a grid layout and allow the user to click a button to generate a new set of random cards.
 */
public class Main extends Application {
    // Display for cards, so it can be publicly accessed
    HBox cardDisplay = new HBox(10);

    @Override
    public void start(Stage mainStage){
        //Font Variable
        Font font = Font.font("Arial", FontWeight.BOLD, 25);

        Label headerLabel = new Label("Random Cards");
        headerLabel.setFont(font);
        headerLabel.setTextFill(Color.WHITE);

        //Button
        Button refreshButton = new Button("New Cards");
        // Lambda expression, when pressed execute function
        refreshButton.setOnAction(e -> displayRandomCards());
        refreshButton.setAlignment(Pos.BOTTOM_CENTER);
        refreshButton.setStyle("-fx-background-color:rgb(124, 255, 216)");
        refreshButton.setFont(font);
        //Root to hold all the nodes
        BorderPane root = new BorderPane();
        //Node Placement
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
    private void displayRandomCards() {
        // Clear the current card display
        cardDisplay.getChildren().clear();
        // Generate and display four random cards with their matching images
        
    }
    public static void main(String[] args) {
        launch(args);
    }
}
