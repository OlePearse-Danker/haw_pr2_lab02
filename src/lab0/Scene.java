package lab0;

import java.awt.*;
import java.util.ArrayList;


public class Scene {

    private ArrayList<LocatedRectangle> cats; // Declare a private ArrayList called "cats"

    public Scene() {
        cats = new ArrayList<>(); // Initialize the "cats" ArrayList
        addCat(); // Add a cat to the scene
        addCat(); // Add a cat to the scene
        addCat(); // Add a cat to the scene


    }

    // Method to add a new cat to the scene
    public void addCat() {
        int width = 100;
        int height = 100;
        int x = RandomNumber.between(100, 800);
        int y = RandomNumber.between(100, 500);

        // Create a new Cat object with the random position and size
        Point point = new Point(x, y);
        Cat newCat = new BlueCat(point, width, height);

        boolean intersects = false;

        // Check if the new cat overlaps with any of the existing cats
        for (LocatedRectangle currentCat : this.cats) {
            if (newCat.intersects(currentCat)) {
                intersects = true;
                break;
            }
        }

        // If the new cat does not overlap with any existing cats, add it to the list
        if (!intersects) {
            cats.add(newCat);
        }
    }

    // Method to draw all the cats in the scene
    public void drawAt(int left, int bottom) {
        for (LocatedRectangle anObj : cats) {
            ((Cat) (anObj)).draw();
        }
    }

}








