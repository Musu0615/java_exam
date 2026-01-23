import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exam6 {
    public static void main(String[] args) {
        LocalDateTime tokugawa = LocalDateTime.of(1543, 02, 10, 05, 12);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
        String birth = tokugawa.format(formatter1);
        System.out.println("徳川家康の誕生日は" +birth +"です");

        tokugawa = tokugawa.plusYears(1);
        tokugawa = tokugawa.plusMonths(2);
        tokugawa = tokugawa.plusDays(3);
        tokugawa = tokugawa.plusHours(4);
        tokugawa = tokugawa.plusMinutes(5);
        
        System.out.println("1年2ヶ月3日4時間5分後は" + tokugawa + "です");
    }
}
