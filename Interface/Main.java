package Interface;

interface Vehicle {
    void start();

    void stop();
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike start");
    }

    public void stop() {
        System.out.println("Bike stopped");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car start");
    }

    public void stop() {
        System.out.println("Car stopped");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Bike();
        v1.start();
        v1.stop();

        Vehicle v2 = new Car();
        v2.start();
        v2.stop();
    }
}
