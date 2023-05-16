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
        int y = bottom - 80; // q: what value does bottom have when this is called?


        Drawing.pen().setColor(earColor);
        Drawing.pen().fillRoundRect(x, y, width , height,50,50); // right ear
        Drawing.pen().fillRoundRect(x - 50, y, width, height,50,50); // left ear
    }
}

// q: what value does width and height have when this is called?

// q: where did I define the value of bottom and left?