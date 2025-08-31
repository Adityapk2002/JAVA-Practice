package Thread;

public class Message {
    private String message;
    private boolean empty = true;

    public synchronized void put(String msg) {
        while (!empty) { // if previous message is not consumed
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        message = msg;
        empty = false;
        notifyAll();
    }

    public synchronized String get() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        empty = true;
        notifyAll();
        return message;
    }
}

class SenderReceiverSync {
    public static void main(String[] args) {
        Message m = new Message();

        Thread sender = new Thread(() -> {
            String[] msgs = { "Hi", "Hello", "How are you?", "I’m fine", "Bye" };
            for (String s : msgs) {
                m.put(s);
                System.out.println("Sent: " + s);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        });

        Thread receiver = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                String msg = m.get();
                System.out.println("Received: " + msg);
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                }
            }
        });

        sender.start();
        receiver.start();
    }
}
