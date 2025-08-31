package AlarmClock;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        AlarmClock alarmClock = new AlarmClock();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            new Thread(() -> {
                Alarm alarm = new Alarm(LocalDateTime.now().plusSeconds(index + 10), "Alarm " + index);
                alarmClock.pushAlarm(alarm);
            }).start();
        }
        try {
            while (true) {
                alarmClock.startAlarming();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }

    }
}
