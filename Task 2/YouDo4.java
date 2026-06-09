
class Sensor{
    String name;
    int batteryLevel;
    void charge(){
        batteryLevel = 100;
        System.out.println("Sensor fully charged");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        sensor.name = "Temperature Sensor";
        sensor.batteryLevel= 50;
        sensor.charge();
        System.out.println("BatteryLevel: "+sensor.batteryLevel);
    }
}
