package Task2;

public class Task2Main {
    public static void main(String[] args) {

        Car car = new Car("Ford", 800);
        System.out.println(car.toString());

        car.accelerate(20);
        car.accelerate(10);
        System.out.println(car.toString());

        car.decelerate(5);
        System.out.println(car.toString());


        ElectricCar electricCar = new ElectricCar("Volvo", 1000);
        System.out.println(electricCar.toString());

        electricCar.accelerate(60);
        System.out.println(electricCar.toString());

        electricCar.decelerate(40);
        System.out.println(electricCar.toString());

    }
}
