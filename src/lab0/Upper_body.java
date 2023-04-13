package lab0;

import java.awt.*;

public class Upper_body {

    private int width;
    private int height;

    private Color upper_body_color = new Color(153,102,0);

    public Upper_body(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void drawAt(int left, int bottom) {

        // drawing the upper body
        Drawing.pen().setColor(upper_body_color);
        Drawing.pen().fillOval(left, bottom, width, height);

    }
}
