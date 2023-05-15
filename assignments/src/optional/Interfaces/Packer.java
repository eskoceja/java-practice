package optional.Interfaces;

import javax.swing.*;

public class Packer {
    private Factory factory;

    public Packer() {
        this.factory = new Factory();
    }

    public Box giveABoxOFThings() {
        Box box = new Box(100);

        int i = 0;
//        while(i < 10) {
//            Packable newThing = factory.produceNew();
//            box.add(newThing);
//
//            i = i+1;
//        }
        return box;
    }
}
