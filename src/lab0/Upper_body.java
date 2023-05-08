package lab0;

import java.awt.*;

public class Upper_body {

    public int width;
    public int height;

    private Color upper_body_color = new Color(153,102,0);

    int someValue1 = RandomNumber.between(1, 255);
    int someValue2 = RandomNumber.between(1, 255);
    int someValue3 = RandomNumber.between(1, 255);

    private Color random_upper_body_color = new Color(someValue1,someValue2,someValue3);

    private Tail aTail;
    private Legs aLegs;


    public Upper_body(int width, int height) {
        this.width = width;
        this.height = height;

        this.aTail = new Tail(width/10, height/10);
        this.aLegs = new Legs(width/5, width/2);

    }

    public void drawAt(int left, int bottom) {

        int xTail = left + 224;
        int yTail = bottom + 45;

        int xLegs = left;
        int yLegs = bottom + 170;

        // drawing the upper body
        Drawing.pen().fillOval(left, bottom, width, height);

        aTail.drawAt(xTail, yTail);
        aLegs.drawAt(xLegs, yLegs);

    }

    public void drawAt_classic(int left, int bottom) {

/*
        int xTail = left + 224;
        int yTail = bottom + 45;

        int xLegs = left;
        int yLegs = bottom + 170;
*/

        // drawing the upper body
        Drawing.pen().setColor(upper_body_color);
/*
        Drawing.pen().fillOval(left, bottom, width, height);

        aTail.drawAt(xTail, yTail);
        aLegs.drawAt(xLegs, yLegs);
*/
        this.drawAt(left, bottom);
    }

    public void drawAt_random(int left, int bottom) {
/*        int xTail = left + 224;
        int yTail = bottom + 45;

        int xLegs = left;
        int yLegs = bottom + 170;

        // drawing the upper body
        Drawing.pen().setColor(random_upper_body_color);
        Drawing.pen().fillOval(left, bottom, width, height);

        aTail.drawAt(xTail, yTail);
        aLegs.drawAt(xLegs, yLegs);*/

        Drawing.pen().setColor(random_upper_body_color);
        this.drawAt(left, bottom);

    }


}
