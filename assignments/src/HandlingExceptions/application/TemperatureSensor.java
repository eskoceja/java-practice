package HandlingExceptions.application;

import java.util.Random;

public class TemperatureSensor implements Sensor{
    private boolean on;

    public TemperatureSensor() {
        this.on = false; //off at first
    }
    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void setOn() {
        on = true; //true to turn on
    }

    @Override
    public void setOff() {
        on = false; //false to turn off
    }

    /* When the method read is called and the sensor is on,
the sensor randomly chooses an integer in the range -30...30 and returns it.
If the sensor is off, the method read throws an IllegalStateException.

Use the ready-made Java class Random to choose the random number. You'll get an integer in the range 0...60
by calling new Random().nextInt(61); — to get a random integer in the range -30...30 you'll have to subtract
a suitable number from the random number in the range 0...60.*/
    @Override
    public int read() {

        if(!on) {
            throw new IllegalStateException("Sensor is off!");
        }

        Random random = new Random();
        int number = random.nextInt(61) -30;

        return number;
    }
}
