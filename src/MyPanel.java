import javax.swing.*;
import java.awt.*;
/* Unnecessary
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
 */

class MyPanel extends JPanel {
    boolean showCircle;
    private int width = 200;
    private int height = 40;
    private int colour = 0;
    // private Color[] colours = {Color.WHITE, Color.BLACK, Color.BLUE};
    private boolean white = true;


    MyPanel() {
        //showCircle = false;
        setPreferredSize(new Dimension(width, height));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //if	(showCircle)  <-- implement next
        /* change colour
        if (white) {
            g.setColor(Color.BLUE);
            System.out.println("BlLUE");
        } else {
            g.setColor(Color.BLACK);
            System.out.println("BLACK");
        }
         */
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, 200, 20);
    }

}
