import java.time.LocalDateTime;

public class Exam4 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2016, 07, 15, 9, 25, 02, 235);
        int year = localDateTime.getYear();
        int month = localDateTime.getMonthValue();
        int day = localDateTime.getDayOfMonth();
        int hour = localDateTime.getHour();
        int minitue = localDateTime.getMinute();
        int second = localDateTime.getSecond();
        int nano = localDateTime.getNano();

        System.out.println(year + "-" + month + "-" +day + "-"+hour +"：" + minitue + "：" + second + "." + nano);
    }
}
