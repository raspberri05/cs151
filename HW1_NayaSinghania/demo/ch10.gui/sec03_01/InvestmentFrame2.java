import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

/**
   A frame that shows the growth of an investment with variable interest.
*/
public class InvestmentFrame2 extends JFrame
{    
   private static final int FRAME_WIDTH = 450;
   private static final int FRAME_HEIGHT = 100;

   private static final double DEFAULT_RATE = 5;
   private static final double INITIAL_BALANCE = 1000;   

   private JLabel rateLabel;
   private JTextField rateField;
   private JButton btnInterest ;
   private JButton btnReset;
   private JLabel lblResult;
   private double balance;
 
   public InvestmentFrame2()
   {  
      balance = INITIAL_BALANCE;

      lblResult = new JLabel("Balance: " + balance);

      createTextField();
      createButton();
      createPanel();

      setSize(FRAME_WIDTH, FRAME_HEIGHT);
   }

   private void createTextField()
   {
      rateLabel = new JLabel("Interest Rate: ");

      final int FIELD_WIDTH = 10;
      rateField = new JTextField(FIELD_WIDTH);
      rateField.setText("" + DEFAULT_RATE);
   }

   /**
      Adds interest to the balance and updates the display.
   */
   class AddResetListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         balance = INITIAL_BALANCE;
         lblResult.setText("Balance: " + balance);
      }
   }

   /**
      Adds interest to the balance and updates the display.
   */
   class AddInterestListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         double rate = Double.parseDouble(rateField.getText());
         double interest = balance * rate / 100;
         balance = balance + interest;
         lblResult.setText("Balance: " + balance);
      }            
   }
      
   private void createButton()
   {
      btnInterest  = new JButton("Add Interest");
      btnReset = new JButton("Reset");
      
      ActionListener listener = new AddInterestListener();
      btnInterest.addActionListener(listener);

      ActionListener btnReseetListenser = new AddResetListener();
      btnReset.addActionListener(btnReseetListenser);
   }

   private void createPanel()
   {
      JPanel panel = new JPanel();
		// panel.setLayout(new BorderLayout());
		panel.setLayout(new GridLayout(1, 5, 20, 25));
      panel.add(rateLabel);
      panel.add(rateField);
      panel.add(btnInterest);
      panel.add(lblResult);      
      panel.add(btnReset);
      add(panel);
   } 
}

