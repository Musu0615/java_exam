import java.time.LocalDate;

public class Exam5 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2001, 01, 14);
        int year = birthday.getYear();
        int month = birthday.getMonthValue();
        int date = birthday.getDayOfMonth();
        System.out.println("私の誕生日は" + year + "年" + month +"月" + date + "日です");
    }
}
