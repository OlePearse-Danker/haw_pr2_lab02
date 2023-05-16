package lab0;

import java.awt.*;

public class Legs {
    private int width; // q: value of width?
    private int height;

    private Color legColor = Color.BLACK;

    public Legs(int width, int height) {

        this.width = width /3; // q: what is the value of width?
        this.height = height /3; // q: what is the value of height?
    }

    public void drawAt(int left, int bottom) {
        int x = (int) (left + (height * 4.2)); // q: what is the value of height?
        int y = (int) (bottom - (height * 1.6));

        Drawing.pen().setColor(legColor);
        Drawing.pen().fillRect(x, y, width, height);
        Drawing.pen().fillRect((int) (x - (height * 3)), y, width, height);

    }
}

// q: how can I make the cat scalable?  (i.e. change the size of the cat)