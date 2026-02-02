import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        year = Integer.parseInt(scanner.nextLine());
        if(year >= 1901 && year <= 2000){
            System.out.println(year + "年は20世紀です");
        }
        else{
            System.out.println(year + "年は21世紀です");
        }
    }
}
