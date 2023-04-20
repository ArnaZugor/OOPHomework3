package Task2;

public class Engine {
    private double capacity;

    public Engine (final double capacity){
        this.capacity = capacity;
    }

    public double getCapacity() {
        return this.capacity;
    }
    public double increaseCapacity (double increaseValue){
        return capacity += increaseValue;
    }
    public double decreaseCapacity (double decreaseValue){
        return capacity -= decreaseValue;
    }
    public String toString(){
        return "capacity: "+this.capacity;
    }
}
