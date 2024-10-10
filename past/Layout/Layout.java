import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class Layout extends JFrame {

    public Layout() {
        JPanel main = new JPanel(new BorderLayout());
        JPanel sixButton = new JPanel(new GridLayout(3,2));
        JPanel six = new JPanel(new BorderLayout());
        JPanel east = new JPanel(new GridLayout(4,1));

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b0 = new JButton("0");
        JButton period = new JButton(".");

        sixButton.add(b7);
        sixButton.add(b8);
        sixButton.add(b4);
        sixButton.add(b5);
        sixButton.add(b1);
        sixButton.add(b2);

        east.add(b9);
        east.add(b6);
        east.add(b3);
        east.add(period);

        six.add(sixButton, BorderLayout.CENTER);
        six.add(b0, BorderLayout.SOUTH);
        main.add(six, BorderLayout.WEST);
        main.add(east, BorderLayout.EAST);

        add(main);
    }
	public static void main(String[] args) {
        Layout frame = new Layout();
        frame.setSize(200, 205);
        frame.setTitle("Naya Singhania - 017192682");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}