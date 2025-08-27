package Example;

public class Car {
    private String Brand;
    private Engine engine;

    public Car(String Brand, int horsePower) {
        this.Brand = Brand;
        this.engine = new Engine(horsePower);
    }

    public void startCar() {
        System.out.println(Brand + " car is starting");
        engine.start();
    }
}
