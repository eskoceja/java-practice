package HandlingExceptions.application;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----Testing StandardSensor-----");
        StandardSensor ten = new StandardSensor(10);
        StandardSensor minusFive = new StandardSensor(-5);

        System.out.println(ten.read());
        System.out.println(minusFive.read());

        System.out.println(ten.isOn());
        ten.setOff();
        System.out.println(ten.isOn());

        System.out.println("-----Testing TemperatureSensor-----");
        TemperatureSensor tempSens = new TemperatureSensor();
        tempSens.setOn(); //turn it on
        System.out.println("Sensor is on: " + tempSens.isOn());

        int temp = tempSens.read();
        System.out.println("Random temp: " + temp);

        tempSens.setOff();
        System.out.println("Sensor is on: " + tempSens.isOn());

//        temp = tempSens.read(); //does not work bc I turned it off ^


        System.out.println("-----Testing AverageSensor-----");
        Sensor kumpula = new TemperatureSensor();
        kumpula.setOn();
        System.out.println("temperature in Kumpula " + kumpula.read() + " degrees Celsius");

        Sensor kaisaniemi = new TemperatureSensor();
        Sensor helsinkiVantaaAirport = new TemperatureSensor();

        AverageSensor helsinkiRegion = new AverageSensor();
        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kaisaniemi);
        helsinkiRegion.addSensor(helsinkiVantaaAirport);

        helsinkiRegion.setOn();
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");

        System.out.println("readings: " + helsinkiRegion.readings());





    }
}
