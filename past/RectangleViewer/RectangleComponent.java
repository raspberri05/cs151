import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.JComponent;

/**
 * This component displays a list of rectangles.
 */
public class RectangleComponent extends JComponent {
   private static final int BOX_WIDTH = 20;
   private static final int BOX_HEIGHT = 30;

   private ArrayList<Rectangle> boxes;

   public RectangleComponent() {
      boxes = new ArrayList<Rectangle>();
   }

   @Override
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Graphics2D g2 = (Graphics2D) g;
      for (Rectangle box : boxes) {
         g2.draw(box);
      }
      g2.drawString("Click anywhere in the window to draw a rectangle", 0, 10);
   }

   /**
    * Moves the rectangle to the given location.
    * 
    * @param x the x-position of the new location
    * @param y the y-position of the new location
    */
   public void addRectangleAt(int x, int y) {
      Rectangle rect = new Rectangle(x, y, BOX_WIDTH, BOX_HEIGHT);
      boxes.add(rect);
      repaint();
   }
}
