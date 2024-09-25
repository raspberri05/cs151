import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        JFrame frame = new JFrame("Chatterbox");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagConstraints.insets = new Insets(5,0,5,0);

        JLabel welcomeLabel = new JLabel("Welcome!", SwingConstants.CENTER);
        Font currentFont = welcomeLabel.getFont();
        welcomeLabel.setFont(new Font(currentFont.getName(), currentFont.getStyle(), 20));
        JButton signupButton = new JButton("Create Account");
        JButton signinButton = new JButton("Login");
        JButton closeButton = new JButton("Close");

        signupButton.addActionListener(e -> {
            SignUp.displaySignupForm();
        });
        signinButton.addActionListener(e  -> {
            SignIn.displaySignInForm();
        });
        closeButton.addActionListener(e -> {
            for (Window w : Window.getWindows()) {
                w.dispose();
            }
        });

        frame.add(welcomeLabel, gridBagConstraints);
        frame.add(signupButton, gridBagConstraints);
        frame.add(signinButton,  gridBagConstraints);
        frame.add(closeButton,  gridBagConstraints);

        frame.setVisible(true);
    });
    }
    
}
