package exam1;

public class Exam1 {
    public static void main(String[] args) {
        Car car = new SuperCar();
        car.setName("フェラーリ");
        car.putOnGus();
        car.run();

        car = new EcoCar();
        car.setName("プリウス");
        car.putOnGus();
        car.run();

    }
}
