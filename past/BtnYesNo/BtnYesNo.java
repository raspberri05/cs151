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
    final int FRAME_WIDTH = 500;
    final int FRAME_HEIGHT = 250;
	JTextField txtDisplay ;
    	JButton btnYes ;
		JButton btnNO  ;
		JButton btnReset  ;
		JButton btnExit ; 
		String helloWorld = "Hello World!!!" ;

    public BtnYesNo () { // CTOR
		// xxx Create all the JComponets
		// xxx your code 
    	btnYes = new JButton("Yes!");
		btnNO  = new JButton("NO!");
		btnReset  = new JButton("Reset");
		btnExit  = new JButton("Exit");
		txtDisplay = new JTextField( helloWorld );

		// xxx add Listeners
		// xxx your code 
		BtnListener  btnListener  = new BtnListener ();
	  	btnYes.addActionListener(btnListener);                                    
	  	btnNO.addActionListener(btnListener);                                        
	  	btnReset.addActionListener(btnListener);                                        
	  	btnExit.addActionListener(btnListener);                                        

		// Create a JPanel
      	JPanel pnlMain = new JPanel();
		// xxx add all the JComponets to the panel
		// xxx your code 
		pnlMain.add(txtDisplay);                                        
      	pnlMain.add(btnYes);                                        
      	pnlMain.add(btnNO);                                     
      	pnlMain.add(btnReset);                                        
      	pnlMain.add(btnExit);                                        

		// xxx add panel to the frame
		// xxx your code 
      	this.add(pnlMain);                                     

		// initialize the frame
      	this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		// xxx fill in your full name and student id
		// xxx your code
      	this.setTitle("Naya Singhania (017192682)");
      	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      	this.setVisible(true);
	}
	// inner class
	class BtnListener  implements ActionListener { // inner class
		@Override
   		public void actionPerformed(ActionEvent e) {
			// xxx your code
			if ( e.getSource() == btnExit ) {
				// exit the program
				System.exit(0);
			} else if ( e.getSource() == btnReset ) {
				// xxx display the String helloWord
				// xxx your code
				txtDisplay.setText("Hello World!!!");
			} else {
				// xxx display the YES/NO message
				// xxx your code
	  			String s = (e.getSource() == btnYes) ? "YES!": "NO!" ;
					txtDisplay.setText(s);
				}
   		}
	}

   public static void main(String[] args)
   {
      JFrame frame = new BtnYesNo();
   }
}

