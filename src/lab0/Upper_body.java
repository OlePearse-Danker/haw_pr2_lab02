package lab0;

import java.awt.*;

public class Upper_body {

    public int width; // q: what value does width and height have when this is called?
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

        int xTail = (int) (left + (height * 2.24));
        int yTail = (int) (bottom + (height * 0.45));

        int xLegs = left;
        int yLegs = (int) (bottom + (height * 1.7)); // q: what is the value of height here?   a: 200

        // drawing the upper body3
        Drawing.pen().fillOval(left, bottom, width, height);

        aTail.drawAt(xTail, yTail);
        aLegs.drawAt(xLegs, yLegs);

    }


    public void drawAt_random(int left, int bottom) {


        Drawing.pen().setColor(random_upper_body_color);
        this.drawAt(left, bottom);

    }


}


