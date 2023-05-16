

package lab0;

import javax.swing.*;
import java.awt.*;


public class DrawingArea extends JPanel {

    private static final long serialVersionUID = 1L;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Drawing.set(g);


        Scene scene = new Scene();
        scene.drawAt(123, 123);

    }
}



