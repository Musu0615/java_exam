package exam1;
public class Car {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
         this.name = name;
     }

    public void putOnGus(){
        System.out.println(getName() + "に給油します");
    }

    public void run(){
        System.out.println("ブーン！車が走ります");
    }
}
