package Task2;

public class ElectricEngine extends  Engine {
    private double batteryCapacity;

    public ElectricEngine (double capacity){
        super(capacity);
        this.batteryCapacity =0;
    }

    public void brake(double brakeSpeed){
        this.batteryCapacity += (0.1 * brakeSpeed);
    }
}
