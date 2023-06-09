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

public class DrawingTool extends JFrame {

    private static final long serialVersionUID = 1L;

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
        DrawingTool drawingTool = new DrawingTool("This is a Cat");
        drawingTool.constructDrawingArea();

        System.out.println("App started.");
    }
}



