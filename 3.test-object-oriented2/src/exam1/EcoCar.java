package exam1;
public class EcoCar extends Car{

    EcoCar(){
    }
    
    @Override
        public void run(){
            System.out.println("シーン！" + getName() + "が走ります");
        } 

}
