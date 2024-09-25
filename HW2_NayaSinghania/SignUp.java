import javax.swing.*;
import java.awt.*;
import java.awt.event.* ;
import java.util.Random;

class SubmitButtonListener implements  ActionListener {
	JFrame frame ;
    JTextField firstNameField ;  
    JTextField lastNameField ; 
    JTextField emailField ; 
    JPasswordField passwordField ;

    private static String createUsername(String firstName, String lastName) {
        Random rand = new Random();
        StringBuilder randNum = new StringBuilder(4);

        for (int i = 0; i < 4; i++) {
            randNum.append(rand.nextInt(10));
        }
        
        return "" + firstName.charAt(0) + lastName.charAt(0) + "-" + randNum;
    }

    private static void passwordRequirementCheck(String password) throws PasswordException {
        if (password.length() < 8) throw new Minimum8CharactersRequired();
        if (!password.matches(".*\\d.*")) throw new NumberCharacterMissing();
        if (!password.matches(".*[a-z].*")) throw new LowerCaseCharacterMissing();
        if (!password.matches(".*[A-Z].*")) throw new UpperCaseCharacterMissing();
        if (!password.matches(".*[!@#$%^&*()].*")) throw new SpecialCharacterMissing();
    }

	public SubmitButtonListener ( JFrame frame, JTextField firstNameField , JTextField lastNameField , JTextField emailField , JPasswordField passwordField ) {
			this.frame = frame;
    		this.firstNameField = firstNameField;  
    		this.lastNameField =  lastNameField; 
    		this.emailField =  emailField; 
    		this.passwordField = passwordField ;
	}

	public void actionPerformed(ActionEvent e) {
        String firstName = firstNameField.getText().trim();
        String lastName = lastNameField.getText().trim();
        String email = emailField.getText().trim();
        String password = new String(passwordField.getPassword()).trim();

        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "No field can be empty", "Error", JOptionPane.ERROR_MESSAGE);
         } 
         else {
            try {
                passwordRequirementCheck(password);
                String username = createUsername(firstName, lastName);
                User newUser = new User(firstName, lastName, email, username, password);
                Users.addUser(newUser);
                JOptionPane.showMessageDialog(frame, "Your username is: " + username, "Success", JOptionPane.INFORMATION_MESSAGE);
                frame.dispose();
            } catch (PasswordException e1) {
                JOptionPane.showMessageDialog(frame, e1.getMessage(), "Error. Please try again", JOptionPane.ERROR_MESSAGE);
            }
        }
	}
}

public class SignUp {
    public static void displaySignupForm() {
    	JFrame frame = new JFrame("Signup");

        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        frame.setLocationRelativeTo(null);

    	JTextField firstNameField = new JTextField(20);
    	JTextField lastNameField = new JTextField(20);
    	JTextField emailField = new JTextField(20);
    	JPasswordField passwordField = new JPasswordField(20);


        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new Insets(5, 0, 5, 0);

        JButton submitButton = new JButton("Sign Up");


    	SubmitButtonListener submitButtonListener =  new  SubmitButtonListener(
			frame, firstNameField, lastNameField, emailField, passwordField ) ;
        submitButton.addActionListener( submitButtonListener );

        frame.add(new JLabel("First Name:"), gridBagConstraints);
        frame.add(firstNameField, gridBagConstraints);
        frame.add(new JLabel("Last Name:"), gridBagConstraints);
        frame.add(lastNameField, gridBagConstraints);
        frame.add(new JLabel("Email:"), gridBagConstraints);
        frame.add(emailField, gridBagConstraints);
        frame.add(new JLabel("Password:"), gridBagConstraints);
        frame.add(passwordField, gridBagConstraints);
        frame.add(submitButton, gridBagConstraints);

        frame.setVisible(true);
    }

}
