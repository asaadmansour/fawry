package models.com.fawry.carproject.engine;

public abstract class Engine implements EngineObserver {
    protected Integer engineSpeed;
    public Engine(Integer engineSpeed) {
        this.engineSpeed = engineSpeed;
    }
    public void increase() {
        engineSpeed += 1;
        System.out.println("Engine speed increased by 1");
    }
    public void decrease() {
        engineSpeed -= 1;
        System.out.println("Engine speed decreased by 1");
    }

    public Integer getEngineSpeed() {
        return engineSpeed;
    }

    public void setEngineSpeed(Integer engineSpeed) {
        this.engineSpeed = engineSpeed;
    }
    public void onSpeedChange(int speed) {
        setEngineSpeed(speed);
    }
}
