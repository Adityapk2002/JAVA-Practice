package Thread;

class RestaurantOrder implements Runnable {
    private String orderName;

    public RestaurantOrder(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is preparing order");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finished the order");
    }
}

public class Example {
    public static void main(String[] args) {
        System.out.println("Restaurant is open");
        RestaurantOrder order1 = new RestaurantOrder("Pizza");
        RestaurantOrder order2 = new RestaurantOrder("Momos");
        RestaurantOrder order3 = new RestaurantOrder("Burger");

        Thread worker1 = new Thread(order1, "Worker-1");
        Thread worker2 = new Thread(order2, "Worker-2");
        Thread worker3 = new Thread(order3, "Worker-3");

        worker1.start();
        worker2.start();
        worker3.start();

        System.out.println("All orders are prepared");

    }
}
