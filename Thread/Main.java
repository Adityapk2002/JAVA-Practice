package Thread;

class Mythreads extends Thread {
    @Override
    public void run() {
        System.out.println("Downloading from thread : " + getName());
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Mythreads();
        t1.start();
    }
}
