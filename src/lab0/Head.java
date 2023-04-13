package lab0;

import java.awt.Color;
public class Head {

    private int width;
    private int height;

    private Color headColor = new Color(153,102,0);

    private Eyes aEyes;

    private Ears aEars;

    private Mouth aMouth;

    private Mustache aMustache;

    public Head(int width, int height){
        this.width = width;
        this.height = height;

        aEyes = new Eyes(15, 15);
        aMouth = new Mouth(20, 20);
        aEars = new Ears(20, 50);
        aMustache = new Mustache(20, 20);
    }

    public void drawAt(int left, int bottom){

        int x = left - 75;
        int y = bottom - 50;

        // Coordinates for Eye
        int xEye =  left - 10;
        int yEye = bottom - 10;

        // Coordinates for Ears
        int xEar =  left - 10;
        int yEar = bottom - 10;

        // Coordinates for the mouth
        int xMouth = left;
        int yMouth = bottom;

        int xMustache = left;
        int yMustache = bottom;

        // drawing the outer head shell

        Drawing.pen().setColor(headColor);
        Drawing.pen().fillOval(x, y, width, height);

        aEyes.drawAt(xEye, yEye);
        aMouth.drawAt(xMouth, yMouth);
        aEars.drawAt(xEar, yEar);
        aMustache.drawAt(xMustache, yMustache);

    }
}
