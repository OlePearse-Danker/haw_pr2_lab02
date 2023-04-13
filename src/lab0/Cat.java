package lab0;

public class Cat {

private Head aHead;
private Upper_body aUpper_body;

private Tail aTail;

private Legs aLegs;


public Cat() {
    aHead = new Head(100,100);
    aUpper_body = new Upper_body(300,100);
    aTail = new Tail(100, 100);
    aLegs = new Legs(20, 50);
}

public void drawAt(int left, int bottom) {

    aUpper_body.drawAt(left, bottom);
    aHead.drawAt(left, bottom);
    aTail.drawAt(left,bottom);
    aLegs.drawAt(left, bottom);
}

}
