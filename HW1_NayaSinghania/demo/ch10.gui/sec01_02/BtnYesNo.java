import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
   This program shows a frame that is filled with two components.
*/
public class BtnYesNo
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      
      JButton btnYes = new JButton("Yes!");
      JButton btnNO  = new JButton("NO!");

      JPanel panel = new JPanel();
      panel.add( btnYes );
      panel.add( btnNO  );
      frame.add(panel);

      final int FRAME_WIDTH = 300;
      final int FRAME_HEIGHT = 100;
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setTitle("Your_full_name (Student Id)");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.setVisible(true);
   }
}

