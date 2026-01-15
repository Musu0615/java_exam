public class Exam3 {
    public static void main(String[] args) {
        int item1 = 200 * 3;
        int item2 = 250 * 4;
        int total1 = item1 + item2;
        double tax = total1 * 0.1;
        int total2 = total1 + (int)tax;

        System.out.println("小計\n" + total1 + "円");
        System.out.println("消費税\n" + (int)tax + "円");
        System.out.println("合計金額\n" + total2 + "円");
    }
}
