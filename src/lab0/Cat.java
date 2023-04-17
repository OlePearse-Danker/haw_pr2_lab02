package lab0;

public class Cat {

    private Head aHead;
    private Upper_body aUpper_body;


    public Cat() {
        aHead = new Head(100,100);
        aUpper_body = new Upper_body(300,100);
    }

public void drawAt(int left, int bottom) {

        int xUpper_body = left;
        int yUpper_body = bottom;

        int xHead = left;
        int yHead = bottom;

    aHead.drawAt(xHead, yHead);
    aUpper_body.drawAt(xUpper_body, yUpper_body);
}

}
