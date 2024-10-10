import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 * This frame contains a list of rectangles.
 */
public class RectangleFrame extends JFrame {
   private static final int FRAME_HEIGHT = 400;
   private static final int FRAME_WIDTH = FRAME_HEIGHT * 16 / 10;;

   private RectangleComponent scene;

   class MousePressListener implements MouseListener {
      @Override
      public void mousePressed(MouseEvent event) {
         scene.addRectangleAt(event.getX(), event.getY());
      }

      // Do-nothing methods
      @Override
      public void mouseReleased(MouseEvent event) {
      }

      // Do-nothing methods
      @Override
      public void mouseClicked(MouseEvent event) {
      }

      // Do-nothing methods
      @Override
      public void mouseEntered(MouseEvent event) {
      }

      // Do-nothing methods
      @Override
      public void mouseExited(MouseEvent event) {
      }
   }

   public RectangleFrame() { // xxx CTOR
      scene = new RectangleComponent();
      add(scene);
       

      // xxx your code
      MouseListener listener = new MousePressListener();
      scene.addMouseListener(listener);

      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      setLocation(FRAME_WIDTH / 2, FRAME_HEIGHT / 2);
   }
}
