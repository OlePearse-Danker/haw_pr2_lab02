package lab0;

import java.awt.Color;
public class Head {

    public int width;
    public int height;

    private Color headColor = new Color(153,102,0);

    int someValue1 = RandomNumber.between(1,255);
    int someValue2 = RandomNumber.between(1,255);
    int someValue3 = RandomNumber.between(1,255);
    private Color random_headColor = new Color(someValue1, someValue2, someValue3);

    private Eyes aEyes;

    private Ears ears;

    private Mouth aMouth;

    private Mustache aMustache;

    public Head(int width, int height){
        this.width = width;
        this.height = height;

        this.aEyes = new Eyes(width * 3/20, height * 3/20);
        this.aMouth = new Mouth(width/5, height/5);
        this.ears = new Ears(width/5, height/2);
        this.aMustache = new Mustache(width/5, height/5);
    }

    public void drawAt(int left, int bottom){

        int x = left - 75;
        int y = bottom - 50;

        // Coordinates for Eye
        int xEye = left - 10;
        int yEye = bottom - 10;

        // Coordinates for Ears
        int xEar = left - 10;
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
        ears.drawAt(xEar, yEar);
        aMustache.drawAt(xMustache, yMustache);

    }
    public void drawAt_random(int left, int bottom){

        int x = left - 75;
        int y = bottom - 50;

        // Coordinates for Eye
        int xEye = left - 10;
        int yEye = bottom - 10;

        // Coordinates for Ears
        int xEar = left - 10;
        int yEar = bottom - 10;

        // Coordinates for the mouth
        int xMouth = left;
        int yMouth = bottom;

        int xMustache = left;
        int yMustache = bottom;

        // drawing the outer head shell

        Drawing.pen().setColor(random_headColor);
        Drawing.pen().fillOval(x, y, width, height);

        aEyes.drawAt(xEye, yEye);
        aMouth.drawAt(xMouth, yMouth);
        ears.drawAt(xEar, yEar);
        aMustache.drawAt(xMustache, yMustache);

    }
}
