import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter alarm hour (0-23): ");
        int hour = sc.nextInt();

        System.out.print("Enter alarm minute (0-59): ");
        int minute = sc.nextInt();

        System.out.println("Alarm set for " + hour + ":" + minute);

        while (true) {

            LocalTime now = LocalTime.now();

            if (now.getHour() == hour && now.getMinute() == minute) {
                System.out.println("⏰ ALARM! Wake up!");
                break;
            }

            try {
                Thread.sleep(1000); // check every 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        sc.close();
    }
}
