
package lab0;

import java.awt.Color;
public class Eyes {
    private int width;
    private int height;

    private Color eyeColor = Color.BLACK;

    public Eyes(int width, int height){

        this.width = width;
        this.height = height;
    }

    public void drawAt(int left, int bottom)
    {
        int x = left;
        int y = bottom - 8;

        Drawing.pen().setColor(eyeColor);
        Drawing.pen().fillOval(x, y, width, height);
        Drawing.pen().fillOval(x - 50, y, width, height);
    }

}
