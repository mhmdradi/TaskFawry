public class CarFactory {

    public static Car createCar(CarType type) {
        if (type==CarType.GASOLINE) {
            return new Car(new GasolineEngine());
        } else if (type==CarType.ELECTRIC) {
            return new Car(new ElectronicEngine());
        } else if (type==CarType.HYBRID) {
            return new Car(new HybridEngine());
        } else {
            throw new IllegalArgumentException("Unknown car type: " + type);
        }
    }
    public static void repalceEngine(Car car, CarType newType){
        if (newType==CarType.GASOLINE) {
            car.setEngine(new GasolineEngine());
        } else if (newType==CarType.ELECTRIC) {
            car.setEngine(new ElectronicEngine());
        } else if (newType==CarType.HYBRID) {
            car.setEngine(new HybridEngine());
        } else {
            throw new IllegalArgumentException("Unknown car type: " + newType);
        }
    }
}
