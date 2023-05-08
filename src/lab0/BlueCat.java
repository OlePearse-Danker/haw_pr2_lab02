package lab0;

import java.awt.*;

public class BlueCat extends Cat {

    private Color furColor; // additional property for blue color

    public BlueCat(Point address) {
        this(address, 100, 100);
    }

    public BlueCat(Point address, int width, int height) {
        super(address, width, height);
        furColor = Color.BLUE; // set the color of the fur to blue
    }

}


