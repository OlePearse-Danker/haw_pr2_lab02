package lab0;

import java.awt.Color;

public class Tail {

    private int width;
    private int height;

    // change cutting Arc color to match the background -> this forms the Tail
    private Color tailColor1 = new Color(238,238,238);
    private Color tailColor2 = Color.BLACK;



    public Tail (int width, int height){
        this.width = width;
        this.height = height;
    }

    public void drawAt(int left, int bottom){

        Drawing.pen().setColor(tailColor2);
        Drawing.pen().fillArc(624, 345, 150, 150, 0, 90);
        Drawing.pen().setColor(tailColor1);
        Drawing.pen().fillArc(624, 355, 150, 150, 0, 90);

    }
}
