package homework;

public class Runner {
    public static void main(String[] args) {
        AirTransport at = new AirTransport();
        at.print();

        Car car = new Car();
        car.printDistance(10);
        car.printDistance(15);
    }
}
