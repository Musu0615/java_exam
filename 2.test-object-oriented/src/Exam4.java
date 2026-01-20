public class Exam4 {
    public static void main(String[] args) {
        int add = Calculation.addition(5, 3);
        int sub = Calculation.subtraction(5, 3);
        int multi = Calculation.multiplication(5, 3);
        int div = Calculation.division(5, 3);
        int remain = Calculation.remainder(5, 3);

        System.out.println("足し算結果：" + add);
        System.out.println("引き算結果：" + sub);
        System.out.println("掛け算結果：" + multi);
        System.out.println("割り算結果：" + div);
        System.out.println("剰余算結果：" + remain);
    }
}
