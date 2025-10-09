package SD_01_OPPS;

public class Inheritance {
    public static void main(String[] args) {

        ManualCar myManualCar = new ManualCar("TATA","Harrier");

        myManualCar.startEngine();
        myManualCar.shiftGear(1);
        myManualCar.accelerate();
        myManualCar.shiftGear(2);
        myManualCar.accelerate();
        myManualCar.brake();
        myManualCar.brake();
        myManualCar.stopEngine();


        System.out.println();
        System.out.println("---------------------------");

        //Electric car
        ElectricCar ev = new ElectricCar("Mahiendra","BE6",34);
        ev.startEngine();
        ev.accelerate();
        ev.accelerate();
        ev.brake();
        ev.brake();
        ev.stopEngine();
        ev.chargebattery();

    }
}
class Cars {

    protected   String brand;
    protected String model;
    private  boolean isEnginOn;
    private int currentSpeed;


    public Cars(String brand ,String model) {
        this.currentSpeed = 0;
        this.isEnginOn = false;
        this.model = model;
        this.brand = brand;
    }

   public void startEngine(){
        isEnginOn=true;
       System.out.println(brand + " " + model + " : Engine started.");
   }

   public void stopEngine(){
       isEnginOn=false;
       currentSpeed=0;
       System.out.println(brand + " " + model + " : Engine turned off!");
   }

   public void accelerate(){
        if(!isEnginOn){
            System.out.println(brand+" "+model+" : Can not accelerate Engine is Off!");
            return;
        }
        currentSpeed+=20;
       System.out.println(brand + " " + model + " : Accelerating to " + currentSpeed + " km/h");
   }

   public void brake(){
        currentSpeed -=20;
       if (currentSpeed < 0) currentSpeed = 0;
       System.out.println(brand + " " + model + " : Braking! Speed is now " + currentSpeed + " km/h");

   }

}


//Manual car
  class ManualCar extends Cars{

    private  int currentGear;

    public ManualCar(String brand, String model){
        super(brand,model);
        this.currentGear=0;
    }

    public void shiftGear(int gear){
        this.currentGear =gear;
        System.out.println(brand + " " + model + " : Shifted to gear"+ currentGear);
    }
}
//Electric Car...

 class ElectricCar extends  Cars{

    private int batteryLevel;

     public ElectricCar(String brand, String model, int batteryLevel) {
         super(brand, model);
         this.batteryLevel = batteryLevel;
     }

     public void chargebattery(){
         batteryLevel=100;
         System.out.println(brand +" "+model+" : Battery fully charged!");
     }
 }
