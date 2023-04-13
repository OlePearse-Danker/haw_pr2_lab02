package lab0;

import java.awt.Color;
public class Legs {
    private int width;
    private int height;

    private Color legColor = Color.BLACK;

    public Legs(int width, int height){

        this.width = width;
        this.height = height;
    }

    public void drawAt(int left, int bottom)
    {
        int x = left + 210;
        int y = bottom + 90;

        Drawing.pen().setColor(legColor);
        Drawing.pen().fillRect(x, y, width, height);
        Drawing.pen().fillRect(x - 150, y, width, height);
    }
}
