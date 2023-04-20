package Task2;

public class Vehicle {

    private double speed;
    private final String model;

    public Vehicle(final double speed, final String model){
        this.speed = 0.0;
        this.model = model;
    }

    public double accelerate (double acceleration){
        return speed += acceleration;
    }

    public double decelerate (double deceleration){
        if ((this.speed - deceleration) <0){
            return 0.0;
        }else{
            return this.speed -= deceleration;
        }
    }
    public String toString(){
        return "vehicle: "+ this.model+", speed: "+ this.speed;
    }
}
