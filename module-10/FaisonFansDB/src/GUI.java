import java.awt.*;
import javax.swing.*;
/* GUI For M10 */

public class GUI extends JFrame {

    //UI Components: Labels
    static JLabel idLabel;
    static JLabel firstNameLabel;
    static JLabel lastNameLabel;
    static JLabel favoriteTeamLabel;

    //Text Fields
    static JTextField idTextField; 
    static JTextField firstNameTextField;
    static JTextField lastNameTextField;
    static JTextField favoriteTeamTextField;

    //Buttons
    static JButton displayButton;
    static JButton updateButton;

    public GUI() {
        setTitle("Fan Management App");
        setSize(600,600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(133, 149, 219));
        setLayout(new GridLayout(6,2));

        //ID section
        idLabel = new JLabel("ID:");
        add(idLabel);

        idTextField = new JTextField();
        add(idTextField);

        // First Name section
        firstNameLabel = new JLabel("First Name:");
        add(firstNameLabel);
        firstNameTextField = new JTextField();
        add(firstNameTextField);

        // Last Name section
        lastNameLabel = new JLabel("Last Name:");
        add(lastNameLabel);
        lastNameTextField = new JTextField();
        add(lastNameTextField);

        // Favorite Team section
        favoriteTeamLabel = new JLabel("Favorite Team:");
        add(favoriteTeamLabel);
        favoriteTeamTextField = new JTextField();
        add(favoriteTeamTextField);

        //Buttons
        displayButton = new JButton("Display");
        add(displayButton);
        updateButton = new JButton("Update");
        add(updateButton);
    }

    public static void main(String[] args) {
        GUI frame = new GUI();
        frame.setVisible(true);
    }


}
