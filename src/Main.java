public class Main {
    public static void main(String[] args) {
        Car car1 = CarFactory.createCar(CarType.GASOLINE);
        car1.start();
        car1.accelerate();
        car1.accelerate();
        car1.brake();
        car1.brake();
        car1.stop();

        Car car2 = CarFactory.createCar(CarType.ELECTRIC);
        car2.start();
        car2.accelerate();
        car2.brake();
        car2.stop();

        Car car3 = CarFactory.createCar(CarType.HYBRID);
        car3.start();
        car3.accelerate();
        car3.accelerate();
        car3.accelerate();
        car3.brake();
        car3.brake();
        car3.brake();
        car3.stop();




        CarFactory.repalceEngine(car1, CarType.ELECTRIC);
        car1.start();
        car1.accelerate();
        car1.accelerate();
        car1.brake();
        car1.brake();
        car1.stop();
    }
}
