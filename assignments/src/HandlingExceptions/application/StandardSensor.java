package HandlingExceptions.application;

/*A standard sensor is always on. Calling the methods setOn and setOff have no effect.
    The StandardSensor must have a constructor that takes one integer parameter.
    The method call read returns the number that was given to the constructor.*/
public class StandardSensor implements Sensor {
    private int value;

    public StandardSensor(int value) {
        this.value = value;
    }

    @Override
    public boolean isOn() {
        //is ALWAYS on
        return true;
    }

    @Override
    public void setOn() {
        //have no effect
    }

    @Override
    public void setOff() {
        //have no effect
    }

    @Override
    public int read() {
        //return num that was given to constructor
        return value;
    }
}
