package lab0;

import java.awt.*;

public class Mustache {
    private int width;
    private int height;

    private Color MustacheColor = Color.BLACK;

    public Mustache(int width, int height){

        this.width = width;
        this.height = height;
    }

    public void drawAt(int left, int bottom)
    {
        int x = left - 60;
        int y = bottom + 20;

        Drawing.pen().setColor(MustacheColor);
        Drawing.pen().drawArc(x, y, 75, 75, 0, 180);

    }

}
