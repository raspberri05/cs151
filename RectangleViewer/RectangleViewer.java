import javax.swing.JFrame;

/**
 * This program displays a list of rectangles that can be added to with the
 * mouse.
 */
public class RectangleViewer {
    public static void main(String[] args) {
        JFrame frame = new RectangleFrame();
        // create a panel with a text and add it to the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("CS151-02 Naya Singhania (017192682)");
        frame.setVisible(true);
    }
}
