package models.com.fawry.carproject.engine;

public class HybridEngine extends Engine {
    private final ElectricEngine electricEngine;
    private final GasEngine gasEngine;

    public HybridEngine() {
        super(0);
        this.electricEngine = new ElectricEngine(0);
        this.gasEngine = new GasEngine(0);
    }

    @Override
    public void onSpeedChange(int speed) {
        super.setEngineSpeed(speed);
        if (speed < 50) {
            gasEngine.setEngineSpeed(0);
            electricEngine.setEngineSpeed(speed);
            System.out.println("Electric Engine is working");
        } else {
            gasEngine.setEngineSpeed(speed);
            electricEngine.setEngineSpeed(0);
            System.out.println("Gas Engine is working");
        }
    }
}
