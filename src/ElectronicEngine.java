public class ElectronicEngine implements Engine{
 private int speed;
   @Override
   public void setSpeed(int NewSpeed) {
       while (this.speed<NewSpeed){
           increase();
       }
       while (this.speed>NewSpeed){
           decrease();
       }
       System.out.println("Electric engine running at: " + this.speed + " km/h");

   }

    @Override
    public void start() {
        System.out.println("Electric engine started.");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stopped.");
    }
    @Override
    public void increase() {
        this.speed++;
    }

    @Override
    public void decrease() {
        this.speed--;
    }
}
