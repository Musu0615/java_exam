import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        year = Integer.parseInt(scanner.nextLine());
        years(year);
        if(years(year)){
            System.out.println(year + "年はうるう年です");
        }
        else{
            System.out.println(year + "年は平年です");
        }
    }
    public static boolean years(int year){
        if(year % 4 == 0){
            return true;
        }
        else if(year % 4 == 0 && year % 100 == 0){
            return false;
        }
        else if(year % 400 == 0){
            return true;
        }
        else{
            return false;
        }
}
}   
