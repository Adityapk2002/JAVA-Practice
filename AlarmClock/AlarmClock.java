package AlarmClock;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AlarmClock {
    private final List<Alarm> alarms = new ArrayList<>();
    private final int MAX_ALARMS = 5;

    public void pushAlarm(Alarm alarm) {
        synchronized (this) {
            while (alarms.size() == MAX_ALARMS) {
                try {
                    wait();
                } catch (Exception ex) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (alarm.getDateTime().isAfter(LocalDateTime.now())) {
                alarms.add(alarm);
                notifyAll();
            }
        }
    }

    public void startAlarming() {
        // this is eventloop which will loop alrams for each second
        synchronized (this) {
            while (alarms.isEmpty()) {
                try {
                    wait();
                } catch (Exception e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            Alarm alarm = alarms.remove(alarms.size() - 1);
            System.out.println("Alarm triggered : " + alarm.getReminder());
        }

    }
}
