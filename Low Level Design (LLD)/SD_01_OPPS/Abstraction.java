package SD_01_OPPS;

public class Abstraction {


    public static void main(String[] args) {
        Car myCar =new SportsCar("Ford","Mustang");

        myCar.startEngine();
        myCar.shiftGear(1);
        myCar.acclerate();
        myCar.shiftGear(2);
        myCar.acclerate();
        myCar.brake();
        myCar.stopEngine();
    }
}


interface Car{

    public  void startEngine();
    public  void shiftGear(int gear);
    public  void acclerate();
    public  void brake();
    public  void stopEngine();
}


class SportsCar implements Car{

    String brand;
    String model;
    boolean isEnginOn =false;
    int currentSpeed = 0;
    int currentGear =0;

    public SportsCar(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void startEngine() {
        isEnginOn =true;
        System.out.println(brand+" "+model+" Engine is off! Cannot shift Gear");
    }

    @Override
    public void shiftGear(int gear) {
        if(!isEnginOn){
            System.out.println(brand + " " + model + " : Engine is off! Cannot Cannot Shift Gear.");
            return;
        }
        this.currentGear=gear;
        System.out.println(brand + " " + model + " : Shifted to gear"+currentGear);

    }

    @Override
    public void acclerate() {
        if(!isEnginOn){
            System.out.println(brand + " " + model + " : Engine is off! Cannot  Acclerate.");

        }
        currentSpeed +=20;
        System.out.println(brand + " " + model + " : Accelarating to "+ currentSpeed+" km/h");
    }

    @Override
    public void brake() {
        currentSpeed =currentSpeed-20;
        if(currentSpeed<0) currentSpeed=0;

        System.out.println(brand + " " + model + " : Breaking! Speed is now  "+ currentSpeed+" km/h");

    }

    @Override
    public void stopEngine() {
        isEnginOn =false;
        currentGear=0;
        currentSpeed=0;
        System.out.println(brand+" "+model +" :Engine turned off!");
    }
}
