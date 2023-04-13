package lab0;

import java.awt.Color;

public class Ears {
    private int width;
    private int height;

    private Color earColor = Color.BLACK;

    public Ears(int width, int height){

        this.width = width;
        this.height = height;
    }

    public void drawAt(int left, int bottom)
    {
        int x = left;
        int y = bottom - 80;

        Drawing.pen().setColor(earColor);
        Drawing.pen().fillRoundRect(x, y, width, height,50,50);
        Drawing.pen().fillRoundRect(x - 50, y, width, height,50,50);
    }
}
