import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;

/**
   This program shows a frame that is filled with two components.
*/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
   An action listener that prints a message.
*/
public class BtnYesNo extends JFrame {
    final int FRAME_WIDTH = 300;
    final int FRAME_HEIGHT = 100;
    JButton btnYes;
    JButton btnNO ; 
    JButton btnExit ; 
	JTextField txtDisplay;

    public BtnYesNo () { // CTOR
		// xxx Create all the JComponets
		// xxx your code 
    	btnYes = new JButton("Yes!");
		btnNO  = new JButton("NO!");
		btnExit  = new JButton("Exit");
	  	txtDisplay = new JTextField("Hello World!!!");

		// xxx add Listeners
		// xxx your code 
	  	btnYes.addActionListener ( new btnListerner() );
	  	btnNO .addActionListener ( new btnListerner() );
	  	btnExit.addActionListener ( new btnListerner() );

		// Create a JPanel
      	JPanel pnlMain = new JPanel();
		// xxx add all the JComponets to the panel
		// xxx your code 
      	pnlMain.add( btnYes );
      	pnlMain.add( btnNO  );
      	pnlMain.add( txtDisplay  );
      	pnlMain.add( btnExit  );

		// xxx add panel to the frame
		// xxx your code 
      	this.add(pnlMain);

		// initialize the frame
      	this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		// xxx fill in your full name and student id
		// xxx your code
      	this.setTitle("Your_full_name (Student Id)");
      	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      	this.setVisible(true);
	}
	class btnListerner implements ActionListener { // inner class
		@Override
   		public void actionPerformed(ActionEvent e) {
			if ( e.getSource() == btnExit ) {
				// exit the program
				System.exit(0);
			} else {
				// xxx print the YES/NO message
				// xxx your code
	  			String s = (e.getSource() == btnYes) ? "YES": "NO" ;
				txtDisplay.setText (s);
			}
   		}
	}

   public static void main(String[] args)
   {
      JFrame frame = new BtnYesNo();
   }
}

