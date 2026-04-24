public class Car {
   private Engine engine;
   private int currSpeed;
   private boolean isRunning;
    public Car(Engine engine){
        this.engine=engine;
    }
    public void setEngine(Engine engine){
        this.engine=engine;
    }
    public void start(){
        if (isRunning){
            System.out.println("Car is already running.");
            return;
        }
        engine.start();
        isRunning=true;
        currSpeed=0;
    }

    public void stop(){
        if (!isRunning){
            System.out.println("the car is already stopped.");
            return;
        }
        if (currSpeed!=0){
            System.out.println("Car is still moving. Please stop the car first.");
            return;
        }
        engine.stop();
        isRunning=false;
    }
    public void accelerate(){
        if (!isRunning){
            System.out.println("car is alraedy stopped. plaese start your car");
            return;
        }
        if (currSpeed<200){
            currSpeed+=20;
        engine.setSpeed(currSpeed);

        }else {
            System.out.println("you reached max speed.");
        }
    }
    public void brake(){
        if (!isRunning){
            System.out.println("car is alraedy stopped. plaese start your car");
            return;
        }
        if (currSpeed>0){
            currSpeed-=20;
            engine.setSpeed(currSpeed);
        }else {
            System.out.println("car stopped.");
        }


    }

}
