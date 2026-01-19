public class Exam6 {
    public static void main(String[] args) {
       System.out.println(calc(8, 4, '*')); 
    }
    static int calc(int num1, int num2, char str){
        int number = 0;
        if(str == '+'){
            number = num1 + num2;
            return number;
        }
        else if(str == '-'){
            number = num1 - num2;
            return number;
        }
        else if(str == '*'){
            number = num1 * num2;
            return number;
        }
        else if(str == '/'){
            number = num1 / num2;
            return number;
        }
        else{
            return -1;
        }
    }
}
