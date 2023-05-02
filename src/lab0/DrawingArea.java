/**
 * Provides a panel on which an object of class "Graphics" can draw.
 *
 * @author Björn Gottfried
 * @version 1.0
 * @runsWith JAVA 1.8
 *
 * In this file, you have to add two lines of code:
 * 		+ instantiate one object of your domain class
 * 		+ call its drawAt-method
 */

package lab0;

import javax.swing.*;
import java.awt.*;


public class DrawingArea extends JPanel {

    private static final long serialVersionUID = 1L;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Drawing.set(g);

        // here comes your code...


        // please, don't use the following commands in this file
        // use them ONLY in your "drawAt"-methods of YOUR domain classes!!!
/*        Drawing.pen().drawLine(10, 400, 400, 400);
        Drawing.pen().drawRect(300, 300, 50, 50);
        Drawing.pen().setColor(Color.BLUE);
        Drawing.pen().fillRect(400, 500, 80, 30);
        Drawing.pen().drawOval(200, 500, 50, 50);*/

        Scene scene = new Scene();

        // points cat at the address of the reliance on the parameters left and bottom
/*        Point address3 = new Point(600, 600);

        Cat aCat = new Cat(address3,100,100);
        aCat.drawAt(100, 100);*/


    }
}