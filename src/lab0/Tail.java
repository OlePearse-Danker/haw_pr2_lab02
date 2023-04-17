package lab0;

import java.awt.*;

public class Tail {
    private int width;
    private int height;

    private Color tailColor1 = new Color(238,238,238);
    private Color tailColor2 = Color.BLACK;

    public Tail (int width, int height){

        this.width = width;
        this.height = height;
    }

    public void drawAt(int left, int bottom)
    {
        int x = left;
        int y = bottom;

        Drawing.pen().setColor(tailColor2);
        Drawing.pen().fillArc(x, y, 150, 150, 0, 90);
        Drawing.pen().setColor(tailColor1);
        Drawing.pen().fillArc(x, y + 10, 150, 150, 0, 90);

    }

}


