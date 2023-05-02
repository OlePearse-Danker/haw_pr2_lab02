package lab0;

import java.awt.*;

//---------------------------------------------
// TASK 4
// The Cat class implements the LocatedRectangle interface, which means that it inherits the methods declared in the interface (address(), width(), and height())
// and must provide an implementation for them.
// Therefore, Cat is a subclass of LocatedRectangle, and LocatedRectangle is its superclass.

//---------------------------------------------

public class Cat implements LocatedRectangle{

    private Head aHead;
    private Upper_body aUpper_body;

    private Point address;


    public Cat(Point address, int width, int height) {

        this.address = address;
        aHead = new Head(width, height);
        aUpper_body = new Upper_body(width * 3, height);
    }

    public void draw() {
        int left = (int) address.getX();
        int bottom = (int) address.getY();
        drawAt(left, bottom);
    }
public void drawAt(int left, int bottom) {

        aHead.drawAt_random(left, bottom);
        aUpper_body.drawAt_random(left, bottom);
    }

    public Point address() {
        return address;
    }

    public int width() {
        return aUpper_body.width;
    }
    public int height() {
        return aHead.height + aUpper_body.height;
    }
}
