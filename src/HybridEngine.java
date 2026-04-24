public class HybridEngine implements Engine{
    private GasolineEngine gasolineEngine;
    private ElectronicEngine electronicEngine;
    private boolean isElectricActive = true;

    public void setSpeed(int speed) {
        if (speed < 50) {
            if (!isElectricActive) { // لو الـ Gas كان شغال
                gasolineEngine.stop();
            }
            isElectricActive = true;
            electronicEngine.setSpeed(speed);
        } else {
            if (isElectricActive) { // لو الـ Electric كان شغال
                electronicEngine.stop();
                gasolineEngine.start();

            }
            isElectricActive = false;
            gasolineEngine.setSpeed(speed);
        }
    }
    public HybridEngine() {
        this.gasolineEngine = new GasolineEngine();
        this.electronicEngine = new ElectronicEngine();
    }

    @Override
    public void start() {
        electronicEngine.start();
    }

    @Override
    public void stop() {
        if (isElectricActive) {
            electronicEngine.stop();
        } else {
            gasolineEngine.stop();
        }
    }

    @Override
    public void increase() {
        if (isElectricActive) {
            electronicEngine.increase();
        } else {
            gasolineEngine.increase();
        }

    }

    @Override
    public void decrease() {
        if (isElectricActive) {
            electronicEngine.decrease();
        } else {
            gasolineEngine.decrease();
        }

    }
}
