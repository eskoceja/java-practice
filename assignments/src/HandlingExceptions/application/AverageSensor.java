package HandlingExceptions.application;
//on when all sensors are on

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors; // you are added sensors - to a LIST
    private List<Integer> readings;

    //constructor non-parameterized
    public AverageSensor() {
        sensors = new ArrayList<>();
        readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        //used to add a new sensor for the average sensor to control.
        sensors.add(toAdd);
    }

    //checks if all sensors on by iterating through list
    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return !sensors.isEmpty();
    }

    //iterates through list and turns on
    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }

    }

    //iterates through list and turns off
    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }

    }

    /*returns the average of the read methods of its sensors
    (since the return value is int, the number is rounded down as is the case with integer division).
    If this method is called while the AverageSensor is off, or if no sensors have been added to it,
    the method should throw an IllegalStateException.*/
    @Override
    public int read() {
        if(!isOn() || sensors.isEmpty()) {
            throw new IllegalStateException("No sensors added");
        }

        int sum = 0;
        for(Sensor sensor: sensors) {
            int reading = sensor.read();
            readings.add(reading);
            sum += reading;
        }
        return sum / sensors.size(); //avg of the read methods of sensors
    }

    public List<Integer> readings() {
        //return results of all the executed readings
        return readings;
    }
}
