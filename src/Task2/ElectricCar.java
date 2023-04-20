package Task2;

public class ElectricCar extends Vehicle{
    private ElectricEngine engine;

    public ElectricCar (String model, double capacity){
        super(0,model);
        this.engine = new ElectricEngine(capacity);
    }
    @Override
    public double accelerate(double acceleration){
        double fuelConsumption = 0.4 * acceleration;
        if (engine.getCapacity() >=fuelConsumption){
            super.accelerate(acceleration);
            engine.decreaseCapacity(fuelConsumption);
        }
        return acceleration;
    }
    @Override
    public double decelerate(double deceleration){
        super.decelerate(deceleration);
        engine.brake(deceleration);
        return deceleration;
    }
    @Override
    public String toString(){
        return super.toString() + ", capacity: " + engine.toString();
    }
}

