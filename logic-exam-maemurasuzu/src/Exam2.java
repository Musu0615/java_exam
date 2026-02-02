import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Exam2 {

    public static void main(String[] args) {
        String date1 = null;
        // String date2 = null;
        LocalTime localTime1 = LocalTime.of(11, 59, 59);
        DateTimeFormatter formatter1= DateTimeFormatter.ofPattern("HH時mm分ss秒");
        date1 = localTime1.format(formatter1);
        localTime1.plusSeconds(1);
        // LocalTime localTime2 = LocalTime.of(23, 59, 59);
        // DateTimeFormatter formatter2= DateTimeFormatter.ofPattern("hh時mm分ss秒");
		// localTime2.plusSeconds(1);
        // date2 = localTime1.format(formatter2);
        System.out.println("11時59分59秒の 1 秒後は" + date1 + "です");
        // System.out.println("23時59分59秒の 1 秒後は" + date2 + "です");
    }
}
