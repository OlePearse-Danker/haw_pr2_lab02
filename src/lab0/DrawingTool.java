/**
 * Provides a test application window with a panel "DrawingArea".
 *
 * @author Björn Gottfried
 * @version 1.0
 * @runsWith JAVA 1.8
 *
 * In this file, you just have to change the title of your window.
 *
 */

package lab0;

import javax.swing.JFrame;
import java.awt.*;

@SuppressWarnings("serial")
public class DrawingTool extends JFrame {
    private DrawingArea drawing;

    public DrawingTool(String title) {
        super(title);

        constructDrawingArea();

        Dimension screenSize = getToolkit().getScreenSize();
        setBounds(0, 0, screenSize.width, screenSize.height);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    private void constructDrawingArea() {
        drawing = new DrawingArea();
        add(drawing);
    }

    public static void main(String[] args) {
        new DrawingTool("This is a Cat");
    }
}
