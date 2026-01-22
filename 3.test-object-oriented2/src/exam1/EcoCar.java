package exam1;
public class EcoCar extends Car{
        EcoCar ecoCar = new EcoCar();

        @Override
        public void run(){
            System.out.println("シーン！" + ecoCar.getName() + "が走ります");
        } 
}
