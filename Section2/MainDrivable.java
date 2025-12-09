package Section2;
interface Drivable {
    void startEngine();
    void stopEngine();
}

class Car implements Drivable {
    public void startEngine() {
        System.out.println("Engine started");
    }

    public void stopEngine() {
        System.out.println("Engine stopped");
    }
}
public class MainDrivable{
    public static void main(String[] args) {
        Car c = new Car();
        c.startEngine();
        c.stopEngine();
    }
}