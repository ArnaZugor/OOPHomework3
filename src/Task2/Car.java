package Task2;

public class Car extends Vehicle{
    private DieselEngine engine;

    public Car (String model, double capacity){
        super(0,model);
        this.engine = new DieselEngine(capacity);
    }
    @Override
    public double accelerate (double acceleration){
        double fuelConsumed = 0.2 * acceleration;
        if (fuelConsumed<= engine.getCapacity()){
            super.accelerate(acceleration);
            engine.decreaseCapacity(fuelConsumed);
        }
        return acceleration;
    }
    @Override
    public double decelerate (double deceleration){
        super.decelerate(deceleration);
        engine.increaseCapacity(0.1 * deceleration);
        return deceleration;
    }

    @Override
    public String toString() {
        return super.toString()+", capacity: "+engine.toString();
    }
}
