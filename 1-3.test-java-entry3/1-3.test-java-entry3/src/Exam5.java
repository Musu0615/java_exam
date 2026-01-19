public class Exam5 {
    public static void main(String[] args) {
        int sum = addition(5, 3);
        int sub = subtraction(5, 3);
        int multi = multiplication(5, 3);
        int div = division(5, 3);
        int remain = remainder(5, 3);

        System.out.println("足し算結果：" + sum);
        System.out.println("引き算結果：" + sub);
        System.out.println("掛け算結果：" + multi);
        System.out.println("割り算結果：" + div);
        System.out.println("剰余算結果：" + remain);
    }
    static int addition(int num1, int num2){
        int add = num1 + num2;
        return add;
    }
    static int subtraction(int num1, int num2){
        int sub = num1 - num2;
        return sub;
    }
    static int multiplication(int num1, int num2){
        int multi = num1 * num2;
        return multi;
    }
    static int division(int num1, int num2){
        int div = num1 / num2;
        return div;
    }
    static int remainder(int num1, int num2){
        int remain = num1 % num2;
        return remain;
    }
}
