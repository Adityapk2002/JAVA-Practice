package Thread;

import java.io.FileNotFoundException;

public class RunnableImpl {
    private class RunnableImp implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()
                    + " , executing run() method");

            try {
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                System.out.println("Must catch here!");
                e.printStackTrace();
            }
            int r = 1 / 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Main thread is: " + Thread.currentThread().getName());
        Thread t1 = new Thread(new RunnableImpl().new RunnableImp());
        t1.start();
    }
}
