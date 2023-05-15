package lab0;

import java.awt.*;

//---------------------------------------------
// TASK 4
// The Cat class implements the LocatedRectangle interface, which means that it inherits the methods declared in the interface (address(), width(), and height())
// and must provide an implementation for them.
// Therefore, Cat is a subclass of LocatedRectangle, and LocatedRectangle is its superclass.

//---------------------------------------------

/*      The code is a Java class that implements the LocatedRectangle interface.
        1. The class has two instance variables, `aHead` and `aUpper_body`, which are both composite objects.
        2. It also has an `address` instance variable which is of type Point.
        3. The constructor takes in an address, width, and height and sets the `address` instance variable, and creates `aHead` and `aUpper_body` with the given width and height.
        4. The `draw()` method takes the address and passes it to the `drawAt()` method.
        5. The `drawAt()` method takes the left and bottom coordinates and passes them to the `drawAt_random()` methods of `aHead` and `aUpper_body`.
        6. The `address()`, `width()`, and `height()` methods are implemented from the LocatedRectangle interface and return the address, width, and height of the Cat.*/

public class Cat implements LocatedRectangle{


    private Head aHead; // composite
    private Upper_body aUpper_body; // composite

    public Point address; //


    public Cat(Point address) {
        this(address, 100, 100);
    }

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

