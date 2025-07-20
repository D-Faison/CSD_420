import java.awt.*;
import javax.swing.*;
/* GUI For M10 */

public class GUI extends JFrame {
    //Database Variable
    Faison10Fan db = new Faison10Fan();
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
        // Frame settings
        setTitle("Fan Management App");
        setSize(600,600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(133, 149, 219));
        setLayout(new GridLayout(5,2));

        //ID section
        idLabel = new JLabel("Enter ID:");
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

        displayButton.setBackground(new Color(128, 255, 217));
        updateButton.setBackground(new Color(227, 176, 255));

        //Action Listener for Display Button
        displayButton.addActionListener(e -> {
            try{
                // Get ID from text field and fetch fan details
                int id = Integer.parseInt(idTextField.getText().trim());
                Records fan = db.getFanById(id);
                // Check if fan exists
                if (fan != null) {
                    firstNameTextField.setText(fan.getFirstName());
                    lastNameTextField.setText(fan.getLastName());
                    favoriteTeamTextField.setText(fan.getFavoriteTeam());
                } else {
                    // Show error message if fan not found
                    JOptionPane.showMessageDialog(this, "Fan not found!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                // Show error message for invalid ID format
                JOptionPane.showMessageDialog(this, "Invalid ID format!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });


        //Action Listener for Update Button
        updateButton.addActionListener(e -> {
            try {
                // Get values from text fields and create Records object
                int id = Integer.parseInt(idTextField.getText().trim());
                String firstName = firstNameTextField.getText().trim();
                String lastName = lastNameTextField.getText().trim();
                String favoriteTeam = favoriteTeamTextField.getText().trim();
                // Validate input
                if (firstName.isEmpty() || lastName.isEmpty() || favoriteTeam.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "All fields must be filled out!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                // Create Records object and update fan details
                Records fan = new Records();
                fan.setId(id);
                fan.setFirstName(firstName);
                fan.setLastName(lastName);
                fan.setFavoriteTeam(favoriteTeam);
                // Call update method from database class
                boolean updated = db.updateFan(fan);
                if (updated) {
                    JOptionPane.showMessageDialog(this, "Fan updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Error updating fan!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                // Show error message for invalid ID format
                JOptionPane.showMessageDialog(this, "Invalid ID format!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
    // Main method to run the GUI application
    public static void main(String[] args) {
        GUI frame = new GUI();
        frame.setVisible(true);
    }


}
