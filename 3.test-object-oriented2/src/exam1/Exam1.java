package exam1;

public class Exam1 {
    public static void main(String[] args) {
        Car car = new SuperCar();
        car.setName("フェラーリ");
        car.putOnGus();
        car.run();

        Car car2 = new EcoCar();
        car2.setName("プリウス");
        car2.putOnGus();
        car2.run();

    }
}
