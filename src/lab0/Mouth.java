package lab0;

import java.awt.Color;
public class Mouth {

    private int width;
    private int height;

    private Color mouthColor = Color.BLACK;

    public Mouth(int width, int height){

        this.width = width;
        this.height = height;
    }

    public void drawAt(int left, int bottom)
    {
        int x = left - 35;
        int y = bottom + 10;

        Drawing.pen().setColor(mouthColor);
        Drawing.pen().fillRect(x, y, width, height);

    }
}
