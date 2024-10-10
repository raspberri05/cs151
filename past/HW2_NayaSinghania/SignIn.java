import javax.swing.*;
import java.awt.*;

public class SignIn {
    public static void displaySignInForm() {
        JFrame frame = new JFrame("Login");

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        frame.setLocationRelativeTo(null);

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new Insets(5, 0, 5, 0);

        JTextField usernameField = new JTextField(20);
        JPasswordField passwordField = new JPasswordField(20);
        JButton loginButton = new JButton("Login");

        loginButton.addActionListener(e -> {
            String username = usernameField.getText().trim();
            String password = new String(passwordField.getPassword()).trim();

            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "No field can be empty", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                User user = Users.getUser(username);
                if (user == null) {
                    JOptionPane.showMessageDialog(frame, "No user found. Try again or create an account if you don't have one", "Login Failed", JOptionPane.ERROR_MESSAGE);
                } else if (!user.getPassword().equals(password)) {
                    JOptionPane.showMessageDialog(frame, "Incorrect password.", "Please try again", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Welcome, " + user.getFirstName() + " " + user.getLastName() + "!", "Logged in", JOptionPane.INFORMATION_MESSAGE);
                    displayUserProfile(user);
                    frame.dispose();
                }
            }
        });

        frame.add(new JLabel("Username:"), gridBagConstraints);
        frame.add(usernameField, gridBagConstraints);
        frame.add(new JLabel("Password:"), gridBagConstraints);
        frame.add(passwordField, gridBagConstraints);
        frame.add(loginButton, gridBagConstraints);

        frame.setVisible(true);
    }

    private static void displayUserProfile(User user) {
        JFrame profileFrame = new JFrame("Your Profile");
        profileFrame.setSize(400, 300);
        profileFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        profileFrame.setLayout(new GridBagLayout());

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);

        JLabel firstNameLabel = new JLabel("First Name: " + user.getFirstName());
        JLabel lastNameLabel = new JLabel("Last Name: " + user.getLastName());
        JLabel emailLabel = new JLabel("Email: " + user.getEmail());
        JLabel passwordLabel = new JLabel("Password: " + user.getPassword());

        profileFrame.add(firstNameLabel, gridBagConstraints);
        profileFrame.add(lastNameLabel, gridBagConstraints);
        profileFrame.add(emailLabel, gridBagConstraints);
        profileFrame.add(passwordLabel, gridBagConstraints);

        profileFrame.setVisible(true);
    }
}
